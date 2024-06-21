package medium;

// https://leetcode.com/problems/number-of-provinces/description/
public class NumberofProvincesLeetCodeDFS {

    public static void main(String args[]){
        int[][] isConnected={{1,1,0},{1,1,0},{0,0,1}};
        int ans=findCircleNum(isConnected);
        System.out.println(ans);
    }

    private static int findCircleNum(int[][] isConnected) {

        int V=isConnected.length;
        int visited[]=new int[V];
        int count=0;

        for(int i=0;i<V;i++){
            if(visited[i]==0){
                count++;
                dfs(i,visited,isConnected);
            }
        }
        return count;
    }

    private static void dfs(int node, int[] visited, int[][] isConnected) {
        visited[node]=1;
        for(int j=0;j<isConnected[node].length;j++){
            if(visited[j]==0 && isConnected[node][j]!=0){
                dfs(j,visited,isConnected);
            }
        }
    }
}
