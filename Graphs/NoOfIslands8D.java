package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int first;
    int second;

    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
public class NoOfIslands8D {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!visited[i][j] && grid[i][j]=='1'){
                    count++;
                    dfs(grid, visited, i , j);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, boolean[][] visited, int row, int col) {
        visited[row][col] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));

        int n = grid.length;
        int m = grid[0].length;

        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;

            q.remove();

            for (int delrow = -1; delrow <= 1; delrow++) {
                for(int delcol = -1; delcol <= 1; delcol++){
                    int nrow = r + delrow;
                    int ncol = c + delcol;

                    if(nrow==r || ncol==c){
                        if(0<=nrow && nrow<n && ncol>=0 && ncol<m && !visited[nrow][ncol] && grid[nrow][ncol]==1){
                            visited[nrow][ncol] = true;
                            q.add(new Pair(nrow, ncol));
                        }
                    }
                } 
            }
        }
    }
}
