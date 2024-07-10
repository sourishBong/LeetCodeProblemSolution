package medium;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/is-graph-bipartite/description/
public class IsGraphBipartiteLeetCode {

    public static void main(String[] args) {
       // int graph[][]={{1,2,3},{0,2},{0,1,3},{0,2}};
       // int graph[][]={{1,3},{0,2},{1,3},{0,2}};
        int graph[][]={{3,4,6},{3,6},{3,6},{0,1,2,5},{0,7,8},{3},{0,1,2,7},{4,6},{4},{}};
//        int graph[][]={{2,4},{2,3,4},{0,1},{1},{7},{9},{5},{},{6},{12,14},{},{10},{},{10},{},
//                {19},{18},{},{16},{15},{23},{23},{},{20,21},{},{},{27},{26},{},{},
//                {34},{33,34},{},{31},{30,31},{38,39},{37,38,39},{36},{35,36},{35,36},
//                {43},{},{},{40},{},{49},{47,48,49},{46,47,49},{45,46,47,48}};

//        int graph[][]={{2,4},{2,3,4},{0,1},{1},{0,1},{7},{9},{5},{},{6},{12,14},
//                {},{10},{},{10},{19},{18},{},{16},{15},{23},{23},{},{20,21},{},{},
//                {27},{26},{},{},{34},{33,34},{},{31},{30,31},{38,39},{37,38,39},{36},
//                {35,36},{35,36},{43},{},{},{40},{},{49},{47,48,49},{46,48,49},{46,47,49},{45,46,47,48}};
        boolean ans=isBipartite(graph);
        System.out.println(ans);
    }

    private static boolean isBipartite(int[][] graph) {
        int n= graph.length;

        int visited[]=new int[n];
        Arrays.fill(visited,-1);

        for(int i=0;i<n;i++){
            if(visited[i]==-1){
                if(check(i,visited,graph,0)==false)
                    return false;
            }
        }
        return true;
    }

    private static boolean check(int node, int[] visited,int[][] graph, int color) {
       visited[node]=color;
       for(int i:graph[node]){
           if(visited[i]==-1){
           if (check(i,visited,graph,1-color)==false){
               return false;
           }
           }else if(visited[i]==color)
               return false;
       }
       return true;
    }
}
