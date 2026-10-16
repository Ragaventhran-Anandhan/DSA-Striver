import java.util.*;

public class Strings {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 128. Remove Outermost Parentheses
    // Description: Strip outer parens of each primitive.
    // Example input : s="(()())(())"
    // Example output: "()()()"
    public static String removeOuterParentheses(String s) {
        // code
        return null;
    }

    // easy
    // 129. Reverse Words in a String
    // Description: Reverse the order of words.
    // Example input : s="the sky is blue"
    // Example output: "blue is sky the"
    public static String reverseWords(String s) {
        // code
        return null;
    }

    // easy
    // 130. Largest Odd Number in String
    // Description: Largest odd-valued substring.
    // Example input : num="35427"
    // Example output: "35427"
    public static String largestOddNumber(String num) {
        // code
        return null;
    }

    // easy
    // 131. Longest Common Prefix
    // Description: Longest common prefix.
    // Example input : strs=["flower","flow","flight"]
    // Example output: "fl"
    public static String longestCommonPrefix(String[] strs) {
        // code
        return null;
    }

    // easy
    // 132. Isomorphic Strings
    // Description: Check if one-to-one char mapping exists.
    // Example input : s="egg", t="add"
    // Example output: true
    public static boolean isIsomorphic(String s, String t) {
        // code
        return false;
    }

    // easy
    // 133. Check if One String is Rotation of Another
    // Description: True if s can become goal by rotations.
    // Example input : s="abcde", goal="cdeab"
    // Example output: true
    public static boolean isRotation(String s, String goal) {
        // code
        return false;
    }

    // easy
    // 134. Valid Anagram
    // Description: True if t is an anagram of s.
    // Example input : s="anagram", t="nagaram"
    // Example output: true
    public static boolean isAnagram(String s, String t) {
        // code
        return false;
    }

    // easy
    // 135. Maximum Nesting Depth of Parentheses
    // Description: Max nesting depth.
    // Example input : s="(1+(2*3)+((8)/4))+1"
    // Example output: 3
    public static int maxDepth(String s) {
        // code
        return 0;
    }

    // easy
    // 136. Roman to Integer
    // Description: Convert roman numeral.
    // Example input : s="MCMXCIV"
    // Example output: 1994
    public static int romanToInt(String s) {
        // code
        return 0;
    }

    // easy
    // 137. Count Number of Substrings
    // Description: Total non-empty substrings.
    // Example input : s="abc"
    // Example output: 6
    public static int countSubstrings(String s) {
        // code
        return 0;
    }

    // medium
    // 138. Sort Characters by Frequency
    // Description: Sort by decreasing frequency.
    // Example input : s="tree"
    // Example output: "eert"
    public static String frequencySort(String s) {
        // code
        return null;
    }

    // medium
    // 139. String to Integer (atoi)
    // Description: Implement atoi with clamp.
    // Example input : s="  -42"
    // Example output: -42
    public static int myAtoi(String s) {
        // code
        return 0;
    }

    // medium
    // 140. Longest Palindromic Substring
    // Description: Longest palindromic substring.
    // Example input : s="babad"
    // Example output: "bab"
    public static String longestPalindrome(String s) {
        // code
        return null;
    }

    // medium
    // 141. Sum of Beauty of All Substrings
    // Description: Beauty = max freq - min freq per substring.
    // Example input : s="aabcb"
    // Example output: 5
    public static int beautySum(String s) {
        // code
        return 0;
    }

    // medium
    // 142. Reverse Every Word in a String
    // Description: Reverse letters in each word.
    // Example input : s="Let's take LeetCode"
    // Example output: "s'teL ekat edoCteeL"
    public static String reverseEachWord(String s) {
        // code
        return null;
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(largestOddNumber("35427"));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isRotation("abcde", "cdeab"));
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(countSubstrings("abc"));
        System.out.println(frequencySort("tree"));
        System.out.println(myAtoi("  -42"));
        System.out.println(longestPalindrome("babad"));
        System.out.println(beautySum("aabcb"));
        System.out.println(reverseEachWord("Let's take LeetCode"));
    }
}
