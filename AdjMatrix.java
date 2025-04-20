import java.util.*;
// Unweight Undirected Graph

public class AdjMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vertex, edges;
        vertex = sc.nextInt();
        edges = sc.nextInt();

        ArrayList<ArrayList<Integer>> adjMat  = new ArrayList<>();
        
        // Initialize the matrix with 0s
        for(int i = 0; i < vertex; i++) {
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(vertex, 0));
            adjMat.add(row);
        }

        // Input edges
        int u, v;
        for(int i = 0; i < edges; i++) {
            u = sc.nextInt();
            v = sc.nextInt();

            adjMat.get(u).set(v, 1);
            adjMat.get(v).set(u, 1); // for undirected graph            
        }

        // Print the adjacency matrix
        for(int i = 0; i < vertex; i++) {
            for(int j = 0; j < vertex; j++) {
                System.out.print(adjMat.get(i).get(j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}