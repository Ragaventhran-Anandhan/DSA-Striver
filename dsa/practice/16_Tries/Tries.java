import java.util.*;

public class Tries {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // medium
    // 449. Implement Trie (Prefix Tree)
    // Description: insert, search, startsWith.
    // Example input : insert("apple") search("apple") startsWith("app")
    // Example output: true, true
    public static void implementTrie() {
        // code
    }

    // medium
    // 450. Implement Trie II
    // Description: countWordsEqualTo, countWordsStartingWith, erase.
    // Example input : insert("apple") countWordsEqualTo("apple")
    // Example output: 1
    public static void implementTrieII() {
        // code
    }

    // medium
    // 451. Longest Word with All Prefixes
    // Description: Longest word whose all prefixes exist.
    // Example input : words=["n","ni","nin","ninj","ninja","ninga"]
    // Example output: "ninja"
    public static String completeString(String[] words) {
        // code
        return null;
    }

    // medium
    // 452. Number of Distinct Substrings in a String
    // Description: Count using a trie.
    // Example input : s="abab"
    // Example output: 7
    public static int countDistinctSubstrings(String s) {
        // code
        return 0;
    }

    // hard
    // 453. Maximum XOR of Two Numbers in an Array
    // Description: Max XOR pair.
    // Example input : arr=[3,10,5,25,2,8]
    // Example output: 28
    public static int findMaximumXOR(int[] arr) {
        // code
        return 0;
    }

    // hard
    // 454. Maximum XOR with an Element from Array
    // Description: Max XOR with limit.
    // Example input : arr=[0,1,2,3,4], queries=[[3,1],[1,3],[5,6]]
    // Example output: [3,3,7]
    public static int[] maximizeXor(int[] arr, int[][] queries) {
        // code
        return null;
    }

    public static void main(String[] args) {
        implementTrie();
        implementTrieII();
        System.out.println(completeString(new String[]{"n", "ni", "nin", "ninj", "ninja", "ninga"}));
        System.out.println(countDistinctSubstrings("abab"));
        System.out.println(findMaximumXOR(new int[]{3, 10, 5, 25, 2, 8}));
        System.out.println(Arrays.toString(maximizeXor(new int[]{0, 1, 2, 3, 4}, new int[][]{{3, 1}, {1, 3}, {5, 6}})));
    }
}
