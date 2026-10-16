import java.util.*;

public class RecursionBacktracking {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // medium
    // 181. Subsequences with Sum K (Print All)
    // Description: All subsequences summing to k.
    // Example input : arr=[1,2,1], k=2
    // Example output: [[1,1],[2]]
    public static List<List<Integer>> subsequencesWithSumK(int[] arr, int k) {
        // code
        return null;
    }

    // medium
    // 182. Count Subsequences with Sum K
    // Description: Number of subsequences summing to k.
    // Example input : arr=[4,9,2,5,1], k=10
    // Example output: 2
    public static int countSubsequences(int[] arr, int k) {
        // code
        return 0;
    }

    // medium
    // 183. Generate Parentheses
    // Description: All valid combinations of n pairs.
    // Example input : n=3
    // Example output: ["((()))","(()())","(())()","()(())","()()()"]
    public static List<String> generateParenthesis(int n) {
        // code
        return null;
    }

    // medium
    // 184. Subsets I (Subset Sums)
    // Description: Sums of all subsets, sorted.
    // Example input : arr=[2,3]
    // Example output: [0,2,3,5]
    public static List<Integer> subsetSums(int[] arr) {
        // code
        return null;
    }

    // medium
    // 185. Subsets II (Unique)
    // Description: All unique subsets with duplicates present.
    // Example input : arr=[1,2,2]
    // Example output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
    public static List<List<Integer>> subsetsWithDup(int[] arr) {
        // code
        return null;
    }

    // medium
    // 186. Combination Sum I
    // Description: Reuse numbers unlimited times.
    // Example input : arr=[2,3,6,7], target=7
    // Example output: [[2,2,3],[7]]
    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        // code
        return null;
    }

    // medium
    // 187. Combination Sum II
    // Description: Each number used once, unique results.
    // Example input : arr=[10,1,2,7,6,1,5], target=8
    // Example output: [[1,1,6],[1,2,5],[1,7],[2,6]]
    public static List<List<Integer>> combinationSum2(int[] arr, int target) {
        // code
        return null;
    }

    // medium
    // 188. Combination Sum III
    // Description: k numbers from 1..9 summing to n.
    // Example input : k=3, n=7
    // Example output: [[1,2,4]]
    public static List<List<Integer>> combinationSum3(int k, int n) {
        // code
        return null;
    }

    // medium
    // 189. Letter Combinations of Phone Number
    // Description: All letter combos.
    // Example input : digits="23"
    // Example output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    public static List<String> letterCombinations(String digits) {
        // code
        return null;
    }

    // medium
    // 190. Palindrome Partitioning
    // Description: All palindrome partitions.
    // Example input : s="aab"
    // Example output: [["a","a","b"],["aa","b"]]
    public static List<List<String>> partition(String s) {
        // code
        return null;
    }

    // medium
    // 191. Word Search
    // Description: Word path in grid.
    // Example input : board=[[A,B,C,E],[S,F,C,S],[A,D,E,E]], word="ABCCED"
    // Example output: true
    public static boolean exist(char[][] board, String word) {
        // code
        return false;
    }

    // medium
    // 192. Permutations I
    // Description: All permutations.
    // Example input : arr=[1,2,3]
    // Example output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    public static List<List<Integer>> permute(int[] arr) {
        // code
        return null;
    }

    // medium
    // 193. Permutation Sequence
    // Description: k-th permutation of 1..n.
    // Example input : n=3, k=3
    // Example output: "213"
    public static String getPermutation(int n, int k) {
        // code
        return null;
    }

    // medium
    // 194. Rat in a Maze
    // Description: All paths from (0,0) to (n-1,n-1) as D/L/R/U.
    // Example input : maze=[[1,0,0,0],[1,1,0,1],[1,1,0,0],[0,1,1,1]]
    // Example output: ["DDRDRR","DRDDRR"]
    public static List<String> findPaths(int[][] maze, int n) {
        // code
        return null;
    }

    // medium
    // 195. Expression Add Operators
    // Description: Insert + - * to reach target.
    // Example input : num="123", target=6
    // Example output: ["1*2*3","1+2+3"]
    public static List<String> addOperators(String num, int target) {
        // code
        return null;
    }

    // medium
    // 196. Kth Permutation of Array
    // Description: k-th lexicographic permutation.
    // Example input : arr=[1,2,3], k=4
    // Example output: [2,3,1]
    public static List<Integer> kthPermutation(int[] arr, int k) {
        // code
        return null;
    }

    // medium
    // 197. Power Set using Recursion
    // Description: All subsets.
    // Example input : arr=[1,2]
    // Example output: [[],[1],[2],[1,2]]
    public static List<List<Integer>> powerSet(int[] arr) {
        // code
        return null;
    }

    // hard
    // 198. N-Queens
    // Description: All distinct board placements.
    // Example input : n=4
    // Example output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
    public static List<List<String>> solveNQueens(int n) {
        // code
        return null;
    }

    // hard
    // 199. Sudoku Solver
    // Description: Fill the board in place.
    // Example input : 9x9 board
    // Example output: solved board
    public static void solveSudoku(char[][] board) {
        // code
    }

    // hard
    // 200. M-Coloring Problem
    // Description: Can graph be colored with m colors.
    // Example input : n=4, m=3
    // Example output: true
    public static boolean graphColoring(int[][] edges, int n, int m) {
        // code
        return false;
    }

    // hard
    // 201. Word Break (Print All Sentences)
    // Description: All sentences from dictionary.
    // Example input : s="catsanddog", dict=[cat,cats,and,sand,dog]
    // Example output: ["cats and dog","cat sand dog"]
    public static List<String> wordBreak(String s, List<String> dict) {
        // code
        return null;
    }

    public static void main(String[] args) {
        System.out.println(subsequencesWithSumK(new int[]{1, 2, 1}, 2));
        System.out.println(countSubsequences(new int[]{4, 9, 2, 5, 1}, 10));
        System.out.println(generateParenthesis(3));
        System.out.println(subsetSums(new int[]{2, 3}));
        System.out.println(subsetsWithDup(new int[]{1, 2, 2}));
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println(combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        System.out.println(combinationSum3(3, 7));
        System.out.println(letterCombinations("23"));
        System.out.println(partition("aab"));
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(exist(board, "ABCCED"));
        System.out.println(permute(new int[]{1, 2, 3}));
        System.out.println(getPermutation(3, 3));
        System.out.println(findPaths(new int[][]{{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}}, 4));
        System.out.println(addOperators("123", 6));
        System.out.println(kthPermutation(new int[]{1, 2, 3}, 4));
        System.out.println(powerSet(new int[]{1, 2}));
        System.out.println(solveNQueens(4));
        String[] rows = {
            "53..7....", "6..195...", ".98....6.",
            "8...6...3", "4..8.3..1", "7...2...6",
            ".6....28.", "...419..5", "....8..79"};
        char[][] sudoku = new char[9][];
        for (int i = 0; i < 9; i++) sudoku[i] = rows[i].toCharArray();
        solveSudoku(sudoku);
        for (char[] row : sudoku) System.out.println(new String(row));
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 0}, {0, 2}};
        System.out.println(graphColoring(edges, 4, 3));
        System.out.println(wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")));
    }
}
