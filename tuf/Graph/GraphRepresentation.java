import java.util.ArrayList;
import java.util.Scanner;

public class GraphRepresentation {
    public static void main(String[] args) {
        // adjacencyMatrix();
    }

    public static void adjacencyMatrix() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of vertices
        int m = sc.nextInt(); // number of edges

        int[][] adj = new int[n + 1][n + 1]; // adjacency matrix

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); // first vertex
            int v = sc.nextInt(); // second vertex
            adj[u][v] = 1;
            adj[v][u] = 1;
        }
        sc.close();
    }

    public static void adjacencyList() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

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
}