#!/usr/bin/env python3
"""Generate HTML books (one per topic) from the Java files in ../practice."""
import html
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parent
PRACTICE = ROOT.parent / "practice"
NOTES = ROOT / "notes"  # optional per-problem notes: notes/<problem-number>.json

KEYS = ("Description", "Example input", "Example output")
DIFFS = ("easy", "medium", "hard")


def parse(path):
    lines = path.read_text().splitlines()
    problems, comments = [], []
    i = 0
    while i < len(lines):
        s = lines[i].strip()
        if s.startswith("//"):
            comments.append(s[2:].strip())
        elif s.startswith("public static") and not s.startswith("public static void main"):
            depth, j, body = 0, i, []
            while j < len(lines):
                body.append(lines[j])
                depth += lines[j].count("{") - lines[j].count("}")
                if depth <= 0 and "{" in "".join(body):
                    break
                j += 1
            p = {"sig": s.rstrip("{").strip(), "code": "\n".join(body), "diff": "",
                 "num": "", "title": s, "Description": "", "Example input": "", "Example output": ""}
            key = None
            for c in comments:
                if c.lower() in DIFFS:
                    p["diff"] = c.lower()
                    continue
                m = re.match(r"^(\d+)\.\s*(.*)$", c)
                if m and not p["num"]:
                    p["num"], p["title"] = m.group(1), m.group(2)
                    continue
                m = re.match(r"^(Description|Example input|Example output)\s*:\s*(.*)$", c)
                if m:
                    key = m.group(1)
                    p[key] = m.group(2)
                elif key and c:
                    p[key] += ("\n" if key == "Example output" else " ") + c
            if p["num"]:
                problems.append(p)
            comments = []
            i = j
        elif s:
            comments = []
        i += 1
    return problems


def is_stub(code):
    return "// code" in code


CSS = """
*{box-sizing:border-box}body{margin:0;font-family:Segoe UI,Arial,sans-serif;background:#f5f7fb;color:#1f2937}
header{background:#111827;color:#fff;padding:24px 40px}header a{color:#93c5fd;text-decoration:none}
header h1{margin:8px 0 0}main{max-width:1200px;margin:0 auto;padding:24px 40px}
nav.toc{background:#fff;border-radius:8px;padding:16px 24px;margin-bottom:32px;columns:2}
nav.toc a{display:block;color:#1d4ed8;text-decoration:none;padding:2px 0;break-inside:avoid}
section.problem{background:#fff;border-radius:8px;padding:28px 32px;margin-bottom:32px;box-shadow:0 1px 3px rgba(0,0,0,.08)}
section.problem>h2{margin:0 0 20px;padding-bottom:12px;border-bottom:2px solid #1e293b;font-size:24px}
.badge{font-size:12px;padding:2px 10px;border-radius:12px;margin-left:10px;color:#fff;vertical-align:middle}
.easy{background:#16a34a}.medium{background:#d97706}.hard{background:#dc2626}
.cols{display:grid;grid-template-columns:1fr 1fr;gap:32px}@media(max-width:900px){.cols{grid-template-columns:1fr}}
.card{border-left:4px solid #94a3b8;background:#f8fafc;padding:12px 18px;margin-bottom:18px;border-radius:0 6px 6px 0}
.card.q{border-color:#64748b}.card.b{border-color:#f97316}.card.o{border-color:#2563eb}.card.w{border-color:#16a34a}
.card h3{margin:0 0 6px;font-size:16px}.card p{margin:0;color:#475569}
.card .ex{font-family:Consolas,monospace;font-size:13px;color:#334155;margin-top:6px}
.right h3{color:#2563eb;font-size:18px;margin:0 0 10px}
pre{background:#0f172a;color:#e2e8f0;padding:16px;border-radius:8px;overflow:auto;font-size:13px;line-height:1.5;margin:0 0 20px}
.todo{color:#94a3b8;font-style:italic}.steps{color:#475569}.steps ol{margin:0;padding-left:22px}
.card pre.out{background:none;color:#334155;padding:0;margin:2px 0 0;font-size:13px;display:inline-block;vertical-align:top}
"""


def esc(t):
    return html.escape(t)


_notes = None


def load_notes():
    """Parse notes/*.txt: '=== <num>' blocks with brute/opt/why/expl lines and a code: section."""
    out = {}
    for f in sorted(NOTES.glob("*.txt")):
        cur, in_code = None, False
        for line in f.read_text().splitlines():
            if line.startswith("=== "):
                cur, in_code = out.setdefault(line[4:].strip(), {"code": []}), False
            elif cur is None:
                continue
            elif in_code:
                cur["code"].append(line)
            elif line.strip() == "code:":
                in_code = True
            else:
                m = re.match(r"^(brute|opt|why|expl):\s*(.*)$", line)
                if m:
                    cur[m.group(1)] = m.group(2)
    for v in out.values():
        v["code"] = "\n".join(v["code"]).strip("\n")
    return out


def note(num, field):
    global _notes
    if _notes is None:
        _notes = load_notes()
    return _notes.get(num, {}).get(field, "")


def card(cls, title, text):
    body = esc(text) if text else '<span class="todo">Add your notes here.</span>'
    return f'<div class="card {cls}"><h3>{title}</h3><p>{body}</p></div>'


def render_problem(p):
    n = p["num"]
    badge = f'<span class="badge {p["diff"]}">{p["diff"]}</span>' if p["diff"] else ""
    example = ""
    if p["Example input"] or p["Example output"]:
        example = (f'<div class="ex">Input: {esc(p["Example input"])}<br>'
                   f'Output:<pre class="out">{esc(p["Example output"])}</pre></div>')
    q = (f'<div class="card q"><h3>Question Statement</h3><p>{esc(p["Description"])}</p>{example}</div>')
    code = note(n, "code") or (p["code"] if not is_stub(p["code"]) else p["sig"] + " {\n    // TODO: implement\n}")
    steps = [s.strip() for s in note(n, "expl").split(" | ") if s.strip()]
    expl = ('<ol>' + "".join(f"<li>{esc(s)}</li>" for s in steps) + '</ol>') if steps else '<span class="todo">Add your notes here.</span>'
    return f'''<section class="problem" id="p{n}">
<h2>Problem {n}: {esc(p["title"])}{badge}</h2>
<div class="cols">
<div class="left">{q}
{card("b", "Brute force", note(n, "brute"))}
{card("o", "Optimized idea", note(n, "opt"))}
{card("w", "Why it works", note(n, "why"))}</div>
<div class="right"><h3>Java implementation</h3><pre><code>{esc(code)}</code></pre>
<h3>Explanation</h3><div class="steps">{expl}</div></div>
</div></section>'''


def page(title, body, back=True):
    nav = '<a href="index.html">&larr; All topics</a>' if back else ""
    return (f'<!DOCTYPE html><html lang="en"><head><meta charset="utf-8">'
            f'<meta name="viewport" content="width=device-width,initial-scale=1">'
            f'<title>{esc(title)}</title><style>{CSS}</style></head><body>'
            f'<header>{nav}<h1>{esc(title)}</h1></header><main>{body}</main></body></html>')


def main():
    topics = []
    for d in sorted(PRACTICE.iterdir()):
        if not d.is_dir():
            continue
        for jf in d.glob("*.java"):
            problems = parse(jf)
            name = d.name.split("_", 1)[1] if "_" in d.name else d.name
            name = re.sub(r"(?<=[a-z])(?=[A-Z])", " ", name)
            fname = f"{d.name}.html"
            toc = "".join(f'<a href="#p{p["num"]}">{p["num"]}. {esc(p["title"])}</a>' for p in problems)
            body = f'<nav class="toc">{toc}</nav>' + "".join(render_problem(p) for p in problems)
            (ROOT / fname).write_text(page(f"{d.name[:2]} - {name}", body))
            topics.append((fname, d.name[:2], name, len(problems)))
    items = "".join(f'<a href="{f}">{n}. {esc(t)} ({c} problems)</a>' for f, n, t, c in topics)
    (ROOT / "index.html").write_text(page("DSA Handbook", f'<nav class="toc">{items}</nav>', back=False))
    print(f"Generated {len(topics)} topic pages, {sum(t[3] for t in topics)} problems")


if __name__ == "__main__":
    main()
