package Graphs;

import java.util.ArrayList;

public class DFS {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] isVisited = new boolean[V+1];
        isVisited[0] = true;

        dfs(0, isVisited, adj, ans);
        return ans;
    }

    private void dfs(int node, boolean[] isVisited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {
        isVisited[node] = true;
        ans.add(node);

        for (Integer it: adj.get(node)) {
            if(!isVisited[it]){
                dfs(it, isVisited, adj, ans);
            }
        }
    }
}
