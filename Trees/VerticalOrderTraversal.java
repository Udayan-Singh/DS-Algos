package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Pair{
    Node node;
    int hd;

    Pair(Node node, int hd){
        this.hd = hd;
        this.node = node;
    }
}
public class VerticalOrderTraversal {
    static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while(!q.isEmpty()){
            Pair temp = q.poll();
            Node n = temp.node;
            int hd = temp.hd;

            if(map.get(hd) == null){
                map.put(hd, n.data);
            }

            if(n.left!=null){
                q.offer(new Pair(n.left, hd-1));
            }

            if(n.right != null){
                q.offer(new Pair(n.right, hd+1));
            }
        }

        for(Integer i : map.values()){
            ans.add(i);
        }

        
        return ans;
    }

    
}
