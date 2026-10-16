import java.util.*;

public class Graphs {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 343. Print Adjacency List
    // Description: Build adjacency list.
    // Example input : n=3, edges=[[0,1],[1,2]]
    // Example output: [[1],[0,2],[1]]
    public static List<List<Integer>> adjacencyList(int n, int[][] edges) {
        // code
        return null;
    }

    // easy
    // 344. BFS of Graph
    // Description: Breadth-first traversal from 0.
    // Example input : adj=[[1,2],[0],[0]]
    // Example output: [0,1,2]
    public static List<Integer> bfsOfGraph(int v, List<List<Integer>> adj) {
        // code
        return null;
    }

    // easy
    // 345. DFS of Graph
    // Description: Depth-first traversal from 0.
    // Example input : adj=[[1,2],[0],[0]]
    // Example output: [0,1,2]
    public static List<Integer> dfsOfGraph(int v, List<List<Integer>> adj) {
        // code
        return null;
    }

    // medium
    // 346. Number of Provinces
    // Description: Count connected components.
    // Example input : isConnected=[[1,1,0],[1,1,0],[0,0,1]]
    // Example output: 2
    public static int findCircleNum(int[][] isConnected) {
        // code
        return 0;
    }

    // medium
    // 347. Number of Islands
    // Description: Count islands.
    // Example input : grid=[[1,1,0],[0,1,0],[0,0,1]]
    // Example output: 2
    public static int numIslands(char[][] grid) {
        // code
        return 0;
    }

    // medium
    // 348. Flood Fill
    // Description: Fill connected region.
    // Example input : image=[[1,1,1],[1,1,0],[1,0,1]], sr=1, sc=1, color=2
    // Example output: [[2,2,2],[2,2,0],[2,0,1]]
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // code
        return null;
    }

    // medium
    // 349. Rotten Oranges
    // Description: Minutes until all rotten.
    // Example input : grid=[[2,1,1],[1,1,0],[0,1,1]]
    // Example output: 4
    public static int orangesRotting(int[][] grid) {
        // code
        return 0;
    }

    // medium
    // 350. Distance of Nearest Cell Having 1
    // Description: Nearest 1 distance.
    // Example input : mat=[[0,0,0],[0,1,0],[1,1,1]]
    // Example output: [[0,0,0],[0,1,0],[1,2,1]]
    public static int[][] updateMatrix(int[][] mat) {
        // code
        return null;
    }

    // medium
    // 351. Surrounded Regions
    // Description: Capture regions of O.
    // Example input : board=[[X,X,X],[X,O,X],[X,X,X]]
    // Example output: [[X,X,X],[X,X,X],[X,X,X]]
    public static void solveSurrounded(char[][] board) {
        // code
    }

    // medium
    // 352. Number of Enclaves
    // Description: Land cells not reaching boundary.
    // Example input : grid=[[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
    // Example output: 3
    public static int numEnclaves(int[][] grid) {
        // code
        return 0;
    }

    // medium
    // 353. Word Ladder I
    // Description: Shortest transformation length.
    // Example input : begin="hit", end="cog", wordList=[hot,dot,dog,lot,log,cog]
    // Example output: 5
    public static int ladderLength(String begin, String end, List<String> wordList) {
        // code
        return 0;
    }

    // medium
    // 354. Number of Distinct Islands
    // Description: Distinct island shapes.
    // Example input : grid=[[1,1,0],[1,0,0],[0,0,1]]
    // Example output: 2
    public static int countDistinctIslands(int[][] grid) {
        // code
        return 0;
    }

    // medium
    // 355. Is Graph Bipartite
    // Description: Two-colorable.
    // Example input : graph=[[1,3],[0,2],[1,3],[0,2]]
    // Example output: true
    public static boolean isBipartite(int[][] graph) {
        // code
        return false;
    }

    // medium
    // 356. Detect Cycle in Undirected Graph (BFS)
    // Description: Cycle detection.
    // Example input : adj=[[1,2],[0,2],[0,1]]
    // Example output: true
    public static boolean hasCycleBFS(int v, List<List<Integer>> adj) {
        // code
        return false;
    }

    // medium
    // 357. Detect Cycle in Undirected Graph (DFS)
    // Description: Cycle detection.
    // Example input : adj=[[1,2],[0,2],[0,1]]
    // Example output: true
    public static boolean hasCycleDFS(int v, List<List<Integer>> adj) {
        // code
        return false;
    }

    // medium
    // 358. Detect Cycle in Directed Graph (DFS)
    // Description: Cycle detection.
    // Example input : adj=[[1],[2],[0]]
    // Example output: true
    public static boolean hasCycleDirected(int v, List<List<Integer>> adj) {
        // code
        return false;
    }

    // medium
    // 359. Find Eventual Safe States
    // Description: Nodes leading only to terminals.
    // Example input : graph=[[1,2],[2,3],[5],[0],[5],[],[]]
    // Example output: [2,4,5,6]
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        // code
        return null;
    }

    // medium
    // 360. Topological Sort (DFS)
    // Description: Ordering of DAG.
    // Example input : adj=[[],[],[3],[1],[0,1],[0,2]]
    // Example output: [5,4,2,3,1,0]
    public static int[] topoSortDFS(int v, List<List<Integer>> adj) {
        // code
        return null;
    }

    // medium
    // 361. Topological Sort (Kahn's BFS)
    // Description: Ordering via indegree.
    // Example input : adj=[[],[],[3],[1],[0,1],[0,2]]
    // Example output: [4,5,0,2,3,1]
    public static int[] topoSortKahn(int v, List<List<Integer>> adj) {
        // code
        return null;
    }

    // medium
    // 362. Course Schedule I
    // Description: Can all courses be taken.
    // Example input : numCourses=2, prerequisites=[[1,0]]
    // Example output: true
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // code
        return false;
    }

    // medium
    // 363. Course Schedule II
    // Description: Return an order.
    // Example input : numCourses=4, prerequisites=[[1,0],[2,0],[3,1],[3,2]]
    // Example output: [0,1,2,3]
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        // code
        return null;
    }

    // medium
    // 364. Shortest Path in Undirected Graph with Unit Weights
    // Description: BFS distances.
    // Example input : n=3, edges=[[0,1],[1,2]], src=0
    // Example output: [0,1,2]
    public static int[] shortestPathUnit(int n, int[][] edges, int src) {
        // code
        return null;
    }

    // medium
    // 365. Shortest Path in DAG
    // Description: Weighted DAG from node 0.
    // Example input : n=4, edges=[[0,1,2],[0,2,1],[1,3,1],[2,3,3]]
    // Example output: [0,2,1,3]
    public static int[] shortestPathDAG(int n, int[][] edges) {
        // code
        return null;
    }

    // medium
    // 366. Word Ladder (Shortest Path BFS)
    // Description: BFS version.
    // Example input : begin="hit", end="cog"
    // Example output: 5
    public static int wordLadderBFS(String begin, String end, List<String> words) {
        // code
        return 0;
    }

    // medium
    // 367. Dijkstra's Algorithm
    // Description: Shortest path in weighted graph.
    // Example input : adj=[[[1,1],[2,6]],[[2,2]],[]], src=0
    // Example output: [0,1,3]
    public static int[] dijkstra(int v, List<List<int[]>> adj, int src) {
        // code
        return null;
    }

    // medium
    // 368. Print Shortest Path (Dijkstra)
    // Description: Return the path from 1 to n.
    // Example input : n=5, edges=[[1,2,2],[2,5,5],[2,3,4],[1,4,1],[4,3,3],[3,5,1]]
    // Example output: [1,4,3,5]
    public static List<Integer> dijkstraPath(int n, int[][] edges) {
        // code
        return null;
    }

    // medium
    // 369. Shortest Distance in Binary Maze
    // Description: Shortest path in 0/1 grid.
    // Example input : grid=[[1,1,1],[1,0,1],[1,1,1]], src=[0,0], dest=[2,2]
    // Example output: 4
    public static int shortestPathBinaryMatrix(int[][] grid, int[] src, int[] dest) {
        // code
        return 0;
    }

    // medium
    // 370. Path with Minimum Effort
    // Description: Minimize max abs difference.
    // Example input : heights=[[1,2,2],[3,8,2],[5,3,5]]
    // Example output: 2
    public static int minimumEffortPath(int[][] heights) {
        // code
        return 0;
    }

    // medium
    // 371. Cheapest Flights Within K Stops
    // Description: Cheapest with at most k stops.
    // Example input : n=4, flights=[[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src=0, dst=3, k=1
    // Example output: 700
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // code
        return 0;
    }

    // medium
    // 372. Minimum Multiplications to Reach End
    // Description: Mod 100000 multiplication steps.
    // Example input : arr=[2,5,7], start=3, end=30
    // Example output: 2
    public static int minimumMultiplications(int[] arr, int start, int end) {
        // code
        return 0;
    }

    // medium
    // 373. Number of Ways to Arrive at Destination
    // Description: Shortest-path count mod 1e9+7.
    // Example input : n=7, roads=[[0,6,7],[0,1,2],[1,2,3],[1,3,3],[6,3,3],[3,5,1],[6,5,1],[2,5,1],[0,4,5],[4,6,2]]
    // Example output: 4
    public static int countPaths(int n, int[][] roads) {
        // code
        return 0;
    }

    // medium
    // 374. Bellman-Ford Algorithm
    // Description: Distances with negative edges.
    // Example input : v=3, edges=[[0,1,5],[1,2,-2]], src=0
    // Example output: [0,5,3]
    public static int[] bellmanFord(int v, int[][] edges, int src) {
        // code
        return null;
    }

    // medium
    // 375. Floyd Warshall Algorithm
    // Description: All pairs shortest path.
    // Example input : matrix=[[0,2,-1],[1,0,3],[-1,-1,0]]
    // Example output: updated matrix
    public static void floydWarshall(int[][] matrix) {
        // code
    }

    // medium
    // 376. Find the City with Smallest Number of Neighbours at Threshold
    // Description: Use Floyd-Warshall.
    // Example input : n=4, edges=[[0,1,3],[1,2,1],[1,3,4],[2,3,1]], distanceThreshold=4
    // Example output: 3
    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        // code
        return 0;
    }

    // medium
    // 377. Minimum Spanning Tree (Prim's)
    // Description: Sum of MST edge weights.
    // Example input : v=3, edges=[[0,1,5],[1,2,3],[0,2,1]]
    // Example output: 4
    public static int spanningTreePrim(int v, int[][] edges) {
        // code
        return 0;
    }

    // medium
    // 378. Disjoint Set (Union by Rank / Size)
    // Description: Implement findParent, unionByRank, unionBySize.
    // Example input : union(1,2) union(2,3) find(3)==find(1)
    // Example output: true
    public static void disjointSet() {
        // code
    }

    // medium
    // 379. Kruskal's Algorithm
    // Description: MST using DSU.
    // Example input : v=3, edges=[[0,1,5],[1,2,3],[0,2,1]]
    // Example output: 4
    public static int spanningTreeKruskal(int v, int[][] edges) {
        // code
        return 0;
    }

    // medium
    // 380. Number of Provinces (DSU)
    // Description: Provinces using DSU.
    // Example input : isConnected=[[1,1,0],[1,1,0],[0,0,1]]
    // Example output: 2
    public static int findCircleNumDSU(int[][] isConnected) {
        // code
        return 0;
    }

    // medium
    // 381. Number of Operations to Make Network Connected
    // Description: Min cables moves.
    // Example input : n=4, connections=[[0,1],[0,2],[1,2]]
    // Example output: 1
    public static int makeConnected(int n, int[][] connections) {
        // code
        return 0;
    }

    // hard
    // 382. Word Ladder II
    // Description: All shortest sequences.
    // Example input : begin="hit", end="cog"
    // Example output: [[hit,hot,dot,dog,cog],[hit,hot,lot,log,cog]]
    public static List<List<String>> findLadders(String begin, String end, List<String> wordList) {
        // code
        return null;
    }

    // hard
    // 383. Alien Dictionary
    // Description: Order of letters.
    // Example input : words=["baa","abcd","abca","cab","cad"]
    // Example output: "bdac"
    public static String alienOrder(String[] words) {
        // code
        return null;
    }

    // hard
    // 384. Accounts Merge
    // Description: Merge accounts by common email.
    // Example input : accounts=[[John,a@m.com,b@m.com],[John,b@m.com,c@m.com]]
    // Example output: [[John,a@m.com,b@m.com,c@m.com]]
    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        // code
        return null;
    }

    // hard
    // 385. Number of Islands II (Online Queries)
    // Description: Island count after each addLand.
    // Example input : m=3, n=3, positions=[[0,0],[0,1],[1,2],[2,1]]
    // Example output: [1,1,2,3]
    public static List<Integer> numOfIslandsII(int m, int n, int[][] positions) {
        // code
        return null;
    }

    // hard
    // 386. Making a Large Island
    // Description: Max island after flipping one 0.
    // Example input : grid=[[1,0],[0,1]]
    // Example output: 3
    public static int largestIsland(int[][] grid) {
        // code
        return 0;
    }

    // hard
    // 387. Most Stones Removed with Same Row or Column
    // Description: Max stones removed.
    // Example input : stones=[[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]]
    // Example output: 5
    public static int removeStones(int[][] stones) {
        // code
        return 0;
    }

    // hard
    // 388. Strongly Connected Components (Kosaraju)
    // Description: Count SCCs.
    // Example input : adj=[[1],[2],[0,3],[4],[5],[3]]
    // Example output: 2
    public static int kosaraju(int v, List<List<Integer>> adj) {
        // code
        return 0;
    }

    // hard
    // 389. Bridges in Graph
    // Description: Find all bridges.
    // Example input : n=4, connections=[[0,1],[1,2],[2,0],[1,3]]
    // Example output: [[1,3]]
    public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        // code
        return null;
    }

    // hard
    // 390. Articulation Points in Graph
    // Description: Find cut vertices.
    // Example input : n=5, adj=[[1,2],[0,2],[0,1,3,4],[2],[2]]
    // Example output: [2]
    public static List<Integer> articulationPoints(int n, List<List<Integer>> adj) {
        // code
        return null;
    }

    static List<List<Integer>> adj(int[]... rows) {
        List<List<Integer>> g = new ArrayList<>();
        for (int[] r : rows) {
            List<Integer> l = new ArrayList<>();
            for (int x : r) l.add(x);
            g.add(l);
        }
        return g;
    }

    static List<String> words() {
        return Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
    }

    public static void main(String[] args) {
        System.out.println(adjacencyList(3, new int[][]{{0, 1}, {1, 2}}));
        List<List<Integer>> g = adj(new int[]{1, 2}, new int[]{0}, new int[]{0});
        System.out.println(bfsOfGraph(3, g));
        System.out.println(dfsOfGraph(3, g));
        System.out.println(findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        char[][] grid = {{'1', '1', '0'}, {'0', '1', '0'}, {'0', '0', '1'}};
        System.out.println(numIslands(grid));
        System.out.println(Arrays.deepToString(floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2)));
        System.out.println(orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
        System.out.println(Arrays.deepToString(updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}})));
        char[][] board = {{'X', 'X', 'X'}, {'X', 'O', 'X'}, {'X', 'X', 'X'}};
        solveSurrounded(board);
        System.out.println(Arrays.deepToString(board));
        System.out.println(numEnclaves(new int[][]{{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}));
        System.out.println(ladderLength("hit", "cog", words()));
        System.out.println(countDistinctIslands(new int[][]{{1, 1, 0}, {1, 0, 0}, {0, 0, 1}}));
        System.out.println(isBipartite(new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}}));
        List<List<Integer>> tri = adj(new int[]{1, 2}, new int[]{0, 2}, new int[]{0, 1});
        System.out.println(hasCycleBFS(3, tri));
        System.out.println(hasCycleDFS(3, tri));
        System.out.println(hasCycleDirected(3, adj(new int[]{1}, new int[]{2}, new int[]{0})));
        System.out.println(eventualSafeNodes(new int[][]{{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}}));
        List<List<Integer>> dag = adj(new int[]{}, new int[]{}, new int[]{3}, new int[]{1}, new int[]{0, 1}, new int[]{0, 2});
        System.out.println(Arrays.toString(topoSortDFS(6, dag)));
        System.out.println(Arrays.toString(topoSortKahn(6, dag)));
        System.out.println(canFinish(2, new int[][]{{1, 0}}));
        System.out.println(Arrays.toString(findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}})));
        System.out.println(Arrays.toString(shortestPathUnit(3, new int[][]{{0, 1}, {1, 2}}, 0)));
        System.out.println(Arrays.toString(shortestPathDAG(4, new int[][]{{0, 1, 2}, {0, 2, 1}, {1, 3, 1}, {2, 3, 3}})));
        System.out.println(wordLadderBFS("hit", "cog", words()));
        List<List<int[]>> w = new ArrayList<>();
        w.add(Arrays.asList(new int[]{1, 1}, new int[]{2, 6}));
        w.add(Arrays.asList(new int[]{2, 2}));
        w.add(new ArrayList<>());
        System.out.println(Arrays.toString(dijkstra(3, w, 0)));
        System.out.println(dijkstraPath(5, new int[][]{{1, 2, 2}, {2, 5, 5}, {2, 3, 4}, {1, 4, 1}, {4, 3, 3}, {3, 5, 1}}));
        System.out.println(shortestPathBinaryMatrix(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}, new int[]{0, 0}, new int[]{2, 2}));
        System.out.println(minimumEffortPath(new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}}));
        System.out.println(findCheapestPrice(4, new int[][]{{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}}, 0, 3, 1));
        System.out.println(minimumMultiplications(new int[]{2, 5, 7}, 3, 30));
        System.out.println(countPaths(7, new int[][]{{0, 6, 7}, {0, 1, 2}, {1, 2, 3}, {1, 3, 3}, {6, 3, 3}, {3, 5, 1}, {6, 5, 1}, {2, 5, 1}, {0, 4, 5}, {4, 6, 2}}));
        System.out.println(Arrays.toString(bellmanFord(3, new int[][]{{0, 1, 5}, {1, 2, -2}}, 0)));
        int[][] fw = {{0, 2, -1}, {1, 0, 3}, {-1, -1, 0}};
        floydWarshall(fw);
        System.out.println(Arrays.deepToString(fw));
        System.out.println(findTheCity(4, new int[][]{{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}}, 4));
        int[][] mst = {{0, 1, 5}, {1, 2, 3}, {0, 2, 1}};
        System.out.println(spanningTreePrim(3, mst));
        disjointSet();
        System.out.println(spanningTreeKruskal(3, mst));
        System.out.println(findCircleNumDSU(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        System.out.println(makeConnected(4, new int[][]{{0, 1}, {0, 2}, {1, 2}}));
        System.out.println(findLadders("hit", "cog", words()));
        System.out.println(alienOrder(new String[]{"baa", "abcd", "abca", "cab", "cad"}));
        List<List<String>> accounts = Arrays.asList(
            Arrays.asList("John", "a@m.com", "b@m.com"),
            Arrays.asList("John", "b@m.com", "c@m.com"));
        System.out.println(accountsMerge(accounts));
        System.out.println(numOfIslandsII(3, 3, new int[][]{{0, 0}, {0, 1}, {1, 2}, {2, 1}}));
        System.out.println(largestIsland(new int[][]{{1, 0}, {0, 1}}));
        System.out.println(removeStones(new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}}));
        System.out.println(kosaraju(6, adj(new int[]{1}, new int[]{2}, new int[]{0, 3}, new int[]{4}, new int[]{5}, new int[]{3})));
        List<List<Integer>> conns = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2), Arrays.asList(2, 0), Arrays.asList(1, 3));
        System.out.println(criticalConnections(4, conns));
        System.out.println(articulationPoints(5, adj(new int[]{1, 2}, new int[]{0, 2}, new int[]{0, 1, 3, 4}, new int[]{2}, new int[]{2})));
    }
}
