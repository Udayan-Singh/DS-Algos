package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class VerticalLevel {
    public List<List<Integer>> verticalTraversal(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        dfs(root,0,0,map); 

        for(TreeMap<Integer, PriorityQueue<Integer>> i : map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> q : i.values()){
                while(!q.isEmpty()){{
                    ans.get(ans.size()-1).add(q.poll());
                }}
            }
        }

        return ans;
    }

    private void dfs(TreeNode root, int vert, int lev, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map) {
        if(root == null){
            return;
        }

        if(!map.containsKey(vert)){
            map.put(vert, new TreeMap<>());
        }

        if(!map.get(vert).containsKey(lev)){
            map.get(vert).put(lev, new PriorityQueue<>());
        }

        map.get(vert).get(lev).offer(root.val);
        dfs(root.left, vert-1, lev+1, map);
        dfs(root.right, vert+1, lev+1, map);
    }
}
