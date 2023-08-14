package Graphs;

public class NoOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;

        for(int city = 0; city < isConnected.length; city++){
            if(!visited[city]){
                dfs(isConnected,city,visited);
                count++;
            }
        }

        return count;

    }

    private void dfs(int[][] isConnected, int city, boolean[] visited) {
        if(visited[city]){
            return;
        }

        visited[city] = true;
        for(int i = 0; i < isConnected.length; i++){
            if(isConnected[city][i] == 1){
                dfs(isConnected, city, visited);
            }
        }
    }
}
