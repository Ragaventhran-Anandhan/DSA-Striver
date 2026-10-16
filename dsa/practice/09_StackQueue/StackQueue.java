import java.util.*;

public class StackQueue {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 217. Implement Stack using Arrays
    // Description: Implement push, pop, top, isEmpty using array.
    // Example input : push(1) push(2) top()
    // Example output: 2
    public static void implementStackArray() {
        // code
    }

    // easy
    // 218. Implement Queue using Arrays
    // Description: Implement enqueue, dequeue, front.
    // Example input : enqueue(1) enqueue(2) front()
    // Example output: 1
    public static void implementQueueArray() {
        // code
    }

    // easy
    // 219. Implement Stack using Queues
    // Description: Stack via two queues.
    // Example input : push(1) push(2) pop()
    // Example output: 2
    public static void implementStackUsingQueues() {
        // code
    }

    // easy
    // 220. Implement Queue using Stacks
    // Description: Queue via two stacks.
    // Example input : push(1) push(2) pop()
    // Example output: 1
    public static void implementQueueUsingStacks() {
        // code
    }

    // easy
    // 221. Implement Stack using Linked List
    // Description: Stack via linked list.
    // Example input : push(1) push(2) pop()
    // Example output: 2
    public static void implementStackLL() {
        // code
    }

    // easy
    // 222. Implement Queue using Linked List
    // Description: Queue via linked list.
    // Example input : enqueue(1) enqueue(2) dequeue()
    // Example output: 1
    public static void implementQueueLL() {
        // code
    }

    // easy
    // 223. Valid Parentheses
    // Description: Brackets properly matched.
    // Example input : s="()[]{}"
    // Example output: true
    public static boolean isValid(String s) {
        // code
        return false;
    }

    // medium
    // 224. Min Stack
    // Description: push, pop, top, getMin in O(1).
    // Example input : push(-2) push(0) push(-3) getMin()
    // Example output: -3
    public static void minStack() {
        // code
    }

    // medium
    // 225. Infix to Postfix
    // Description: Convert infix.
    // Example input : s="a+b*c"
    // Example output: "abc*+"
    public static String infixToPostfix(String s) {
        // code
        return null;
    }

    // medium
    // 226. Prefix to Infix
    // Description: Convert prefix.
    // Example input : s="*+PQ-MN"
    // Example output: "((P+Q)*(M-N))"
    public static String prefixToInfix(String s) {
        // code
        return null;
    }

    // medium
    // 227. Prefix to Postfix
    // Description: Convert prefix.
    // Example input : s="/-AB*+DEF"
    // Example output: "AB-DE+F*/"
    public static String prefixToPostfix(String s) {
        // code
        return null;
    }

    // medium
    // 228. Postfix to Prefix
    // Description: Convert postfix.
    // Example input : s="AB+CD-*"
    // Example output: "*+AB-CD"
    public static String postfixToPrefix(String s) {
        // code
        return null;
    }

    // medium
    // 229. Postfix to Infix
    // Description: Convert postfix.
    // Example input : s="ab*c+"
    // Example output: "((a*b)+c)"
    public static String postfixToInfix(String s) {
        // code
        return null;
    }

    // medium
    // 230. Infix to Prefix
    // Description: Convert infix.
    // Example input : s="(a+b)*c"
    // Example output: "*+abc"
    public static String infixToPrefix(String s) {
        // code
        return null;
    }

    // medium
    // 231. Next Greater Element I
    // Description: Next greater to the right, -1 if none.
    // Example input : arr=[4,5,2,25]
    // Example output: [5,25,25,-1]
    public static int[] nextGreaterElement(int[] arr) {
        // code
        return null;
    }

    // medium
    // 232. Next Greater Element II (Circular)
    // Description: Circular array.
    // Example input : arr=[1,2,1]
    // Example output: [2,-1,2]
    public static int[] nextGreaterCircular(int[] arr) {
        // code
        return null;
    }

    // medium
    // 233. Next Smaller Element
    // Description: Next smaller to the right.
    // Example input : arr=[4,8,5,2,25]
    // Example output: [2,5,2,-1,-1]
    public static int[] nextSmallerElement(int[] arr) {
        // code
        return null;
    }

    // medium
    // 234. Number of Greater Elements to the Right
    // Description: Count greater elements right of index.
    // Example input : arr=[3,4,2,7,5,8,10,6], queries=[0,5]
    // Example output: [6,1]
    public static int[] countGreaterRight(int[] arr, int[] queries) {
        // code
        return null;
    }

    // medium
    // 235. Trapping Rain Water
    // Description: Total trapped water.
    // Example input : height=[0,1,0,2,1,0,1,3,2,1,2,1]
    // Example output: 6
    public static int trap(int[] height) {
        // code
        return 0;
    }

    // medium
    // 236. Sum of Subarray Minimums
    // Description: Sum of minimums of all subarrays mod 1e9+7.
    // Example input : arr=[3,1,2,4]
    // Example output: 17
    public static int sumSubarrayMins(int[] arr) {
        // code
        return 0;
    }

    // medium
    // 237. Asteroid Collision
    // Description: Simulate collisions.
    // Example input : asteroids=[5,10,-5]
    // Example output: [5,10]
    public static int[] asteroidCollision(int[] asteroids) {
        // code
        return null;
    }

    // medium
    // 238. Stock Span Problem
    // Description: Consecutive days with price <= today.
    // Example input : prices=[100,80,60,70,60,75,85]
    // Example output: [1,1,1,2,1,4,6]
    public static int[] stockSpan(int[] prices) {
        // code
        return null;
    }

    // medium
    // 239. The Celebrity Problem
    // Description: Celebrity known by all, knows none.
    // Example input : knows=[[0,1,0],[0,0,0],[0,1,0]]
    // Example output: 1
    public static int findCelebrity(int[][] knows) {
        // code
        return 0;
    }

    // hard
    // 240. Sum of Subarray Ranges
    // Description: Sum of (max-min) over subarrays.
    // Example input : arr=[1,2,3]
    // Example output: 4
    public static long subArrayRanges(int[] arr) {
        // code
        return 0L;
    }

    // hard
    // 241. Remove K Digits
    // Description: Smallest number after removing k digits.
    // Example input : num="1432219", k=3
    // Example output: "1219"
    public static String removeKdigits(String num, int k) {
        // code
        return null;
    }

    // hard
    // 242. Largest Rectangle in Histogram
    // Description: Largest rectangle area.
    // Example input : heights=[2,1,5,6,2,3]
    // Example output: 10
    public static int largestRectangleArea(int[] heights) {
        // code
        return 0;
    }

    // hard
    // 243. Maximal Rectangle
    // Description: Largest rectangle of 1s.
    // Example input : matrix=[[1,0,1,0,0],[1,0,1,1,1],[1,1,1,1,1],[1,0,0,1,0]]
    // Example output: 6
    public static int maximalRectangle(char[][] matrix) {
        // code
        return 0;
    }

    // hard
    // 244. LRU Cache
    // Description: get and put in O(1) with capacity.
    // Example input : capacity=2, put(1,1) put(2,2) get(1) put(3,3) get(2)
    // Example output: 1, -1
    public static void lruCache() {
        // code
    }

    // hard
    // 245. LFU Cache
    // Description: Evict least frequently used.
    // Example input : capacity=2, put(1,1) put(2,2) get(1) put(3,3) get(2)
    // Example output: 1, -1
    public static void lfuCache() {
        // code
    }

    public static void main(String[] args) {
        implementStackArray();
        implementQueueArray();
        implementStackUsingQueues();
        implementQueueUsingStacks();
        implementStackLL();
        implementQueueLL();
        System.out.println(isValid("()[]{}"));
        minStack();
        System.out.println(infixToPostfix("a+b*c"));
        System.out.println(prefixToInfix("*+PQ-MN"));
        System.out.println(prefixToPostfix("/-AB*+DEF"));
        System.out.println(postfixToPrefix("AB+CD-*"));
        System.out.println(postfixToInfix("ab*c+"));
        System.out.println(infixToPrefix("(a+b)*c"));
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4, 5, 2, 25})));
        System.out.println(Arrays.toString(nextGreaterCircular(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(nextSmallerElement(new int[]{4, 8, 5, 2, 25})));
        System.out.println(Arrays.toString(countGreaterRight(new int[]{3, 4, 2, 7, 5, 8, 10, 6}, new int[]{0, 5})));
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(sumSubarrayMins(new int[]{3, 1, 2, 4}));
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, 10, -5})));
        System.out.println(Arrays.toString(stockSpan(new int[]{100, 80, 60, 70, 60, 75, 85})));
        System.out.println(findCelebrity(new int[][]{{0, 1, 0}, {0, 0, 0}, {0, 1, 0}}));
        System.out.println(subArrayRanges(new int[]{1, 2, 3}));
        System.out.println(removeKdigits("1432219", 3));
        System.out.println(largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        char[][] m = {"10100".toCharArray(), "10111".toCharArray(), "11111".toCharArray(), "10010".toCharArray()};
        System.out.println(maximalRectangle(m));
        lruCache();
        lfuCache();
    }
}
