package medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-eventual-safe-states/description/
public class FindEventualSafeStates {

    public static void main(String[] args) {
        int graph[][]={{1,2},{2,3},{5},{0},{5},{},{}};
        List<Integer> ans=eventualSafeNodes(graph);
        System.out.println(ans);
    }

    private static List<Integer> eventualSafeNodes(int[][] graph) {

        int n=graph.length;

        int visited[]=new int[n];
        int pathVisited[]=new int[n];
        int check[]=new int[n];
        List<Integer> result=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(visited[i]==0){
                dfs(i,graph,visited,pathVisited,check);
            }
        }
        for(int i=0;i<n;i++){
            if(check[i]==1)
                result.add(i);
        }
        return result;
    }

    private static boolean dfs(int node, int[][] graph, int[] visited, int[] pathVisited, int[] check) {

        visited[node]=1;
        pathVisited[node]=1;

        for(int i:graph[node]){
            if(visited[i]==0){
                if(dfs(i,graph,visited,pathVisited,check)==true){
                    return true;
                }
            }else if(pathVisited[i]==1){
                return true;
            }
        }

        check[node]=1;
        pathVisited[node]=0;
        return false;
    }
}
