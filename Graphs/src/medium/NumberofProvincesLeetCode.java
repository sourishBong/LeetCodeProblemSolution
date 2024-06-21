package medium;

import java.util.ArrayList;

// https://leetcode.com/problems/number-of-provinces/description/
public class NumberofProvincesLeetCode {

    public static void main(String args[]){
        int[][] isConnected={{1,1,0},{1,1,0},{0,0,1}};
        int ans=findCircleNum(isConnected);
        System.out.println(ans);
    }

    private static int findCircleNum(int[][] isConnected) {

        int V=isConnected.length;

        ArrayList<ArrayList<Integer>> adjLs=new ArrayList<>();
        for(int i=0;i<V;i++){
            adjLs.add(new ArrayList<>());
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }

        int count=0;
        int visited[]=new int[V];

        for(int i=0;i<V;i++){
            if(visited[i]==0){
                count++;
                dfs(i,visited,adjLs);
            }
        }

        return count;
    }

    private static void dfs(int node, int[] visited, ArrayList<ArrayList<Integer>> adjLs) {

        visited[node]=1;

        for(Integer i: adjLs.get(node)){
            if(visited[i]==0){
                dfs(i,visited,adjLs);
            }
        }
    }
}
