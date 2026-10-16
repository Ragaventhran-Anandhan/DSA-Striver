import java.util.*;

public class Greedy {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 277. Assign Cookies
    // Description: Max content children.
    // Example input : greed=[1,2,3], cookies=[1,1]
    // Example output: 1
    public static int findContentChildren(int[] greed, int[] cookies) {
        // code
        return 0;
    }

    // easy
    // 278. Fractional Knapsack
    // Description: Max value, items divisible.
    // Example input : val=[60,100,120], wt=[10,20,30], cap=50
    // Example output: 240.0
    public static double fractionalKnapsack(int[] val, int[] wt, int cap) {
        // code
        return 0.0;
    }

    // easy
    // 279. Greedy Algorithm to Find Minimum Number of Coins
    // Description: Using denominations 1,2,5,10,20,50,100,500,1000.
    // Example input : amount=49
    // Example output: 5
    public static int minCoins(int amount) {
        // code
        return 0;
    }

    // easy
    // 280. Lemonade Change
    // Description: Give correct change.
    // Example input : bills=[5,5,5,10,20]
    // Example output: true
    public static boolean lemonadeChange(int[] bills) {
        // code
        return false;
    }

    // easy
    // 281. Valid Parenthesis String
    // Description: '*' can be (, ) or empty.
    // Example input : s="(*)"
    // Example output: true
    public static boolean checkValidString(String s) {
        // code
        return false;
    }

    // medium
    // 282. N Meetings in One Room
    // Description: Max meetings in one room.
    // Example input : start=[1,3,0,5,8,5], end=[2,4,6,7,9,9]
    // Example output: 4
    public static int maxMeetings(int[] start, int[] end) {
        // code
        return 0;
    }

    // medium
    // 283. Jump Game I
    // Description: Can you reach last index.
    // Example input : arr=[2,3,1,1,4]
    // Example output: true
    public static boolean canJump(int[] arr) {
        // code
        return false;
    }

    // medium
    // 284. Jump Game II
    // Description: Min jumps to reach end.
    // Example input : arr=[2,3,1,1,4]
    // Example output: 2
    public static int jump(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 285. Minimum Platforms
    // Description: Min platforms needed.
    // Example input : arr=[900,940,950,1100,1500,1800], dep=[910,1200,1120,1130,1900,2000]
    // Example output: 3
    public static int findPlatform(int[] arr, int[] dep) {
        // code
        return 0;
    }

    // medium
    // 286. Job Sequencing Problem
    // Description: Return {jobs, maxProfit}.
    // Example input : deadline=[4,1,1,1], profit=[20,10,40,30]
    // Example output: [2,60]
    public static int[] jobSequencing(int[] deadline, int[] profit) {
        // code
        return null;
    }

    // medium
    // 287. Candy
    // Description: Min candies to children.
    // Example input : ratings=[1,0,2]
    // Example output: 5
    public static int candy(int[] ratings) {
        // code
        return 0;
    }

    // medium
    // 288. Shortest Job First
    // Description: Average waiting time.
    // Example input : burst=[4,3,7,1,2]
    // Example output: 4.0
    public static double sjfAvgWaitTime(int[] burst) {
        // code
        return 0.0;
    }

    // medium
    // 289. Page Faults in LRU
    // Description: Count page faults.
    // Example input : pages=[7,0,1,2,0,3,0,4], capacity=3
    // Example output: 6
    public static int pageFaultsLRU(int[] pages, int capacity) {
        // code
        return 0;
    }

    // medium
    // 290. Insert Interval
    // Description: Insert and merge.
    // Example input : intervals=[[1,3],[6,9]], newInterval=[2,5]
    // Example output: [[1,5],[6,9]]
    public static int[][] insertInterval(int[][] intervals, int[] newInterval) {
        // code
        return null;
    }

    // medium
    // 291. Non-overlapping Intervals
    // Description: Min removals.
    // Example input : intervals=[[1,2],[2,3],[3,4],[1,3]]
    // Example output: 1
    public static int eraseOverlapIntervals(int[][] intervals) {
        // code
        return 0;
    }

    // hard
    // 292. Maximum Meetings in One Room (Indices)
    // Description: Indices of meetings.
    // Example input : start=[1,3,0,5,8,5], end=[2,4,6,7,9,9]
    // Example output: [1,2,4,5]
    public static List<Integer> maxMeetingsIndices(int[] start, int[] end) {
        // code
        return null;
    }

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        System.out.println(fractionalKnapsack(new int[]{60, 100, 120}, new int[]{10, 20, 30}, 50));
        System.out.println(minCoins(49));
        System.out.println(lemonadeChange(new int[]{5, 5, 5, 10, 20}));
        System.out.println(checkValidString("(*)"));
        int[] st = {1, 3, 0, 5, 8, 5}, en = {2, 4, 6, 7, 9, 9};
        System.out.println(maxMeetings(st, en));
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(findPlatform(new int[]{900, 940, 950, 1100, 1500, 1800}, new int[]{910, 1200, 1120, 1130, 1900, 2000}));
        System.out.println(Arrays.toString(jobSequencing(new int[]{4, 1, 1, 1}, new int[]{20, 10, 40, 30})));
        System.out.println(candy(new int[]{1, 0, 2}));
        System.out.println(sjfAvgWaitTime(new int[]{4, 3, 7, 1, 2}));
        System.out.println(pageFaultsLRU(new int[]{7, 0, 1, 2, 0, 3, 0, 4}, 3));
        System.out.println(Arrays.deepToString(insertInterval(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})));
        System.out.println(eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
        System.out.println(maxMeetingsIndices(st, en));
    }
}
