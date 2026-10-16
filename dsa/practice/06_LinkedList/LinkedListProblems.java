import java.util.*;

public class LinkedListProblems {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 143. Introduction: Construct LL from Array
    // Description: Build linked list.
    // Example input : arr=[1,2,3]
    // Example output: 1->2->3
    public static Node constructLL(int[] arr) {
        // code
        return null;
    }

    // easy
    // 144. Length of Linked List
    // Description: Count nodes.
    // Example input : head=1->2->3
    // Example output: 3
    public static int length(Node head) {
        // code
        return 0;
    }

    // easy
    // 145. Search in Linked List
    // Description: Check if x exists.
    // Example input : head=1->2->3, x=2
    // Example output: true
    public static boolean searchLL(Node head, int x) {
        // code
        return false;
    }

    // easy
    // 146. Delete Head of Linked List
    // Description: Remove first node.
    // Example input : head=1->2->3
    // Example output: 2->3
    public static Node deleteHead(Node head) {
        // code
        return null;
    }

    // easy
    // 147. Delete Tail of Linked List
    // Description: Remove last node.
    // Example input : head=1->2->3
    // Example output: 1->2
    public static Node deleteTail(Node head) {
        // code
        return null;
    }

    // easy
    // 148. Delete K-th Node
    // Description: Remove node at 1-indexed position k.
    // Example input : head=1->2->3, k=2
    // Example output: 1->3
    public static Node deleteKth(Node head, int k) {
        // code
        return null;
    }

    // easy
    // 149. Delete Node with Value X
    // Description: Remove first node holding x.
    // Example input : head=1->2->3, x=2
    // Example output: 1->3
    public static Node deleteValue(Node head, int x) {
        // code
        return null;
    }

    // easy
    // 150. Insert at Head
    // Description: Insert new node at head.
    // Example input : head=2->3, val=1
    // Example output: 1->2->3
    public static Node insertHead(Node head, int val) {
        // code
        return null;
    }

    // easy
    // 151. Insert at Tail
    // Description: Insert at end.
    // Example input : head=1->2, val=3
    // Example output: 1->2->3
    public static Node insertTail(Node head, int val) {
        // code
        return null;
    }

    // easy
    // 152. Insert at K-th Position
    // Description: Insert so new node is at position k.
    // Example input : head=1->3, k=2, val=2
    // Example output: 1->2->3
    public static Node insertKth(Node head, int k, int val) {
        // code
        return null;
    }

    // easy
    // 153. Construct DLL from Array
    // Description: Build doubly linked list.
    // Example input : arr=[1,2,3]
    // Example output: 1<->2<->3
    public static DNode constructDLL(int[] arr) {
        // code
        return null;
    }

    // easy
    // 154. Insert Node Before Head (DLL)
    // Description: Insert at head.
    // Example input : head=2<->3, val=1
    // Example output: 1<->2<->3
    public static DNode insertBeforeHead(DNode head, int val) {
        // code
        return null;
    }

    // easy
    // 155. Delete Head of DLL
    // Description: Remove first node.
    // Example input : head=1<->2<->3
    // Example output: 2<->3
    public static DNode deleteHeadDLL(DNode head) {
        // code
        return null;
    }

    // easy
    // 156. Delete Tail of DLL
    // Description: Remove last node.
    // Example input : head=1<->2<->3
    // Example output: 1<->2
    public static DNode deleteTailDLL(DNode head) {
        // code
        return null;
    }

    // easy
    // 157. Delete K-th Node of DLL
    // Description: Remove k-th node.
    // Example input : head=1<->2<->3, k=2
    // Example output: 1<->3
    public static DNode deleteKthDLL(DNode head, int k) {
        // code
        return null;
    }

    // easy
    // 158. Reverse a DLL
    // Description: Reverse the list.
    // Example input : head=1<->2<->3
    // Example output: 3<->2<->1
    public static DNode reverseDLL(DNode head) {
        // code
        return null;
    }

    // easy
    // 159. Middle of Linked List
    // Description: Return middle node (second if even).
    // Example input : head=1->2->3->4->5
    // Example output: 3->4->5
    public static Node middleNode(Node head) {
        // code
        return null;
    }

    // easy
    // 160. Reverse Linked List (Iterative)
    // Description: Reverse list.
    // Example input : head=1->2->3
    // Example output: 3->2->1
    public static Node reverseIterative(Node head) {
        // code
        return null;
    }

    // easy
    // 161. Reverse Linked List (Recursive)
    // Description: Reverse list using recursion.
    // Example input : head=1->2->3
    // Example output: 3->2->1
    public static Node reverseRecursive(Node head) {
        // code
        return null;
    }

    // easy
    // 162. Detect a Loop
    // Description: True if there is a cycle.
    // Example input : head=3->2->0->-4->(back to 2)
    // Example output: true
    public static boolean hasCycle(Node head) {
        // code
        return false;
    }

    // easy
    // 163. Check if Linked List is Palindrome
    // Description: Check palindrome.
    // Example input : head=1->2->2->1
    // Example output: true
    public static boolean isPalindromeLL(Node head) {
        // code
        return false;
    }

    // easy
    // 164. Sort a List of 0s, 1s and 2s
    // Description: Sort list of 0/1/2.
    // Example input : head=1->0->2->1
    // Example output: 0->1->1->2
    public static Node sortZeroOneTwo(Node head) {
        // code
        return null;
    }

    // easy
    // 165. Add 1 to a Number Represented by LL
    // Description: Digits in list, add one.
    // Example input : head=1->2->9
    // Example output: 1->3->0
    public static Node addOne(Node head) {
        // code
        return null;
    }

    // medium
    // 166. Delete All Occurrences of Key in DLL
    // Description: Remove every node with key.
    // Example input : head=1<->2<->1<->3, key=1
    // Example output: 2<->3
    public static DNode deleteAllOccurrences(DNode head, int key) {
        // code
        return null;
    }

    // medium
    // 167. Find Pairs with Given Sum in Sorted DLL
    // Description: All pairs summing to target.
    // Example input : head=1<->2<->4<->5<->6<->8<->9, target=7
    // Example output: [[1,6],[2,5]]
    public static List<int[]> findPairsDLL(DNode head, int target) {
        // code
        return null;
    }

    // medium
    // 168. Remove Duplicates from Sorted DLL
    // Description: Remove duplicate nodes.
    // Example input : head=1<->1<->2<->3<->3
    // Example output: 1<->2<->3
    public static DNode removeDuplicatesDLL(DNode head) {
        // code
        return null;
    }

    // medium
    // 169. Find Starting Point of Loop
    // Description: Return node where cycle begins.
    // Example input : head=3->2->0->-4->(back to 2)
    // Example output: node 2
    public static Node detectCycle(Node head) {
        // code
        return null;
    }

    // medium
    // 170. Length of Loop
    // Description: Length of the cycle, 0 if none.
    // Example input : head=3->2->0->-4->(back to 2)
    // Example output: 3
    public static int loopLength(Node head) {
        // code
        return 0;
    }

    // medium
    // 171. Segregate Odd and Even Indexed Nodes
    // Description: Group odd-indexed nodes then even.
    // Example input : head=1->2->3->4->5
    // Example output: 1->3->5->2->4
    public static Node oddEvenList(Node head) {
        // code
        return null;
    }

    // medium
    // 172. Remove N-th Node from End
    // Description: Delete n-th node from end.
    // Example input : head=1->2->3->4->5, n=2
    // Example output: 1->2->3->5
    public static Node removeNthFromEnd(Node head, int n) {
        // code
        return null;
    }

    // medium
    // 173. Delete Middle Node
    // Description: Delete the middle node.
    // Example input : head=1->2->3->4->5
    // Example output: 1->2->4->5
    public static Node deleteMiddle(Node head) {
        // code
        return null;
    }

    // medium
    // 174. Sort Linked List
    // Description: Sort using merge sort.
    // Example input : head=4->2->1->3
    // Example output: 1->2->3->4
    public static Node sortList(Node head) {
        // code
        return null;
    }

    // medium
    // 175. Intersection of Two Linked Lists
    // Description: Return intersecting node.
    // Example input : a=4->1->8->4->5, b=5->6->1->8->4->5
    // Example output: node 8
    public static Node getIntersectionNode(Node a, Node b) {
        // code
        return null;
    }

    // medium
    // 176. Add Two Numbers
    // Description: Digits stored in reverse order.
    // Example input : a=2->4->3, b=5->6->4
    // Example output: 7->0->8
    public static Node addTwoNumbers(Node a, Node b) {
        // code
        return null;
    }

    // medium
    // 177. Rotate List
    // Description: Rotate right by k places.
    // Example input : head=1->2->3->4->5, k=2
    // Example output: 4->5->1->2->3
    public static Node rotateRight(Node head, int k) {
        // code
        return null;
    }

    // hard
    // 178. Reverse Nodes in K-Group
    // Description: Reverse every k nodes.
    // Example input : head=1->2->3->4->5, k=2
    // Example output: 2->1->4->3->5
    public static Node reverseKGroup(Node head, int k) {
        // code
        return null;
    }

    // hard
    // 179. Flatten a Linked List
    // Description: Each node has next and bottom (sorted); flatten via bottom.
    // Example input : 5->10->19->28 with bottoms
    // Example output: sorted bottom chain
    public static Node flatten(Node head) {
        // code
        return null;
    }

    // hard
    // 180. Copy List with Random Pointer
    // Description: Deep copy list with random pointers.
    // Example input : head=[[7,null],[13,0],[11,4]]
    // Example output: deep copy
    public static Node copyRandomList(Node head) {
        // code
        return null;
    }

    static Node L(int... v) {
        Node d = new Node(0), t = d;
        for (int x : v) { t.next = new Node(x); t = t.next; }
        return d.next;
    }

    static DNode D(int... v) {
        DNode d = new DNode(0), t = d;
        for (int x : v) { DNode n = new DNode(x); t.next = n; n.prev = t; t = n; }
        DNode h = d.next;
        if (h != null) h.prev = null;
        return h;
    }

    static String s(Node h) {
        if (h == null) return "null";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; h != null && i < 100; h = h.next, i++) sb.append(sb.length() > 0 ? "->" : "").append(h.val);
        return sb.toString();
    }

    static String sd(DNode h) {
        if (h == null) return "null";
        StringBuilder sb = new StringBuilder();
        for (; h != null; h = h.next) sb.append(sb.length() > 0 ? "<->" : "").append(h.val);
        return sb.toString();
    }

    static Node cyclic() {
        Node h = L(3, 2, 0, -4), t = h;
        while (t.next != null) t = t.next;
        t.next = h.next;
        return h;
    }

    public static void main(String[] args) {
        System.out.println(s(constructLL(new int[]{1, 2, 3})));
        System.out.println(length(L(1, 2, 3)));
        System.out.println(searchLL(L(1, 2, 3), 2));
        System.out.println(s(deleteHead(L(1, 2, 3))));
        System.out.println(s(deleteTail(L(1, 2, 3))));
        System.out.println(s(deleteKth(L(1, 2, 3), 2)));
        System.out.println(s(deleteValue(L(1, 2, 3), 2)));
        System.out.println(s(insertHead(L(2, 3), 1)));
        System.out.println(s(insertTail(L(1, 2), 3)));
        System.out.println(s(insertKth(L(1, 3), 2, 2)));
        System.out.println(sd(constructDLL(new int[]{1, 2, 3})));
        System.out.println(sd(insertBeforeHead(D(2, 3), 1)));
        System.out.println(sd(deleteHeadDLL(D(1, 2, 3))));
        System.out.println(sd(deleteTailDLL(D(1, 2, 3))));
        System.out.println(sd(deleteKthDLL(D(1, 2, 3), 2)));
        System.out.println(sd(reverseDLL(D(1, 2, 3))));
        System.out.println(s(middleNode(L(1, 2, 3, 4, 5))));
        System.out.println(s(reverseIterative(L(1, 2, 3))));
        System.out.println(s(reverseRecursive(L(1, 2, 3))));
        System.out.println(hasCycle(cyclic()));
        System.out.println(isPalindromeLL(L(1, 2, 2, 1)));
        System.out.println(s(sortZeroOneTwo(L(1, 0, 2, 1))));
        System.out.println(s(addOne(L(1, 2, 9))));
        System.out.println(sd(deleteAllOccurrences(D(1, 2, 1, 3), 1)));
        for (int[] p : findPairsDLL(D(1, 2, 4, 5, 6, 8, 9), 7) == null ? new ArrayList<int[]>() : findPairsDLL(D(1, 2, 4, 5, 6, 8, 9), 7))
            System.out.println(Arrays.toString(p));
        System.out.println(sd(removeDuplicatesDLL(D(1, 1, 2, 3, 3))));
        Node c = detectCycle(cyclic());
        System.out.println(c == null ? "null" : c.val);
        System.out.println(loopLength(cyclic()));
        System.out.println(s(oddEvenList(L(1, 2, 3, 4, 5))));
        System.out.println(s(removeNthFromEnd(L(1, 2, 3, 4, 5), 2)));
        System.out.println(s(deleteMiddle(L(1, 2, 3, 4, 5))));
        System.out.println(s(sortList(L(4, 2, 1, 3))));
        Node common = L(8, 4, 5);
        Node a = L(4, 1), b = L(5, 6, 1);
        a.next.next = common;
        b.next.next.next = common;
        Node in = getIntersectionNode(a, b);
        System.out.println(in == null ? "null" : in.val);
        System.out.println(s(addTwoNumbers(L(2, 4, 3), L(5, 6, 4))));
        System.out.println(s(rotateRight(L(1, 2, 3, 4, 5), 2)));
        System.out.println(s(reverseKGroup(L(1, 2, 3, 4, 5), 2)));

        Node h1 = L(5, 7, 8, 30), h2 = L(10, 20), h3 = L(19, 22, 50), h4 = L(28, 35, 40, 45);
        Node[] hs = {h1, h2, h3, h4};
        Node[] tops = new Node[4];
        for (int i = 0; i < 4; i++) { tops[i] = new Node(hs[i].val); Node t = tops[i]; for (Node x = hs[i].next; x != null; x = x.next) { t.bottom = new Node(x.val); t = t.bottom; } }
        for (int i = 0; i < 3; i++) tops[i].next = tops[i + 1];
        Node f = flatten(tops[0]);
        StringBuilder fs = new StringBuilder();
        for (; f != null; f = f.bottom) fs.append(f.val).append(' ');
        System.out.println(fs.toString().trim());

        Node r1 = new Node(7), r2 = new Node(13), r3 = new Node(11);
        r1.next = r2; r2.next = r3;
        r2.random = r1; r3.random = null; r1.random = null;
        Node cp = copyRandomList(r1);
        for (; cp != null; cp = cp.next) System.out.println(cp.val + " random=" + (cp.random == null ? "null" : cp.random.val));
    }
}
