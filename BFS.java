// User function Template for Java
class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        // 1. queue 2. visited array
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Boolean> visited = new ArrayList<>();
        
        // Initialize visited list with false
        for (int i = 0; i < adj.size(); i++) {
            visited.add(false);
        }
        
        q.add(0);
        visited.set(0, true);
        
        while (!q.isEmpty()) {
            int node = q.remove();
            ans.add(node);
            
            for (int j = 0; j < adj.get(node).size(); j++) {
                int neighbor = adj.get(node).get(j);
                if (!visited.get(neighbor)) {
                    visited.set(neighbor, true);
                    q.add(neighbor);
                }
            }
        }
        
        return ans;
    }
}
