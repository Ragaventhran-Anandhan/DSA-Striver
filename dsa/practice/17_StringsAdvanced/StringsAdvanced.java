import java.util.*;

public class StringsAdvanced {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // medium
    // 455. Minimum Characters to Add at Front for Palindrome
    // Description: Min chars at front.
    // Example input : s="aacecaaa"
    // Example output: 1
    public static int minCharsForPalindrome(String s) {
        // code
        return 0;
    }

    // medium
    // 456. Shortest Palindrome
    // Description: Shortest palindrome by adding at front.
    // Example input : s="aacecaaa"
    // Example output: "aaacecaaa"
    public static String shortestPalindrome(String s) {
        // code
        return null;
    }

    // medium
    // 457. Rabin-Karp Algorithm
    // Description: Pattern match using rolling hash.
    // Example input : text="abcabc", pattern="bc"
    // Example output: [1,4]
    public static List<Integer> rabinKarp(String text, String pattern) {
        // code
        return null;
    }

    // medium
    // 458. Z-Function
    // Description: Compute Z array.
    // Example input : s="aabxaab"
    // Example output: [7,1,0,0,3,1,0]
    public static int[] zFunction(String s) {
        // code
        return null;
    }

    // medium
    // 459. KMP Algorithm / LPS Array
    // Description: Longest prefix suffix array.
    // Example input : pattern="abab"
    // Example output: [0,0,1,2]
    public static int[] computeLPS(String pattern) {
        // code
        return null;
    }

    // medium
    // 460. KMP - Find Pattern Occurrences
    // Description: All start indices.
    // Example input : text="aabaabaa", pattern="aab"
    // Example output: [0,3]
    public static List<Integer> kmpSearch(String text, String pattern) {
        // code
        return null;
    }

    // medium
    // 461. Count and Say
    // Description: n-th term.
    // Example input : n=4
    // Example output: "1211"
    public static String countAndSay(int n) {
        // code
        return null;
    }

    // medium
    // 462. Compare Version Numbers
    // Description: Compare.
    // Example input : v1="1.01", v2="1.001"
    // Example output: 0
    public static int compareVersion(String v1, String v2) {
        // code
        return 0;
    }

    // medium
    // 463. Repeated Substring Pattern
    // Description: Is built by repeating substring.
    // Example input : s="abab"
    // Example output: true
    public static boolean repeatedSubstringPattern(String s) {
        // code
        return false;
    }

    public static void main(String[] args) {
        System.out.println(minCharsForPalindrome("aacecaaa"));
        System.out.println(shortestPalindrome("aacecaaa"));
        System.out.println(rabinKarp("abcabc", "bc"));
        System.out.println(Arrays.toString(zFunction("aabxaab")));
        System.out.println(Arrays.toString(computeLPS("abab")));
        System.out.println(kmpSearch("aabaabaa", "aab"));
        System.out.println(countAndSay(4));
        System.out.println(compareVersion("1.01", "1.001"));
        System.out.println(repeatedSubstringPattern("abab"));
    }
}
