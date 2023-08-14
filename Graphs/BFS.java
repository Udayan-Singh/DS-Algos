package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] isVisited = new boolean[V];

        q.add(0);
        isVisited[0] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);


            for(Integer i : adj.get(node)){
                if(!isVisited[i]){
                    isVisited[i] = true;
                    q.add(i);
                }
            }
        }

        return bfs;
    }
}
