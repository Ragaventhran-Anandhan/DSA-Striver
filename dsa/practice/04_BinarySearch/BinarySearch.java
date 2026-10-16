import java.util.*;

public class BinarySearch {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 96. Binary Search
    // Description: Index of target in sorted array or -1.
    // Example input : arr=[-1,0,3,5,9,12], target=9
    // Example output: 4
    public static int binarySearch(int[] arr, int target) {
        // code
        return 0;
    }

    // easy
    // 97. Lower Bound
    // Description: Smallest index with arr[i] >= x, else n.
    // Example input : arr=[1,2,8,10,11,12,19], x=9
    // Example output: 3
    public static int lowerBound(int[] arr, int x) {
        // code
        return 0;
    }

    // easy
    // 98. Upper Bound
    // Description: Smallest index with arr[i] > x, else n.
    // Example input : arr=[1,2,2,3], x=2
    // Example output: 3
    public static int upperBound(int[] arr, int x) {
        // code
        return 0;
    }

    // easy
    // 99. Search Insert Position
    // Description: Index where x is or would be inserted.
    // Example input : arr=[1,3,5,6], x=5
    // Example output: 2
    public static int searchInsert(int[] arr, int x) {
        // code
        return 0;
    }

    // easy
    // 100. Floor and Ceil in Sorted Array
    // Description: Return {floor, ceil}, -1 if missing.
    // Example input : arr=[3,4,4,7,8,10], x=5
    // Example output: [4,7]
    public static int[] floorCeil(int[] arr, int x) {
        // code
        return null;
    }

    // easy
    // 101. First and Last Occurrence
    // Description: Return {first, last} index or {-1,-1}.
    // Example input : arr=[2,4,6,8,8,8,11,13], x=8
    // Example output: [3,5]
    public static int[] firstLast(int[] arr, int x) {
        // code
        return null;
    }

    // easy
    // 102. Count Occurrences in Sorted Array
    // Description: Number of times x appears.
    // Example input : arr=[2,4,6,8,8,8,11,13], x=8
    // Example output: 3
    public static int countOccurrences(int[] arr, int x) {
        // code
        return 0;
    }

    // easy
    // 103. Minimum in Rotated Sorted Array
    // Description: Minimum element.
    // Example input : arr=[4,5,6,7,0,1,2]
    // Example output: 0
    public static int findMin(int[] arr) {
        // code
        return 0;
    }

    // easy
    // 104. Find Rotation Count
    // Description: How many times a sorted array was rotated.
    // Example input : arr=[4,5,6,7,0,1,2]
    // Example output: 4
    public static int rotationCount(int[] arr) {
        // code
        return 0;
    }

    // easy
    // 105. Single Element in Sorted Array
    // Description: All appear twice except one.
    // Example input : arr=[1,1,2,3,3,4,4,8,8]
    // Example output: 2
    public static int singleNonDuplicate(int[] arr) {
        // code
        return 0;
    }

    // easy
    // 106. Square Root of N
    // Description: Floor of square root.
    // Example input : n=28
    // Example output: 5
    public static int sqrt(int n) {
        // code
        return 0;
    }

    // easy
    // 107. N-th Root of M
    // Description: Integer x with x^n = m, else -1.
    // Example input : n=3, m=27
    // Example output: 3
    public static int nthRoot(int n, int m) {
        // code
        return 0;
    }

    // medium
    // 108. Search in Rotated Sorted Array I
    // Description: Distinct values.
    // Example input : arr=[4,5,6,7,0,1,2], target=0
    // Example output: 4
    public static int searchRotated(int[] arr, int target) {
        // code
        return 0;
    }

    // medium
    // 109. Search in Rotated Sorted Array II
    // Description: With duplicates.
    // Example input : arr=[2,5,6,0,0,1,2], target=0
    // Example output: true
    public static boolean searchRotatedDup(int[] arr, int target) {
        // code
        return false;
    }

    // medium
    // 110. Find Peak Element
    // Description: Index of any peak element.
    // Example input : arr=[1,2,3,1]
    // Example output: 2
    public static int findPeak(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 111. Koko Eating Bananas
    // Description: Min speed k to finish in h hours.
    // Example input : piles=[3,6,7,11], h=8
    // Example output: 4
    public static int minEatingSpeed(int[] piles, int h) {
        // code
        return 0;
    }

    // medium
    // 112. Minimum Days to Make M Bouquets
    // Description: Min days to make m bouquets of k adjacent flowers.
    // Example input : bloomDay=[1,10,3,10,2], m=3, k=1
    // Example output: 3
    public static int minDays(int[] bloomDay, int m, int k) {
        // code
        return 0;
    }

    // medium
    // 113. Smallest Divisor Given a Threshold
    // Description: Smallest divisor so sum of ceil(arr[i]/d) <= threshold.
    // Example input : arr=[1,2,5,9], threshold=6
    // Example output: 5
    public static int smallestDivisor(int[] arr, int threshold) {
        // code
        return 0;
    }

    // medium
    // 114. Capacity to Ship Packages in D Days
    // Description: Least ship capacity.
    // Example input : weights=[1,2,3,4,5,6,7,8,9,10], days=5
    // Example output: 15
    public static int shipWithinDays(int[] weights, int days) {
        // code
        return 0;
    }

    // medium
    // 115. Kth Missing Positive Number
    // Description: K-th missing positive integer.
    // Example input : arr=[2,3,4,7,11], k=5
    // Example output: 9
    public static int findKthPositive(int[] arr, int k) {
        // code
        return 0;
    }

    // medium
    // 116. Aggressive Cows
    // Description: Maximize min distance between cows.
    // Example input : stalls=[0,3,4,7,10,9], cows=4
    // Example output: 3
    public static int aggressiveCows(int[] stalls, int cows) {
        // code
        return 0;
    }

    // medium
    // 117. Book Allocation Problem
    // Description: Minimize the maximum pages assigned.
    // Example input : pages=[12,34,67,90], students=2
    // Example output: 113
    public static int allocateBooks(int[] pages, int students) {
        // code
        return 0;
    }

    // medium
    // 118. Split Array - Largest Sum
    // Description: Minimize largest subarray sum among k parts.
    // Example input : arr=[7,2,5,10,8], k=2
    // Example output: 18
    public static int splitArray(int[] arr, int k) {
        // code
        return 0;
    }

    // medium
    // 119. Row with Maximum Number of 1s
    // Description: Rows are sorted of 0/1.
    // Example input : matrix=[[0,1,1,1],[0,0,1,1],[1,1,1,1],[0,0,0,0]]
    // Example output: 2
    public static int rowWithMaxOnes(int[][] matrix) {
        // code
        return 0;
    }

    // medium
    // 120. Search in 2D Matrix I
    // Description: Fully sorted when flattened.
    // Example input : matrix=[[1,3,5,7],[10,11,16,20],[23,30,34,60]], target=3
    // Example output: true
    public static boolean searchMatrix1(int[][] matrix, int target) {
        // code
        return false;
    }

    // medium
    // 121. Search in 2D Matrix II
    // Description: Rows and columns sorted independently.
    // Example input : matrix=[[1,4,7,11],[2,5,8,12],[3,6,9,16]], target=5
    // Example output: true
    public static boolean searchMatrix2(int[][] matrix, int target) {
        // code
        return false;
    }

    // medium
    // 122. Find Peak Element in 2D Matrix
    // Description: Return {row,col} of a peak.
    // Example input : mat=[[1,4],[3,2]]
    // Example output: [0,1]
    public static int[] findPeakGrid(int[][] mat) {
        // code
        return null;
    }

    // hard
    // 123. Painter's Partition
    // Description: Minimize time to paint all boards.
    // Example input : boards=[10,20,30,40], painters=2
    // Example output: 60
    public static int paintersPartition(int[] boards, int painters) {
        // code
        return 0;
    }

    // hard
    // 124. Minimize Max Distance to Gas Station
    // Description: Add k stations to minimize max gap.
    // Example input : stations=[1,2,3,4,5], k=4
    // Example output: 0.5
    public static double minMaxGasDistance(int[] stations, int k) {
        // code
        return 0.0;
    }

    // hard
    // 125. Median of Two Sorted Arrays
    // Description: Median of merged arrays in O(log(min)).
    // Example input : a=[1,3], b=[2]
    // Example output: 2.0
    public static double findMedian(int[] a, int[] b) {
        // code
        return 0.0;
    }

    // hard
    // 126. K-th Element of Two Sorted Arrays
    // Description: K-th element of merged arrays.
    // Example input : a=[2,3,6,7,9], b=[1,4,8,10], k=5
    // Example output: 6
    public static int kthElement(int[] a, int[] b, int k) {
        // code
        return 0;
    }

    // hard
    // 127. Median of Row-wise Sorted Matrix
    // Description: Median of all elements.
    // Example input : matrix=[[1,3,5],[2,6,9],[3,6,9]]
    // Example output: 5
    public static int matrixMedian(int[][] matrix) {
        // code
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(lowerBound(new int[]{1, 2, 8, 10, 11, 12, 19}, 9));
        System.out.println(upperBound(new int[]{1, 2, 2, 3}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(Arrays.toString(floorCeil(new int[]{3, 4, 4, 7, 8, 10}, 5)));
        int[] s = {2, 4, 6, 8, 8, 8, 11, 13};
        System.out.println(Arrays.toString(firstLast(s, 8)));
        System.out.println(countOccurrences(s, 8));
        int[] r = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(r));
        System.out.println(rotationCount(r));
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        System.out.println(sqrt(28));
        System.out.println(nthRoot(3, 27));
        System.out.println(searchRotated(r, 0));
        System.out.println(searchRotatedDup(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
        System.out.println(findPeak(new int[]{1, 2, 3, 1}));
        System.out.println(minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        System.out.println(minDays(new int[]{1, 10, 3, 10, 2}, 3, 1));
        System.out.println(smallestDivisor(new int[]{1, 2, 5, 9}, 6));
        System.out.println(shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
        System.out.println(findKthPositive(new int[]{2, 3, 4, 7, 11}, 5));
        System.out.println(aggressiveCows(new int[]{0, 3, 4, 7, 10, 9}, 4));
        System.out.println(allocateBooks(new int[]{12, 34, 67, 90}, 2));
        System.out.println(splitArray(new int[]{7, 2, 5, 10, 8}, 2));
        System.out.println(rowWithMaxOnes(new int[][]{{0, 1, 1, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}}));
        System.out.println(searchMatrix1(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
        System.out.println(searchMatrix2(new int[][]{{1, 4, 7, 11}, {2, 5, 8, 12}, {3, 6, 9, 16}}, 5));
        System.out.println(Arrays.toString(findPeakGrid(new int[][]{{1, 4}, {3, 2}})));
        System.out.println(paintersPartition(new int[]{10, 20, 30, 40}, 2));
        System.out.println(minMaxGasDistance(new int[]{1, 2, 3, 4, 5}, 4));
        System.out.println(findMedian(new int[]{1, 3}, new int[]{2}));
        System.out.println(kthElement(new int[]{2, 3, 6, 7, 9}, new int[]{1, 4, 8, 10}, 5));
        System.out.println(matrixMedian(new int[][]{{1, 3, 5}, {2, 6, 9}, {3, 6, 9}}));
    }
}
