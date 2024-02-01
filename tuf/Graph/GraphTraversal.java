import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphTraversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        input(adj);

        bfs(1, adj);
        // dfs();
    }

    public static void input(ArrayList<ArrayList<Integer>> adj) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of vertices
        int m = sc.nextInt(); // number of edges

        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); // first vertex
            int v = sc.nextInt(); // second vertex
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        sc.close();
    }

    public static void bfs(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.add(v);

        while (!q.isEmpty()) {
            int y = q.poll();
            System.out.print(y + " ");

            for (int x : adj.get(y)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }

    public static void dfs(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];

        visited[v] = true;
        System.out.print(v + " ");

        for (int x : adj.get(v)) {
            if (!visited[x]) {
                dfs(x, adj);
            }
        }
    }
}
