import java.util.*;

public class ArraysProblems {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 51. Largest Element in Array
    // Description: Return the largest element.
    // Example input : arr=[3,2,1,5,2]
    // Example output: 5
    public static int findLargest(int[] arr) {
        // code
        return 0;
    }

    // easy
    // 52. Second Largest Element
    // Description: Return second largest distinct element, -1 if none.
    // Example input : arr=[1,2,4,7,7,5]
    // Example output: 5
    public static int secondLargest(int[] arr) {
        // code
        return 0;
    }

    // easy
    // 53. Check if Array is Sorted
    // Description: True if non-decreasing order.
    // Example input : arr=[1,2,3,4,5]
    // Example output: true
    public static boolean isSorted(int[] arr) {
        // code
        return false;
    }

    // easy
    // 54. Remove Duplicates from Sorted Array
    // Description: In place; return count of unique elements.
    // Example input : arr=[1,1,2,2,2,3,3]
    // Example output: 3, arr=[1,2,3,_,_,_,_]
    public static int removeDuplicates(int[] arr) {
        // code
        return 0;
    }

    // easy
    // 55. Left Rotate Array by One
    // Description: Rotate left by 1 place.
    // Example input : arr=[1,2,3,4,5]
    // Example output: [2,3,4,5,1]
    public static void rotateByOne(int[] arr) {
        // code
    }

    // easy
    // 56. Left Rotate Array by D Places
    // Description: Rotate left by d places.
    // Example input : arr=[1,2,3,4,5,6,7], d=3
    // Example output: [4,5,6,7,1,2,3]
    public static void rotateByD(int[] arr, int d) {
        // code
    }

    // easy
    // 57. Move Zeros to End
    // Description: Move all zeros to end, keep order of others.
    // Example input : arr=[1,0,2,3,0,4,0,1]
    // Example output: [1,2,3,4,1,0,0,0]
    public static void moveZeros(int[] arr) {
        // code
    }

    // easy
    // 58. Linear Search
    // Description: Index of target or -1.
    // Example input : arr=[6,7,8,4,1], target=4
    // Example output: 3
    public static int linearSearch(int[] arr, int target) {
        // code
        return 0;
    }

    // easy
    // 59. Union of Two Sorted Arrays
    // Description: Sorted union without duplicates.
    // Example input : a=[1,2,3,4,5], b=[2,3,4,4,5]
    // Example output: [1,2,3,4,5]
    public static List<Integer> unionSorted(int[] a, int[] b) {
        // code
        return null;
    }

    // easy
    // 60. Intersection of Two Sorted Arrays
    // Description: Common elements (with multiplicity).
    // Example input : a=[1,2,2,3,3,4,5,6], b=[2,3,3,5,6,6,7]
    // Example output: [2,3,3,5,6]
    public static List<Integer> intersection(int[] a, int[] b) {
        // code
        return null;
    }

    // easy
    // 61. Find Missing Number
    // Description: Array has n-1 distinct numbers from 1..n; find missing.
    // Example input : arr=[1,2,4,5], n=5
    // Example output: 3
    public static int missingNumber(int[] arr, int n) {
        // code
        return 0;
    }

    // easy
    // 62. Maximum Consecutive Ones
    // Description: Longest run of 1s.
    // Example input : arr=[1,1,0,1,1,1]
    // Example output: 3
    public static int maxConsecutiveOnes(int[] arr) {
        // code
        return 0;
    }

    // easy
    // 63. Single Number (Appears Once)
    // Description: Every element appears twice except one.
    // Example input : arr=[4,1,2,1,2]
    // Example output: 4
    public static int singleNumber(int[] arr) {
        // code
        return 0;
    }

    // easy
    // 64. Two Sum
    // Description: Return indices of two numbers adding to target.
    // Example input : arr=[2,6,5,8,11], target=14
    // Example output: [1,3]
    public static int[] twoSum(int[] arr, int target) {
        // code
        return null;
    }

    // easy
    // 65. Merge Two Sorted Arrays Without Extra Space
    // Description: Merge so a holds smallest, b the rest.
    // Example input : a=[1,4,8,10], b=[2,3,9]
    // Example output: a=[1,2,3,4], b=[8,9,10]
    public static void mergeSortedInPlace(int[] a, int[] b) {
        // code
    }

    // easy
    // 66. Pascal's Triangle - Element at (r,c)
    // Description: Value at row r column c (1-indexed).
    // Example input : r=5, c=3
    // Example output: 6
    public static int pascalElement(int r, int c) {
        // code
        return 0;
    }

    // medium
    // 67. Longest Subarray with Sum K (Positives)
    // Description: Length of longest subarray with sum k.
    // Example input : arr=[2,3,5], k=5
    // Example output: 2
    public static int longestSubarrayPositive(int[] arr, int k) {
        // code
        return 0;
    }

    // medium
    // 68. Longest Subarray with Sum K (Positives and Negatives)
    // Description: Length of longest subarray with sum k.
    // Example input : arr=[10,5,2,7,1,9], k=15
    // Example output: 4
    public static int longestSubarrayWithSumK(int[] arr, int k) {
        // code
        return 0;
    }

    // medium
    // 69. Sort Colors (0s, 1s, 2s)
    // Description: Sort array of 0,1,2 in one pass.
    // Example input : arr=[2,0,2,1,1,0]
    // Example output: [0,0,1,1,2,2]
    public static void sortColors(int[] arr) {
        // code
    }

    // medium
    // 70. Majority Element (> n/2)
    // Description: Element appearing more than n/2 times.
    // Example input : arr=[2,2,1,1,1,2,2]
    // Example output: 2
    public static int majorityElement(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 71. Maximum Subarray Sum (Kadane)
    // Description: Largest sum of a contiguous subarray.
    // Example input : arr=[-2,1,-3,4,-1,2,1,-5,4]
    // Example output: 6
    public static int maxSubarraySum(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 72. Print Subarray with Maximum Sum
    // Description: Return the subarray with maximum sum.
    // Example input : arr=[-2,1,-3,4,-1,2,1,-5,4]
    // Example output: [4,-1,2,1]
    public static int[] maxSubarray(int[] arr) {
        // code
        return null;
    }

    // medium
    // 73. Best Time to Buy and Sell Stock
    // Description: Max profit with one transaction.
    // Example input : prices=[7,1,5,3,6,4]
    // Example output: 5
    public static int maxProfit(int[] prices) {
        // code
        return 0;
    }

    // medium
    // 74. Rearrange Array Elements by Sign
    // Description: Alternate positive and negative starting with positive.
    // Example input : arr=[1,2,-4,-5]
    // Example output: [1,-4,2,-5]
    public static int[] rearrangeBySign(int[] arr) {
        // code
        return null;
    }

    // medium
    // 75. Rearrange Array by Sign (Unequal Counts)
    // Description: Alternate signs, leftovers appended at end.
    // Example input : arr=[1,2,-4,-5,3,4]
    // Example output: [1,-4,2,-5,3,4]
    public static int[] rearrangeBySignUnequal(int[] arr) {
        // code
        return null;
    }

    // medium
    // 76. Next Permutation
    // Description: Rearrange to next lexicographic permutation.
    // Example input : arr=[1,3,2]
    // Example output: [2,1,3]
    public static void nextPermutation(int[] arr) {
        // code
    }

    // medium
    // 77. Leaders in an Array
    // Description: Elements greater than all to their right.
    // Example input : arr=[10,22,12,3,0,6]
    // Example output: [22,12,6]
    public static List<Integer> leaders(int[] arr) {
        // code
        return null;
    }

    // medium
    // 78. Longest Consecutive Sequence
    // Description: Length of longest run of consecutive integers.
    // Example input : arr=[100,4,200,1,3,2]
    // Example output: 4
    public static int longestConsecutive(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 79. Set Matrix Zeroes
    // Description: If a cell is 0 set its whole row and column to 0.
    // Example input : matrix=[[1,1,1],[1,0,1],[1,1,1]]
    // Example output: [[1,0,1],[0,0,0],[1,0,1]]
    public static void setZeroes(int[][] matrix) {
        // code
    }

    // medium
    // 80. Rotate Matrix by 90 Degrees
    // Description: Rotate N x N matrix clockwise in place.
    // Example input : matrix=[[1,2,3],[4,5,6],[7,8,9]]
    // Example output: [[7,4,1],[8,5,2],[9,6,3]]
    public static void rotateMatrix(int[][] matrix) {
        // code
    }

    // medium
    // 81. Spiral Traversal of Matrix
    // Description: Return elements in spiral order.
    // Example input : matrix=[[1,2,3],[4,5,6],[7,8,9]]
    // Example output: [1,2,3,6,9,8,7,4,5]
    public static List<Integer> spiralOrder(int[][] matrix) {
        // code
        return null;
    }

    // medium
    // 82. Count Subarrays with Given Sum
    // Description: Number of subarrays with sum k.
    // Example input : arr=[1,2,3,-3,1,1,1,4,2,-3], k=3
    // Example output: 8
    public static int subarraySum(int[] arr, int k) {
        // code
        return 0;
    }

    // medium
    // 83. Pascal's Triangle (Variations)
    // Description: Generate first n rows.
    // Example input : n=5
    // Example output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    public static List<List<Integer>> pascalTriangle(int n) {
        // code
        return null;
    }

    // medium
    // 84. 3Sum
    // Description: Unique triplets summing to 0.
    // Example input : arr=[-1,0,1,2,-1,-4]
    // Example output: [[-1,-1,2],[-1,0,1]]
    public static List<List<Integer>> threeSum(int[] arr) {
        // code
        return null;
    }

    // medium
    // 85. 4Sum
    // Description: Unique quadruplets summing to target.
    // Example input : arr=[1,0,-1,0,-2,2], target=0
    // Example output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        // code
        return null;
    }

    // medium
    // 86. Largest Subarray with 0 Sum
    // Description: Length of longest subarray summing to 0.
    // Example input : arr=[9,-3,3,-1,6,-5]
    // Example output: 5
    public static int longestZeroSumSubarray(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 87. Merge Overlapping Intervals
    // Description: Merge all overlapping intervals.
    // Example input : intervals=[[1,3],[2,6],[8,10],[15,18]]
    // Example output: [[1,6],[8,10],[15,18]]
    public static int[][] mergeIntervals(int[][] intervals) {
        // code
        return null;
    }

    // medium
    // 88. Pascal's Triangle - Print Row N
    // Description: Return the n-th row.
    // Example input : n=5
    // Example output: [1,4,6,4,1]
    public static List<Integer> pascalRow(int n) {
        // code
        return null;
    }

    // medium
    // 89. Search in 2D Matrix Row-wise Sorted
    // Description: Rows sorted, first of row > last of previous.
    // Example input : matrix=[[1,3,5,7],[10,11,16,20],[23,30,34,60]], target=3
    // Example output: true
    public static boolean searchMatrix(int[][] matrix, int target) {
        // code
        return false;
    }

    // hard
    // 90. Majority Element II (> n/3)
    // Description: Elements appearing more than n/3 times.
    // Example input : arr=[1,2,1,1,3,2]
    // Example output: [1]
    public static List<Integer> majorityElementII(int[] arr) {
        // code
        return null;
    }

    // hard
    // 91. Count Subarrays with XOR K
    // Description: Number of subarrays with XOR equal to k.
    // Example input : arr=[4,2,2,6,4], k=6
    // Example output: 4
    public static int subarraysWithXorK(int[] arr, int k) {
        // code
        return 0;
    }

    // hard
    // 92. Find the Repeating and Missing Number
    // Description: Array 1..n with one repeated and one missing. Return {repeating, missing}.
    // Example input : arr=[3,1,2,5,3]
    // Example output: [3,4]
    public static int[] repeatingAndMissing(int[] arr) {
        // code
        return null;
    }

    // hard
    // 93. Count Inversions
    // Description: Pairs i<j with arr[i]>arr[j].
    // Example input : arr=[5,3,2,4,1]
    // Example output: 8
    public static long countInversions(int[] arr) {
        // code
        return 0L;
    }

    // hard
    // 94. Reverse Pairs
    // Description: Pairs i<j with arr[i] > 2*arr[j].
    // Example input : arr=[1,3,2,3,1]
    // Example output: 2
    public static int reversePairs(int[] arr) {
        // code
        return 0;
    }

    // hard
    // 95. Maximum Product Subarray
    // Description: Largest product of a contiguous subarray.
    // Example input : arr=[1,2,3,4,5,0]
    // Example output: 120
    public static int maxProductSubarray(int[] arr) {
        // code
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findLargest(new int[]{3, 2, 1, 5, 2}));
        System.out.println(secondLargest(new int[]{1, 2, 4, 7, 7, 5}));
        System.out.println(isSorted(new int[]{1, 2, 3, 4, 5}));
        int[] a = {1, 1, 2, 2, 2, 3, 3};
        System.out.println(removeDuplicates(a) + " " + Arrays.toString(a));
        a = new int[]{1, 2, 3, 4, 5};
        rotateByOne(a);
        System.out.println(Arrays.toString(a));
        a = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateByD(a, 3);
        System.out.println(Arrays.toString(a));
        a = new int[]{1, 0, 2, 3, 0, 4, 0, 1};
        moveZeros(a);
        System.out.println(Arrays.toString(a));
        System.out.println(linearSearch(new int[]{6, 7, 8, 4, 1}, 4));
        System.out.println(unionSorted(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4, 4, 5}));
        System.out.println(intersection(new int[]{1, 2, 2, 3, 3, 4, 5, 6}, new int[]{2, 3, 3, 5, 6, 6, 7}));
        System.out.println(missingNumber(new int[]{1, 2, 4, 5}, 5));
        System.out.println(maxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 6, 5, 8, 11}, 14)));
        int[] x = {1, 4, 8, 10}, y = {2, 3, 9};
        mergeSortedInPlace(x, y);
        System.out.println(Arrays.toString(x) + " " + Arrays.toString(y));
        System.out.println(pascalElement(5, 3));
        System.out.println(longestSubarrayPositive(new int[]{2, 3, 5}, 5));
        System.out.println(longestSubarrayWithSumK(new int[]{10, 5, 2, 7, 1, 9}, 15));
        a = new int[]{2, 0, 2, 1, 1, 0};
        sortColors(a);
        System.out.println(Arrays.toString(a));
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        System.out.println(maxSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(Arrays.toString(maxSubarray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})));
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(Arrays.toString(rearrangeBySign(new int[]{1, 2, -4, -5})));
        System.out.println(Arrays.toString(rearrangeBySignUnequal(new int[]{1, 2, -4, -5, 3, 4})));
        a = new int[]{1, 3, 2};
        nextPermutation(a);
        System.out.println(Arrays.toString(a));
        System.out.println(leaders(new int[]{10, 22, 12, 3, 0, 6}));
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        int[][] m = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(m);
        System.out.println(Arrays.deepToString(m));
        m = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateMatrix(m);
        System.out.println(Arrays.deepToString(m));
        System.out.println(spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(subarraySum(new int[]{1, 2, 3, -3, 1, 1, 1, 4, 2, -3}, 3));
        System.out.println(pascalTriangle(5));
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
        System.out.println(longestZeroSumSubarray(new int[]{9, -3, 3, -1, 6, -5}));
        System.out.println(Arrays.deepToString(mergeIntervals(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
        System.out.println(pascalRow(5));
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
        System.out.println(majorityElementII(new int[]{1, 2, 1, 1, 3, 2}));
        System.out.println(subarraysWithXorK(new int[]{4, 2, 2, 6, 4}, 6));
        System.out.println(Arrays.toString(repeatingAndMissing(new int[]{3, 1, 2, 5, 3})));
        System.out.println(countInversions(new int[]{5, 3, 2, 4, 1}));
        System.out.println(reversePairs(new int[]{1, 3, 2, 3, 1}));
        System.out.println(maxProductSubarray(new int[]{1, 2, 3, 4, 5, 0}));
    }
}
