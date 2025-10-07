// Last updated: 7/10/2025, 11:16:41 pm
import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (!graph.containsKey(u)) graph.put(u, new ArrayList<>());
            if (!graph.containsKey(v)) graph.put(v, new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        return dfs(source, destination, visited, graph);
    }
public boolean dfs(int node,int destination,boolean[] visited,Map<Integer, List<Integer>> graph) {
        if (node == destination) return true;  
        if (visited[node]) return false;

        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (dfs(neighbor, destination, visited, graph)) {
                return true;
            }
        }
        return false; 
    }
}
