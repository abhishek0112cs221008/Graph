class Solution {

    // Helper function to perform DFS traversal from a given node
    private void DFS(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Boolean> visited, ArrayList<Integer> ans) {
        // Mark the current node as visited
        visited.set(node, true);
        // Add the current node to the result list
        ans.add(node);
        
        // Recur for all the unvisited adjacent nodes
        for (int j = 0; j < adj.get(node).size(); j++) {
            int neighbor = adj.get(node).get(j);
            if (!visited.get(neighbor)) {
                DFS(neighbor, adj, visited, ans);
            }
        }
    }

    // Function to return a list containing the DFS traversal of the graph
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();         // Stores the final DFS traversal
        ArrayList<Boolean> visited = new ArrayList<>();     // Keeps track of visited nodes

        // Initialize visited list with false for all vertices
        for (int i = 0; i < adj.size(); i++) {
            visited.add(false);
        }

        // Start DFS from node 0
        DFS(0, adj, visited, ans);

        return ans;  // Return the DFS traversal result
    }
}
