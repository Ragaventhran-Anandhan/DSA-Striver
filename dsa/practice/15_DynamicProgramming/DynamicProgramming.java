import java.util.*;

public class DynamicProgramming {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 391. Climbing Stairs
    // Description: Distinct ways to climb n steps (1 or 2).
    // Example input : n=3
    // Example output: 3
    public static int climbStairs(int n) {
        // code
        return 0;
    }

    // medium
    // 392. Frog Jump
    // Description: Min energy, jump 1 or 2 steps.
    // Example input : heights=[10,20,30,10]
    // Example output: 20
    public static int frogJump(int[] heights) {
        // code
        return 0;
    }

    // medium
    // 393. Frog Jump with K Distances
    // Description: Jump up to k steps.
    // Example input : heights=[10,5,20,0,15], k=2
    // Example output: 15
    public static int frogJumpK(int[] heights, int k) {
        // code
        return 0;
    }

    // medium
    // 394. Maximum Sum of Non-Adjacent Elements
    // Description: House Robber I variant.
    // Example input : arr=[2,1,4,9]
    // Example output: 11
    public static int maxNonAdjacentSum(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 395. House Robber II
    // Description: Houses in a circle.
    // Example input : arr=[2,3,2]
    // Example output: 3
    public static int robCircular(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 396. Ninja's Training
    // Description: Max points, no same activity on consecutive days.
    // Example input : points=[[10,40,70],[20,50,80],[30,60,90]]
    // Example output: 210
    public static int ninjaTraining(int[][] points) {
        // code
        return 0;
    }

    // medium
    // 397. Unique Paths
    // Description: Paths from top-left to bottom-right.
    // Example input : m=3, n=7
    // Example output: 28
    public static int uniquePaths(int m, int n) {
        // code
        return 0;
    }

    // medium
    // 398. Unique Paths II (Obstacles)
    // Description: Grid with obstacles.
    // Example input : grid=[[0,0,0],[0,1,0],[0,0,0]]
    // Example output: 2
    public static int uniquePathsWithObstacles(int[][] grid) {
        // code
        return 0;
    }

    // medium
    // 399. Minimum Path Sum in Grid
    // Description: Min sum path.
    // Example input : grid=[[1,3,1],[1,5,1],[4,2,1]]
    // Example output: 7
    public static int minPathSum(int[][] grid) {
        // code
        return 0;
    }

    // medium
    // 400. Triangle (Minimum Path Sum)
    // Description: Top to bottom min path.
    // Example input : triangle=[[2],[3,4],[6,5,7],[4,1,8,3]]
    // Example output: 11
    public static int minimumTotal(List<List<Integer>> triangle) {
        // code
        return 0;
    }

    // medium
    // 401. Minimum/Maximum Falling Path Sum
    // Description: Min falling path.
    // Example input : matrix=[[2,1,3],[6,5,4],[7,8,9]]
    // Example output: 13
    public static int minFallingPathSum(int[][] matrix) {
        // code
        return 0;
    }

    // medium
    // 402. Subset Sum Equals to Target
    // Description: Subset with sum k?
    // Example input : arr=[1,2,3,4], k=4
    // Example output: true
    public static boolean subsetSumToK(int[] arr, int k) {
        // code
        return false;
    }

    // medium
    // 403. Partition Equal Subset Sum
    // Description: Split into two equal-sum subsets.
    // Example input : arr=[1,5,11,5]
    // Example output: true
    public static boolean canPartition(int[] arr) {
        // code
        return false;
    }

    // medium
    // 404. Partition Set into Two Subsets with Minimum Absolute Sum Difference
    // Description: Minimize difference.
    // Example input : arr=[1,6,11,5]
    // Example output: 1
    public static int minSubsetSumDifference(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 405. Count Subsets with Sum K
    // Description: Count subsets.
    // Example input : arr=[1,2,2,3], k=3
    // Example output: 3
    public static int countSubsetsWithSumK(int[] arr, int k) {
        // code
        return 0;
    }

    // medium
    // 406. Count Partitions with Given Difference
    // Description: Subsets S1-S2=d.
    // Example input : arr=[5,2,6,4], d=3
    // Example output: 1
    public static int countPartitions(int[] arr, int d) {
        // code
        return 0;
    }

    // medium
    // 407. 0/1 Knapsack
    // Description: Max value.
    // Example input : wt=[1,2,4,5], val=[5,4,8,6], w=5
    // Example output: 13
    public static int knapsack(int[] wt, int[] val, int w) {
        // code
        return 0;
    }

    // medium
    // 408. Minimum Coins
    // Description: Fewest coins, -1 if impossible.
    // Example input : coins=[1,2,5], amount=11
    // Example output: 3
    public static int coinChange(int[] coins, int amount) {
        // code
        return 0;
    }

    // medium
    // 409. Target Sum
    // Description: Assign +/- to reach target.
    // Example input : arr=[1,1,1,1,1], target=3
    // Example output: 5
    public static int findTargetSumWays(int[] arr, int target) {
        // code
        return 0;
    }

    // medium
    // 410. Coin Change II
    // Description: Number of ways.
    // Example input : amount=5, coins=[1,2,5]
    // Example output: 4
    public static int change(int amount, int[] coins) {
        // code
        return 0;
    }

    // medium
    // 411. Unbounded Knapsack
    // Description: Unlimited items.
    // Example input : wt=[2,4,6], val=[5,11,13], w=10
    // Example output: 27
    public static int unboundedKnapsack(int[] wt, int[] val, int w) {
        // code
        return 0;
    }

    // medium
    // 412. Rod Cutting Problem
    // Description: Max profit from rod.
    // Example input : price=[2,5,7,8,10], n=5
    // Example output: 12
    public static int cutRod(int[] price, int n) {
        // code
        return 0;
    }

    // medium
    // 413. Longest Common Subsequence
    // Description: LCS length.
    // Example input : a="abcde", b="ace"
    // Example output: 3
    public static int longestCommonSubsequence(String a, String b) {
        // code
        return 0;
    }

    // medium
    // 414. Print Longest Common Subsequence
    // Description: Return LCS.
    // Example input : a="abcde", b="ace"
    // Example output: "ace"
    public static String printLCS(String a, String b) {
        // code
        return null;
    }

    // medium
    // 415. Longest Common Substring
    // Description: Length.
    // Example input : a="abcjklp", b="acjkp"
    // Example output: 3
    public static int longestCommonSubstring(String a, String b) {
        // code
        return 0;
    }

    // medium
    // 416. Longest Palindromic Subsequence
    // Description: Length.
    // Example input : s="bbbab"
    // Example output: 4
    public static int longestPalindromeSubseq(String s) {
        // code
        return 0;
    }

    // medium
    // 417. Minimum Insertions to Make String Palindrome
    // Description: Min insertions.
    // Example input : s="mbadm"
    // Example output: 2
    public static int minInsertions(String s) {
        // code
        return 0;
    }

    // medium
    // 418. Minimum Insertions/Deletions to Convert String A to B
    // Description: Insertions + deletions.
    // Example input : a="heap", b="pea"
    // Example output: 3
    public static int minOperations(String a, String b) {
        // code
        return 0;
    }

    // medium
    // 419. Shortest Common Supersequence
    // Description: Shortest string containing both.
    // Example input : a="brute", b="groot"
    // Example output: "bgruoote"
    public static String shortestCommonSupersequence(String a, String b) {
        // code
        return null;
    }

    // medium
    // 420. Distinct Subsequences
    // Description: Count subsequences of s equal to t.
    // Example input : s="rabbbit", t="rabbit"
    // Example output: 3
    public static int numDistinct(String s, String t) {
        // code
        return 0;
    }

    // medium
    // 421. Best Time to Buy and Sell Stock I
    // Description: One transaction.
    // Example input : prices=[7,1,5,3,6,4]
    // Example output: 5
    public static int maxProfitI(int[] prices) {
        // code
        return 0;
    }

    // medium
    // 422. Best Time to Buy and Sell Stock II
    // Description: Unlimited transactions.
    // Example input : prices=[7,1,5,3,6,4]
    // Example output: 7
    public static int maxProfitII(int[] prices) {
        // code
        return 0;
    }

    // medium
    // 423. Stock with Cooldown
    // Description: One day cooldown after sell.
    // Example input : prices=[1,2,3,0,2]
    // Example output: 3
    public static int maxProfitCooldown(int[] prices) {
        // code
        return 0;
    }

    // medium
    // 424. Stock with Transaction Fee
    // Description: Fee per transaction.
    // Example input : prices=[1,3,2,8,4,9], fee=2
    // Example output: 8
    public static int maxProfitFee(int[] prices, int fee) {
        // code
        return 0;
    }

    // medium
    // 425. Longest Increasing Subsequence
    // Description: LIS length.
    // Example input : arr=[10,9,2,5,3,7,101,18]
    // Example output: 4
    public static int lengthOfLIS(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 426. Print Longest Increasing Subsequence
    // Description: Return a LIS.
    // Example input : arr=[5,4,11,1,16,8]
    // Example output: [5,11,16]
    public static List<Integer> printLIS(int[] arr) {
        // code
        return null;
    }

    // medium
    // 427. LIS using Binary Search
    // Description: O(n log n).
    // Example input : arr=[10,9,2,5,3,7,101,18]
    // Example output: 4
    public static int lisBinarySearch(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 428. Largest Divisible Subset
    // Description: Each pair divisible.
    // Example input : arr=[1,2,3]
    // Example output: [1,2]
    public static List<Integer> largestDivisibleSubset(int[] arr) {
        // code
        return null;
    }

    // medium
    // 429. Longest String Chain
    // Description: Add one char each step.
    // Example input : words=["a","b","ba","bca","bda","bdca"]
    // Example output: 4
    public static int longestStrChain(String[] words) {
        // code
        return 0;
    }

    // medium
    // 430. Longest Bitonic Subsequence
    // Description: Increasing then decreasing.
    // Example input : arr=[1,11,2,10,4,5,2,1]
    // Example output: 6
    public static int longestBitonicSubsequence(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 431. Number of Longest Increasing Subsequences
    // Description: Count LIS.
    // Example input : arr=[1,3,5,4,7]
    // Example output: 2
    public static int findNumberOfLIS(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 432. Maximal Square
    // Description: Largest square of 1s area.
    // Example input : matrix=[[1,0,1],[1,1,1],[1,1,1]]
    // Example output: 4
    public static int maximalSquare(char[][] matrix) {
        // code
        return 0;
    }

    // medium
    // 433. Fibonacci with Memoization
    // Description: Top-down DP.
    // Example input : n=10
    // Example output: 55
    public static int fibMemo(int n) {
        // code
        return 0;
    }

    // medium
    // 434. Longest Palindromic Substring (DP)
    // Description: Using DP table.
    // Example input : s="cbbd"
    // Example output: "bb"
    public static String longestPalindromeDP(String s) {
        // code
        return null;
    }

    // hard
    // 435. Cherry Pickup II
    // Description: Two robots collect cherries.
    // Example input : grid=[[3,1,1],[2,5,1],[1,5,5],[2,1,1]]
    // Example output: 24
    public static int cherryPickup(int[][] grid) {
        // code
        return 0;
    }

    // hard
    // 436. Edit Distance
    // Description: Min ops to convert.
    // Example input : a="horse", b="ros"
    // Example output: 3
    public static int minDistance(String a, String b) {
        // code
        return 0;
    }

    // hard
    // 437. Wildcard Matching
    // Description: '?' and '*' matching.
    // Example input : s="aa", p="*"
    // Example output: true
    public static boolean isMatchWildcard(String s, String p) {
        // code
        return false;
    }

    // hard
    // 438. Regular Expression Matching
    // Description: '.' and '*' matching.
    // Example input : s="aa", p="a*"
    // Example output: true
    public static boolean isMatchRegex(String s, String p) {
        // code
        return false;
    }

    // hard
    // 439. Best Time to Buy and Sell Stock III
    // Description: At most two transactions.
    // Example input : prices=[3,3,5,0,0,3,1,4]
    // Example output: 6
    public static int maxProfitIII(int[] prices) {
        // code
        return 0;
    }

    // hard
    // 440. Best Time to Buy and Sell Stock IV
    // Description: At most k transactions.
    // Example input : k=2, prices=[2,4,1]
    // Example output: 2
    public static int maxProfitIV(int k, int[] prices) {
        // code
        return 0;
    }

    // hard
    // 441. Matrix Chain Multiplication
    // Description: Min multiplications.
    // Example input : arr=[10,20,30,40,50]
    // Example output: 38000
    public static int matrixMultiplication(int[] arr) {
        // code
        return 0;
    }

    // hard
    // 442. Minimum Cost to Cut a Stick
    // Description: Min cost.
    // Example input : n=7, cuts=[1,3,4,5]
    // Example output: 16
    public static int minCostCutStick(int n, int[] cuts) {
        // code
        return 0;
    }

    // hard
    // 443. Burst Balloons
    // Description: Max coins.
    // Example input : nums=[3,1,5,8]
    // Example output: 167
    public static int maxCoins(int[] nums) {
        // code
        return 0;
    }

    // hard
    // 444. Evaluate Boolean Expression to True
    // Description: Ways to parenthesize to true.
    // Example input : exp="T or F and T"
    // Example output: 2
    public static int evaluateExp(String exp) {
        // code
        return 0;
    }

    // hard
    // 445. Palindrome Partitioning II
    // Description: Min cuts.
    // Example input : s="aab"
    // Example output: 1
    public static int minCutPalindrome(String s) {
        // code
        return 0;
    }

    // hard
    // 446. Partition Array for Maximum Sum
    // Description: Subarrays up to size k.
    // Example input : arr=[1,15,7,9,2,5,10], k=3
    // Example output: 84
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        // code
        return 0;
    }

    // hard
    // 447. Maximum Rectangle Area with All 1s
    // Description: Largest rectangle of 1s.
    // Example input : matrix=[[1,0,1],[1,1,1]]
    // Example output: 3
    public static int maximalRectangleDP(int[][] matrix) {
        // code
        return 0;
    }

    // hard
    // 448. Count Square Submatrices with All 1s
    // Description: Count squares.
    // Example input : matrix=[[0,1,1,1],[1,1,1,1],[0,1,1,1]]
    // Example output: 15
    public static int countSquares(int[][] matrix) {
        // code
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
        System.out.println(frogJump(new int[]{10, 20, 30, 10}));
        System.out.println(frogJumpK(new int[]{10, 5, 20, 0, 15}, 2));
        System.out.println(maxNonAdjacentSum(new int[]{2, 1, 4, 9}));
        System.out.println(robCircular(new int[]{2, 3, 2}));
        System.out.println(ninjaTraining(new int[][]{{10, 40, 70}, {20, 50, 80}, {30, 60, 90}}));
        System.out.println(uniquePaths(3, 7));
        System.out.println(uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        System.out.println(minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        List<List<Integer>> tri = Arrays.asList(
            Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7), Arrays.asList(4, 1, 8, 3));
        System.out.println(minimumTotal(tri));
        System.out.println(minFallingPathSum(new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}}));
        System.out.println(subsetSumToK(new int[]{1, 2, 3, 4}, 4));
        System.out.println(canPartition(new int[]{1, 5, 11, 5}));
        System.out.println(minSubsetSumDifference(new int[]{1, 6, 11, 5}));
        System.out.println(countSubsetsWithSumK(new int[]{1, 2, 2, 3}, 3));
        System.out.println(countPartitions(new int[]{5, 2, 6, 4}, 3));
        System.out.println(knapsack(new int[]{1, 2, 4, 5}, new int[]{5, 4, 8, 6}, 5));
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
        System.out.println(change(5, new int[]{1, 2, 5}));
        System.out.println(unboundedKnapsack(new int[]{2, 4, 6}, new int[]{5, 11, 13}, 10));
        System.out.println(cutRod(new int[]{2, 5, 7, 8, 10}, 5));
        System.out.println(longestCommonSubsequence("abcde", "ace"));
        System.out.println(printLCS("abcde", "ace"));
        System.out.println(longestCommonSubstring("abcjklp", "acjkp"));
        System.out.println(longestPalindromeSubseq("bbbab"));
        System.out.println(minInsertions("mbadm"));
        System.out.println(minOperations("heap", "pea"));
        System.out.println(shortestCommonSupersequence("brute", "groot"));
        System.out.println(numDistinct("rabbbit", "rabbit"));
        System.out.println(maxProfitI(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfitII(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfitCooldown(new int[]{1, 2, 3, 0, 2}));
        System.out.println(maxProfitFee(new int[]{1, 3, 2, 8, 4, 9}, 2));
        System.out.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(printLIS(new int[]{5, 4, 11, 1, 16, 8}));
        System.out.println(lisBinarySearch(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(largestDivisibleSubset(new int[]{1, 2, 3}));
        System.out.println(longestStrChain(new String[]{"a", "b", "ba", "bca", "bda", "bdca"}));
        System.out.println(longestBitonicSubsequence(new int[]{1, 11, 2, 10, 4, 5, 2, 1}));
        System.out.println(findNumberOfLIS(new int[]{1, 3, 5, 4, 7}));
        char[][] sq = {{'1', '0', '1'}, {'1', '1', '1'}, {'1', '1', '1'}};
        System.out.println(maximalSquare(sq));
        System.out.println(fibMemo(10));
        System.out.println(longestPalindromeDP("cbbd"));
        System.out.println(cherryPickup(new int[][]{{3, 1, 1}, {2, 5, 1}, {1, 5, 5}, {2, 1, 1}}));
        System.out.println(minDistance("horse", "ros"));
        System.out.println(isMatchWildcard("aa", "*"));
        System.out.println(isMatchRegex("aa", "a*"));
        System.out.println(maxProfitIII(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        System.out.println(maxProfitIV(2, new int[]{2, 4, 1}));
        System.out.println(matrixMultiplication(new int[]{10, 20, 30, 40, 50}));
        System.out.println(minCostCutStick(7, new int[]{1, 3, 4, 5}));
        System.out.println(maxCoins(new int[]{3, 1, 5, 8}));
        System.out.println(evaluateExp("T or F and T"));
        System.out.println(minCutPalindrome("aab"));
        System.out.println(maxSumAfterPartitioning(new int[]{1, 15, 7, 9, 2, 5, 10}, 3));
        System.out.println(maximalRectangleDP(new int[][]{{1, 0, 1}, {1, 1, 1}}));
        System.out.println(countSquares(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}}));
    }
}
