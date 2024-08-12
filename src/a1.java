import java.util.*;

public class a1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Integer>[] adj = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int i = 1; i < n; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                adj[u].add(v);
                adj[v].add(u);
            }
            int[] bridges = solve(n, adj);
            for (int b : bridges) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static int[] solve(int n, List<Integer>[] adj) {
        // Number of nodes in the tree
        int[] bridges = new int[n - 1];

        // Union-Find data structure
        int[] parent = new int[n + 1];
        int[] size = new int[n + 1];
        Arrays.fill(size, 1);

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        int totalEdges = 0;
        int edgeCount = 0;

        // Initially all edges are bridges
        Arrays.fill(bridges, n - 1);

        for (int k = 1; k < n; k++) {
            totalEdges++;
            bridges[k - 1] = countBridges(n, totalEdges, parent, size, adj);
        }

        return bridges;
    }

    private static int countBridges(int n, int k, int[] parent, int[] size, List<Integer>[] adj) {
        int bridgeCount = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int neighbor : adj[i]) {
                if (find(parent, i) != find(parent, neighbor)) {
                    union(parent, size, i, neighbor);
                    bridgeCount--;
                }
            }
        }

        return Math.max(0, bridgeCount - k);
    }

    private static int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }

    private static void union(int[] parent, int[] size, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);

        if (rootX != rootY) {
            if (size[rootX] < size[rootY]) {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
            } else {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
            }
        }
    }
}
