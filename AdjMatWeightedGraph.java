import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AdjMatWeightedGraph {
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
        int u, v, weight;
        for(int i = 0; i < edges; i++) {
            u = sc.nextInt();
            v = sc.nextInt();
            weight = sc.nextInt();

            adjMat.get(u).set(v, weight);
            adjMat.get(v).set(u, weight); // for undirected graph            
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
