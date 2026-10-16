import java.util.*;

public class BitManipulation {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 202. Minimum Bit Flips to Convert Number
    // Description: Bit flips to convert start to goal.
    // Example input : start=10, goal=7
    // Example output: 3
    public static int minBitFlips(int start, int goal) {
        // code
        return 0;
    }

    // easy
    // 203. Check if i-th Bit is Set
    // Description: True if i-th bit (0-indexed) is set.
    // Example input : n=5, i=0
    // Example output: true
    public static boolean isBitSet(int n, int i) {
        // code
        return false;
    }

    // easy
    // 204. Set the i-th Bit
    // Description: Return n with i-th bit set.
    // Example input : n=5, i=1
    // Example output: 7
    public static int setBit(int n, int i) {
        // code
        return 0;
    }

    // easy
    // 205. Clear the i-th Bit
    // Description: Return n with i-th bit cleared.
    // Example input : n=5, i=0
    // Example output: 4
    public static int clearBit(int n, int i) {
        // code
        return 0;
    }

    // easy
    // 206. Toggle the i-th Bit
    // Description: Flip i-th bit.
    // Example input : n=5, i=1
    // Example output: 7
    public static int toggleBit(int n, int i) {
        // code
        return 0;
    }

    // easy
    // 207. Remove Last Set Bit
    // Description: Clear rightmost set bit.
    // Example input : n=12
    // Example output: 8
    public static int removeLastSetBit(int n) {
        // code
        return 0;
    }

    // easy
    // 208. Check Power of Two
    // Description: True if n is power of 2.
    // Example input : n=16
    // Example output: true
    public static boolean isPowerOfTwo(int n) {
        // code
        return false;
    }

    // easy
    // 209. Count Number of Set Bits
    // Description: Number of 1 bits.
    // Example input : n=13
    // Example output: 3
    public static int countSetBits(int n) {
        // code
        return 0;
    }

    // easy
    // 210. Swap Two Numbers Without Temp
    // Description: Swap using XOR.
    // Example input : a=3, b=5
    // Example output: [5,3]
    public static int[] swapNumbers(int a, int b) {
        // code
        return null;
    }

    // medium
    // 211. Divide Two Integers Without Operators
    // Description: No *, /, %.
    // Example input : dividend=22, divisor=3
    // Example output: 7
    public static int divide(int dividend, int divisor) {
        // code
        return 0;
    }

    // medium
    // 212. Single Number III
    // Description: Two numbers appear once, others twice.
    // Example input : arr=[1,2,1,3,2,5]
    // Example output: [3,5]
    public static int[] singleNumberIII(int[] arr) {
        // code
        return null;
    }

    // medium
    // 213. Single Number II
    // Description: Others appear three times.
    // Example input : arr=[2,2,3,2]
    // Example output: 3
    public static int singleNumberII(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 214. XOR of Numbers from L to R
    // Description: XOR of all numbers in [l,r].
    // Example input : l=3, r=5
    // Example output: 2
    public static int xorRange(int l, int r) {
        // code
        return 0;
    }

    // medium
    // 215. Power Set using Bit Manipulation
    // Description: All subsets via bitmasks.
    // Example input : arr=[1,2,3]
    // Example output: 8 subsets
    public static List<List<Integer>> powerSetBits(int[] arr) {
        // code
        return null;
    }

    // medium
    // 216. Count Primes Factors Prime Factorization
    // Description: Prime factors of n.
    // Example input : n=12
    // Example output: [2,2,3]
    public static List<Integer> primeFactors(int n) {
        // code
        return null;
    }

    public static void main(String[] args) {
        System.out.println(minBitFlips(10, 7));
        System.out.println(isBitSet(5, 0));
        System.out.println(setBit(5, 1));
        System.out.println(clearBit(5, 0));
        System.out.println(toggleBit(5, 1));
        System.out.println(removeLastSetBit(12));
        System.out.println(isPowerOfTwo(16));
        System.out.println(countSetBits(13));
        System.out.println(Arrays.toString(swapNumbers(3, 5)));
        System.out.println(divide(22, 3));
        System.out.println(Arrays.toString(singleNumberIII(new int[]{1, 2, 1, 3, 2, 5})));
        System.out.println(singleNumberII(new int[]{2, 2, 3, 2}));
        System.out.println(xorRange(3, 5));
        System.out.println(powerSetBits(new int[]{1, 2, 3}));
        System.out.println(primeFactors(12));
    }
}
