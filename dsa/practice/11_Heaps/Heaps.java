import java.util.*;

public class Heaps {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 259. Introduction: Implement Min Heap
    // Description: Implement insert, extractMin, peek.
    // Example input : insert 3,1,2 extractMin
    // Example output: 1
    public static void minHeap() {
        // code
    }

    // easy
    // 260. Implement Max Heap
    // Description: Implement insert, extractMax.
    // Example input : insert 3,1,2 extractMax
    // Example output: 3
    public static void maxHeap() {
        // code
    }

    // easy
    // 261. Heapify and Build Heap
    // Description: Convert array into min heap.
    // Example input : arr=[4,10,3,5,1]
    // Example output: [1,4,3,5,10]
    public static void buildHeap(int[] arr) {
        // code
    }

    // easy
    // 262. Heap Sort
    // Description: Sort using heap.
    // Example input : arr=[4,1,3,9,7]
    // Example output: [1,3,4,7,9]
    public static void heapSort(int[] arr) {
        // code
    }

    // easy
    // 263. Check if Array Represents Min Heap
    // Description: Verify heap property.
    // Example input : arr=[10,20,30,21,23]
    // Example output: true
    public static boolean isMinHeap(int[] arr) {
        // code
        return false;
    }

    // medium
    // 264. Kth Largest Element in Array
    // Description: K-th largest element.
    // Example input : arr=[3,2,1,5,6,4], k=2
    // Example output: 5
    public static int findKthLargest(int[] arr, int k) {
        // code
        return 0;
    }

    // medium
    // 265. Kth Smallest Element in Array
    // Description: K-th smallest element.
    // Example input : arr=[7,10,4,3,20,15], k=3
    // Example output: 7
    public static int findKthSmallest(int[] arr, int k) {
        // code
        return 0;
    }

    // medium
    // 266. Sort a K-Sorted Array
    // Description: Each element at most k away from final position.
    // Example input : arr=[6,5,3,2,8,10,9], k=3
    // Example output: [2,3,5,6,8,9,10]
    public static int[] sortKSorted(int[] arr, int k) {
        // code
        return null;
    }

    // medium
    // 267. Merge K Sorted Lists
    // Description: Merge k sorted lists.
    // Example input : lists=[1->4->5,1->3->4,2->6]
    // Example output: 1->1->2->3->4->4->5->6
    public static Node mergeKLists(Node[] lists) {
        // code
        return null;
    }

    // medium
    // 268. Replace Elements by Rank
    // Description: Replace each element with its rank.
    // Example input : arr=[20,15,26,2,98,6]
    // Example output: [4,3,5,1,6,2]
    public static int[] replaceByRank(int[] arr) {
        // code
        return null;
    }

    // medium
    // 269. Task Scheduler
    // Description: Min time with cooldown n.
    // Example input : tasks=[A,A,A,B,B,B], n=2
    // Example output: 8
    public static int leastInterval(char[] tasks, int n) {
        // code
        return 0;
    }

    // medium
    // 270. Hands of Straights
    // Description: Rearrange into consecutive groups.
    // Example input : hand=[1,2,3,6,2,3,4,7,8], groupSize=3
    // Example output: true
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        // code
        return false;
    }

    // medium
    // 271. Design Twitter
    // Description: postTweet, follow, unfollow, getNewsFeed.
    // Example input : postTweet(1,5) getNewsFeed(1)
    // Example output: [5]
    public static void designTwitter() {
        // code
    }

    // medium
    // 272. Connect N Ropes with Minimum Cost
    // Description: Min cost to connect ropes.
    // Example input : ropes=[4,3,2,6]
    // Example output: 29
    public static int minCostRopes(int[] ropes) {
        // code
        return 0;
    }

    // hard
    // 273. Kth Largest Element in a Stream
    // Description: Maintain k-th largest as stream.
    // Example input : k=3, add(4) add(5) add(8) add(2)
    // Example output: 4
    public static void kthLargestStream() {
        // code
    }

    // hard
    // 274. Maximum Sum Combination
    // Description: Top k sums a[i]+b[j].
    // Example input : a=[1,4,2,3], b=[2,5,1,6], k=4
    // Example output: [10,9,9,8]
    public static int[] maxSumCombination(int[] a, int[] b, int k) {
        // code
        return null;
    }

    // hard
    // 275. Find Median from Data Stream
    // Description: addNum, findMedian.
    // Example input : add(1) add(2) findMedian() add(3) findMedian()
    // Example output: 1.5, 2
    public static void medianFinder() {
        // code
    }

    // hard
    // 276. K Most Frequent Elements
    // Description: Top k frequent elements.
    // Example input : arr=[1,1,1,2,2,3], k=2
    // Example output: [1,2]
    public static int[] topKFrequent(int[] arr, int k) {
        // code
        return null;
    }

    static Node list(int... v) {
        Node d = new Node(0), t = d;
        for (int x : v) { t.next = new Node(x); t = t.next; }
        return d.next;
    }

    public static void main(String[] args) {
        minHeap();
        maxHeap();
        int[] a = {4, 10, 3, 5, 1};
        buildHeap(a);
        System.out.println(Arrays.toString(a));
        a = new int[]{4, 1, 3, 9, 7};
        heapSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(isMinHeap(new int[]{10, 20, 30, 21, 23}));
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(findKthSmallest(new int[]{7, 10, 4, 3, 20, 15}, 3));
        System.out.println(Arrays.toString(sortKSorted(new int[]{6, 5, 3, 2, 8, 10, 9}, 3)));
        Node m = mergeKLists(new Node[]{list(1, 4, 5), list(1, 3, 4), list(2, 6)});
        StringBuilder sb = new StringBuilder();
        for (; m != null; m = m.next) sb.append(sb.length() > 0 ? "->" : "").append(m.val);
        System.out.println(sb);
        System.out.println(Arrays.toString(replaceByRank(new int[]{20, 15, 26, 2, 98, 6})));
        System.out.println(leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
        System.out.println(isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
        designTwitter();
        System.out.println(minCostRopes(new int[]{4, 3, 2, 6}));
        kthLargestStream();
        System.out.println(Arrays.toString(maxSumCombination(new int[]{1, 4, 2, 3}, new int[]{2, 5, 1, 6}, 4)));
        medianFinder();
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
