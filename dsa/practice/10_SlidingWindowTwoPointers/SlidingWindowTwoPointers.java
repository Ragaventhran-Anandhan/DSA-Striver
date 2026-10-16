import java.util.*;

public class SlidingWindowTwoPointers {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 246. Longest Substring Without Repeating Characters
    // Description: Length of longest unique substring.
    // Example input : s="abcabcbb"
    // Example output: 3
    public static int lengthOfLongestSubstring(String s) {
        // code
        return 0;
    }

    // medium
    // 247. Max Consecutive Ones III
    // Description: Flip at most k zeros.
    // Example input : arr=[1,1,1,0,0,0,1,1,1,1,0], k=2
    // Example output: 6
    public static int longestOnes(int[] arr, int k) {
        // code
        return 0;
    }

    // medium
    // 248. Fruit Into Baskets
    // Description: Longest subarray with at most 2 distinct values.
    // Example input : fruits=[1,2,3,2,2]
    // Example output: 4
    public static int totalFruit(int[] fruits) {
        // code
        return 0;
    }

    // medium
    // 249. Longest Substring with At Most K Distinct Characters
    // Description: Longest substring with <= k distinct.
    // Example input : s="aaabb", k=2
    // Example output: 5
    public static int longestKDistinct(String s, int k) {
        // code
        return 0;
    }

    // medium
    // 250. Number of Substrings Containing All Three Characters
    // Description: Substrings containing a, b, c.
    // Example input : s="abcabc"
    // Example output: 10
    public static int numberOfSubstrings(String s) {
        // code
        return 0;
    }

    // medium
    // 251. Longest Repeating Character Replacement
    // Description: Longest same-char substring after k replacements.
    // Example input : s="AABABBA", k=1
    // Example output: 4
    public static int characterReplacement(String s, int k) {
        // code
        return 0;
    }

    // medium
    // 252. Binary Subarrays with Sum
    // Description: Subarrays with sum goal.
    // Example input : arr=[1,0,1,0,1], goal=2
    // Example output: 4
    public static int numSubarraysWithSum(int[] arr, int goal) {
        // code
        return 0;
    }

    // medium
    // 253. Count Number of Nice Subarrays
    // Description: Subarrays with k odd numbers.
    // Example input : arr=[1,1,2,1,1], k=3
    // Example output: 2
    public static int numberOfSubarrays(int[] arr, int k) {
        // code
        return 0;
    }

    // medium
    // 254. Maximum Points You Can Obtain from Cards
    // Description: Pick k cards from ends.
    // Example input : cards=[1,2,3,4,5,6,1], k=3
    // Example output: 12
    public static int maxScore(int[] cards, int k) {
        // code
        return 0;
    }

    // hard
    // 255. Subarrays with K Different Integers
    // Description: Subarrays with exactly k distinct.
    // Example input : arr=[1,2,1,2,3], k=2
    // Example output: 7
    public static int subarraysWithKDistinct(int[] arr, int k) {
        // code
        return 0;
    }

    // hard
    // 256. Minimum Window Substring
    // Description: Smallest window containing all chars of t.
    // Example input : s="ADOBECODEBANC", t="ABC"
    // Example output: "BANC"
    public static String minWindow(String s, String t) {
        // code
        return null;
    }

    // hard
    // 257. Minimum Window Subsequence
    // Description: Smallest window where t is a subsequence.
    // Example input : s="abcdebdde", t="bde"
    // Example output: "bcde"
    public static String minWindowSubsequence(String s, String t) {
        // code
        return null;
    }

    // hard
    // 258. Sliding Window Maximum
    // Description: Max of each window of size k.
    // Example input : arr=[1,3,-1,-3,5,3,6,7], k=3
    // Example output: [3,3,5,5,6,7]
    public static int[] maxSlidingWindow(int[] arr, int k) {
        // code
        return null;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        System.out.println(totalFruit(new int[]{1, 2, 3, 2, 2}));
        System.out.println(longestKDistinct("aaabb", 2));
        System.out.println(numberOfSubstrings("abcabc"));
        System.out.println(characterReplacement("AABABBA", 1));
        System.out.println(numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
        System.out.println(numberOfSubarrays(new int[]{1, 1, 2, 1, 1}, 3));
        System.out.println(maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3));
        System.out.println(subarraysWithKDistinct(new int[]{1, 2, 1, 2, 3}, 2));
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(minWindowSubsequence("abcdebdde", "bde"));
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
}
