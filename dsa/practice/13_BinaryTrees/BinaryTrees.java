import java.util.*;

public class BinaryTrees {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 293. Inorder Traversal
    // Description: Left, Root, Right.
    // Example input : root=[1,null,2,3]
    // Example output: [1,3,2]
    public static List<Integer> inorder(TreeNode root) {
        // code
        return null;
    }

    // easy
    // 294. Preorder Traversal
    // Description: Root, Left, Right.
    // Example input : root=[1,null,2,3]
    // Example output: [1,2,3]
    public static List<Integer> preorder(TreeNode root) {
        // code
        return null;
    }

    // easy
    // 295. Postorder Traversal
    // Description: Left, Right, Root.
    // Example input : root=[1,null,2,3]
    // Example output: [3,2,1]
    public static List<Integer> postorder(TreeNode root) {
        // code
        return null;
    }

    // easy
    // 296. Maximum Depth of Binary Tree
    // Description: Height of the tree.
    // Example input : root=[3,9,20,null,null,15,7]
    // Example output: 3
    public static int maxDepth(TreeNode root) {
        // code
        return 0;
    }

    // easy
    // 297. Check for Balanced Binary Tree
    // Description: Height difference <= 1 for all nodes.
    // Example input : root=[3,9,20,null,null,15,7]
    // Example output: true
    public static boolean isBalanced(TreeNode root) {
        // code
        return false;
    }

    // easy
    // 298. Check if Two Trees are Identical
    // Description: Structure and values equal.
    // Example input : p=[1,2,3], q=[1,2,3]
    // Example output: true
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // code
        return false;
    }

    // easy
    // 299. Search in a BST
    // Description: Find node with value.
    // Example input : root=[4,2,7,1,3], val=2
    // Example output: [2,1,3]
    public static TreeNode searchBST(TreeNode root, int val) {
        // code
        return null;
    }

    // easy
    // 300. Minimum/Maximum in BST
    // Description: Smallest value.
    // Example input : root=[4,2,7,1,3]
    // Example output: 1
    public static int findMinBST(TreeNode root) {
        // code
        return 0;
    }

    // easy
    // 301. Ceil in BST
    // Description: Smallest value >= key.
    // Example input : root=[10,5,13,2,6,11,14], key=8
    // Example output: 10
    public static int ceilBST(TreeNode root, int key) {
        // code
        return 0;
    }

    // easy
    // 302. Floor in BST
    // Description: Largest value <= key.
    // Example input : root=[10,5,13,2,6,11,14], key=8
    // Example output: 6
    public static int floorBST(TreeNode root, int key) {
        // code
        return 0;
    }

    // medium
    // 303. Level Order Traversal
    // Description: BFS level by level.
    // Example input : root=[3,9,20,null,null,15,7]
    // Example output: [[3],[9,20],[15,7]]
    public static List<List<Integer>> levelOrder(TreeNode root) {
        // code
        return null;
    }

    // medium
    // 304. Iterative Preorder Traversal
    // Description: Using a stack.
    // Example input : root=[1,2,3]
    // Example output: [1,2,3]
    public static List<Integer> preorderIterative(TreeNode root) {
        // code
        return null;
    }

    // medium
    // 305. Iterative Inorder Traversal
    // Description: Using a stack.
    // Example input : root=[1,2,3]
    // Example output: [2,1,3]
    public static List<Integer> inorderIterative(TreeNode root) {
        // code
        return null;
    }

    // medium
    // 306. Iterative Postorder (2 Stacks)
    // Description: Using two stacks.
    // Example input : root=[1,2,3]
    // Example output: [2,3,1]
    public static List<Integer> postorderTwoStacks(TreeNode root) {
        // code
        return null;
    }

    // medium
    // 307. Iterative Postorder (1 Stack)
    // Description: Using one stack.
    // Example input : root=[1,2,3]
    // Example output: [2,3,1]
    public static List<Integer> postorderOneStack(TreeNode root) {
        // code
        return null;
    }

    // medium
    // 308. Preorder, Inorder and Postorder in One Traversal
    // Description: Single traversal for all three.
    // Example input : root=[1,2,3]
    // Example output: [[1,2,3],[2,1,3],[2,3,1]]
    public static List<List<Integer>> allTraversals(TreeNode root) {
        // code
        return null;
    }

    // medium
    // 309. Diameter of Binary Tree
    // Description: Longest path between any two nodes (edges).
    // Example input : root=[1,2,3,4,5]
    // Example output: 3
    public static int diameterOfBinaryTree(TreeNode root) {
        // code
        return 0;
    }

    // medium
    // 310. Zigzag Level Order Traversal
    // Description: Alternate direction per level.
    // Example input : root=[3,9,20,null,null,15,7]
    // Example output: [[3],[20,9],[15,7]]
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // code
        return null;
    }

    // medium
    // 311. Boundary Traversal
    // Description: Anticlockwise boundary.
    // Example input : root=[1,2,3,4,5,6,7]
    // Example output: [1,2,4,5,6,7,3]
    public static List<Integer> boundaryTraversal(TreeNode root) {
        // code
        return null;
    }

    // medium
    // 312. Vertical Order Traversal
    // Description: Column by column.
    // Example input : root=[3,9,20,null,null,15,7]
    // Example output: [[9],[3,15],[20],[7]]
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        // code
        return null;
    }

    // medium
    // 313. Top View of Binary Tree
    // Description: Nodes visible from top.
    // Example input : root=[1,2,3,4,5,6,7]
    // Example output: [4,2,1,3,7]
    public static List<Integer> topView(TreeNode root) {
        // code
        return null;
    }

    // medium
    // 314. Bottom View of Binary Tree
    // Description: Nodes visible from bottom.
    // Example input : root=[20,8,22,5,3,4,25]
    // Example output: [5,10,3,14,25]
    public static List<Integer> bottomView(TreeNode root) {
        // code
        return null;
    }

    // medium
    // 315. Right/Left View of Binary Tree
    // Description: Nodes visible from right.
    // Example input : root=[1,2,3,null,5,null,4]
    // Example output: [1,3,4]
    public static List<Integer> rightView(TreeNode root) {
        // code
        return null;
    }

    // medium
    // 316. Check for Symmetrical Binary Tree
    // Description: Mirror of itself.
    // Example input : root=[1,2,2,3,4,4,3]
    // Example output: true
    public static boolean isSymmetric(TreeNode root) {
        // code
        return false;
    }

    // medium
    // 317. Root to Node Path
    // Description: Path from root to node x.
    // Example input : root=[1,2,3,4,5,6,7], x=7
    // Example output: [1,3,7]
    public static List<Integer> rootToNode(TreeNode root, int x) {
        // code
        return null;
    }

    // medium
    // 318. Lowest Common Ancestor
    // Description: LCA of two nodes.
    // Example input : root=[3,5,1,6,2,0,8], p=5, q=1
    // Example output: 3
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // code
        return null;
    }

    // medium
    // 319. Maximum Width of Binary Tree
    // Description: Max width among levels.
    // Example input : root=[1,3,2,5,3,null,9]
    // Example output: 4
    public static int widthOfBinaryTree(TreeNode root) {
        // code
        return 0;
    }

    // medium
    // 320. Children Sum Property
    // Description: Node value equals sum of children.
    // Example input : root=[10,10]
    // Example output: true
    public static boolean checkChildrenSum(TreeNode root) {
        // code
        return false;
    }

    // medium
    // 321. Count Complete Tree Nodes
    // Description: Count nodes of complete tree under O(n).
    // Example input : root=[1,2,3,4,5,6]
    // Example output: 6
    public static int countNodes(TreeNode root) {
        // code
        return 0;
    }

    // medium
    // 322. Flatten Binary Tree to Linked List
    // Description: Flatten in preorder in place.
    // Example input : root=[1,2,5,3,4,null,6]
    // Example output: 1->2->3->4->5->6
    public static void flatten(TreeNode root) {
        // code
    }

    // medium
    // 323. Insert a Node in BST
    // Description: Insert value.
    // Example input : root=[4,2,7,1,3], val=5
    // Example output: [4,2,7,1,3,5]
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        // code
        return null;
    }

    // medium
    // 324. Delete a Node in BST
    // Description: Delete key.
    // Example input : root=[5,3,6,2,4,null,7], key=3
    // Example output: [5,4,6,2,null,null,7]
    public static TreeNode deleteNode(TreeNode root, int key) {
        // code
        return null;
    }

    // medium
    // 325. Kth Smallest Element in BST
    // Description: K-th smallest.
    // Example input : root=[3,1,4,null,2], k=1
    // Example output: 1
    public static int kthSmallest(TreeNode root, int k) {
        // code
        return 0;
    }

    // medium
    // 326. Kth Largest Element in BST
    // Description: K-th largest.
    // Example input : root=[3,1,4,null,2], k=1
    // Example output: 4
    public static int kthLargest(TreeNode root, int k) {
        // code
        return 0;
    }

    // medium
    // 327. Validate BST
    // Description: Check BST property.
    // Example input : root=[2,1,3]
    // Example output: true
    public static boolean isValidBST(TreeNode root) {
        // code
        return false;
    }

    // medium
    // 328. LCA in BST
    // Description: LCA in BST.
    // Example input : root=[6,2,8,0,4,7,9], p=2, q=8
    // Example output: 6
    public static TreeNode lcaBST(TreeNode root, TreeNode p, TreeNode q) {
        // code
        return null;
    }

    // medium
    // 329. Construct BST from Preorder
    // Description: Build BST.
    // Example input : preorder=[8,5,1,7,10,12]
    // Example output: [8,5,10,1,7,null,12]
    public static TreeNode bstFromPreorder(int[] preorder) {
        // code
        return null;
    }

    // medium
    // 330. Inorder Successor / Predecessor in BST
    // Description: Next inorder node.
    // Example input : root=[2,1,3], p=1
    // Example output: 2
    public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        // code
        return null;
    }

    // medium
    // 331. BST Iterator
    // Description: next() and hasNext() in O(h) space.
    // Example input : root=[7,3,15,null,null,9,20]
    // Example output: 3, 7, 9
    public static void bstIterator() {
        // code
    }

    // medium
    // 332. Two Sum IV - Input is a BST
    // Description: Two nodes sum to k.
    // Example input : root=[5,3,6,2,4,null,7], k=9
    // Example output: true
    public static boolean findTarget(TreeNode root, int k) {
        // code
        return false;
    }

    // hard
    // 333. Maximum Path Sum
    // Description: Max sum of any path.
    // Example input : root=[-10,9,20,null,null,15,7]
    // Example output: 42
    public static int maxPathSum(TreeNode root) {
        // code
        return 0;
    }

    // hard
    // 334. All Nodes at Distance K
    // Description: Nodes k away from target.
    // Example input : root=[3,5,1,6,2,0,8,null,null,7,4], target=5, k=2
    // Example output: [7,4,1]
    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // code
        return null;
    }

    // hard
    // 335. Minimum Time to Burn Tree
    // Description: Time to burn the whole tree from a node.
    // Example input : root=[1,2,3,4,5,null,6], start=2
    // Example output: 3
    public static int timeToBurn(TreeNode root, int start) {
        // code
        return 0;
    }

    // hard
    // 336. Construct Tree from Preorder and Inorder
    // Description: Build the tree.
    // Example input : preorder=[3,9,20,15,7], inorder=[9,3,15,20,7]
    // Example output: [3,9,20,null,null,15,7]
    public static TreeNode buildTreePreIn(int[] preorder, int[] inorder) {
        // code
        return null;
    }

    // hard
    // 337. Construct Tree from Inorder and Postorder
    // Description: Build the tree.
    // Example input : inorder=[9,3,15,20,7], postorder=[9,15,7,20,3]
    // Example output: [3,9,20,null,null,15,7]
    public static TreeNode buildTreeInPost(int[] inorder, int[] postorder) {
        // code
        return null;
    }

    // hard
    // 338. Serialize and Deserialize Binary Tree
    // Description: Convert tree to string (and back).
    // Example input : root=[1,2,3,null,null,4,5]
    // Example output: "1,2,3,#,#,4,5"
    public static String serialize(TreeNode root) {
        // code
        return null;
    }

    // hard
    // 339. Morris Inorder Traversal
    // Description: O(1) space inorder.
    // Example input : root=[1,null,2,3]
    // Example output: [1,3,2]
    public static List<Integer> morrisInorder(TreeNode root) {
        // code
        return null;
    }

    // hard
    // 340. Morris Preorder Traversal
    // Description: O(1) space preorder.
    // Example input : root=[1,null,2,3]
    // Example output: [1,2,3]
    public static List<Integer> morrisPreorder(TreeNode root) {
        // code
        return null;
    }

    // hard
    // 341. Recover BST
    // Description: Two nodes swapped; fix.
    // Example input : root=[1,3,null,null,2]
    // Example output: [3,1,null,null,2]
    public static void recoverTree(TreeNode root) {
        // code
    }

    // hard
    // 342. Largest BST in Binary Tree
    // Description: Size of largest BST subtree.
    // Example input : root=[10,5,15,1,8,null,7]
    // Example output: 3
    public static int largestBST(TreeNode root) {
        // code
        return 0;
    }

    static TreeNode build(Integer... v) {
        if (v.length == 0 || v[0] == null) return null;
        TreeNode root = new TreeNode(v[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < v.length) {
            TreeNode n = q.poll();
            if (i < v.length && v[i] != null) { n.left = new TreeNode(v[i]); q.add(n.left); }
            i++;
            if (i < v.length && v[i] != null) { n.right = new TreeNode(v[i]); q.add(n.right); }
            i++;
        }
        return root;
    }

    static TreeNode find(TreeNode r, int x) {
        if (r == null) return null;
        if (r.val == x) return r;
        TreeNode l = find(r.left, x);
        return l != null ? l : find(r.right, x);
    }

    static String show(TreeNode root) {
        if (root == null) return "[]";
        List<String> out = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            if (n == null) { out.add("null"); continue; }
            out.add(String.valueOf(n.val));
            q.add(n.left);
            q.add(n.right);
        }
        while (out.get(out.size() - 1).equals("null")) out.remove(out.size() - 1);
        return out.toString();
    }

    static String val(TreeNode n) {
        return n == null ? "null" : String.valueOf(n.val);
    }

    public static void main(String[] args) {
        TreeNode t1 = build(1, null, 2, 3);
        System.out.println(inorder(t1));
        System.out.println(preorder(t1));
        System.out.println(postorder(t1));
        TreeNode t2 = build(3, 9, 20, null, null, 15, 7);
        System.out.println(maxDepth(t2));
        System.out.println(isBalanced(t2));
        System.out.println(isSameTree(build(1, 2, 3), build(1, 2, 3)));
        TreeNode b1 = build(4, 2, 7, 1, 3);
        System.out.println(val(searchBST(b1, 2)));
        System.out.println(findMinBST(b1));
        TreeNode b2 = build(10, 5, 13, 2, 6, 11, 14);
        System.out.println(ceilBST(b2, 8));
        System.out.println(floorBST(b2, 8));
        System.out.println(levelOrder(t2));
        TreeNode t3 = build(1, 2, 3);
        System.out.println(preorderIterative(t3));
        System.out.println(inorderIterative(t3));
        System.out.println(postorderTwoStacks(t3));
        System.out.println(postorderOneStack(t3));
        System.out.println(allTraversals(t3));
        System.out.println(diameterOfBinaryTree(build(1, 2, 3, 4, 5)));
        System.out.println(zigzagLevelOrder(t2));
        TreeNode t7 = build(1, 2, 3, 4, 5, 6, 7);
        System.out.println(boundaryTraversal(t7));
        System.out.println(verticalTraversal(t2));
        System.out.println(topView(t7));
        System.out.println(bottomView(build(20, 8, 22, 5, 3, 4, 25)));
        System.out.println(rightView(build(1, 2, 3, null, 5, null, 4)));
        System.out.println(isSymmetric(build(1, 2, 2, 3, 4, 4, 3)));
        System.out.println(rootToNode(t7, 7));
        TreeNode l = build(3, 5, 1, 6, 2, 0, 8);
        System.out.println(val(lowestCommonAncestor(l, find(l, 5), find(l, 1))));
        System.out.println(widthOfBinaryTree(build(1, 3, 2, 5, 3, null, 9)));
        System.out.println(checkChildrenSum(build(10, 10)));
        System.out.println(countNodes(build(1, 2, 3, 4, 5, 6)));
        TreeNode f = build(1, 2, 5, 3, 4, null, 6);
        flatten(f);
        System.out.println(show(f));
        System.out.println(show(insertIntoBST(build(4, 2, 7, 1, 3), 5)));
        System.out.println(show(deleteNode(build(5, 3, 6, 2, 4, null, 7), 3)));
        System.out.println(kthSmallest(build(3, 1, 4, null, 2), 1));
        System.out.println(kthLargest(build(3, 1, 4, null, 2), 1));
        System.out.println(isValidBST(build(2, 1, 3)));
        TreeNode lb = build(6, 2, 8, 0, 4, 7, 9);
        System.out.println(val(lcaBST(lb, find(lb, 2), find(lb, 8))));
        System.out.println(show(bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12})));
        TreeNode s = build(2, 1, 3);
        System.out.println(val(inorderSuccessor(s, find(s, 1))));
        bstIterator();
        System.out.println(findTarget(build(5, 3, 6, 2, 4, null, 7), 9));
        System.out.println(maxPathSum(build(-10, 9, 20, null, null, 15, 7)));
        TreeNode d = build(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        System.out.println(distanceK(d, find(d, 5), 2));
        System.out.println(timeToBurn(build(1, 2, 3, 4, 5, null, 6), 2));
        System.out.println(show(buildTreePreIn(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7})));
        System.out.println(show(buildTreeInPost(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3})));
        System.out.println(serialize(build(1, 2, 3, null, null, 4, 5)));
        System.out.println(morrisInorder(t1));
        System.out.println(morrisPreorder(t1));
        TreeNode rc = build(1, 3, null, null, 2);
        recoverTree(rc);
        System.out.println(show(rc));
        System.out.println(largestBST(build(10, 5, 15, 1, 8, null, 7)));
    }
}
