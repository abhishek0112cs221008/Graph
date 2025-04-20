import java.util.ArrayList;
import java.util.Scanner;

public class AdjList {
    static class Pair {
        int edge;
        int weight;
    
        Pair(int e, int w) {
            this.edge = e;
            this.weight = w;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vertex, edges;
        vertex = sc.nextInt();
        edges = sc.nextInt();

        ArrayList<ArrayList<Pair>> adjList = new ArrayList<>();

        // Initialize empty adjacency list for each vertex
        for (int i = 0; i < vertex; i++) {
            adjList.add(new ArrayList<>());
        }

        // Read edges and add to adjacency list
        int u, v, weight;
        for (int i = 0; i < edges; i++) {
            u = sc.nextInt();
            v = sc.nextInt();
            weight = sc.nextInt();

            adjList.get(u).add(new Pair(v, weight)); // add v to u's list
            adjList.get(v).add(new Pair(u, weight)); // add u to v's list (undirected)
        }

        // Print adjacency list
        for (int i = 0; i < vertex; i++) {
            System.out.print(i + " -> ");
            for(int j=0; j<adjList.get(i).size(); j++) {
                System.out.print("("+adjList.get(i).get(j).edge + "," +adjList.get(i).get(j).weight + ") ");
            }
            System.out.println();
        }
    }

}