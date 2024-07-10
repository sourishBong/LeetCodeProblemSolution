package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.geeksforgeeks.org/problems/eventual-safe-states/1
public class EventualSafeStatesGFG {

    public static void main(String[] args) {
        int V=7;
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(3);

        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(5);

        ArrayList<Integer> list4=new ArrayList<>();
        list3.add(0);

        ArrayList<Integer> list5=new ArrayList<>();
        list3.add(5);

        ArrayList<Integer> list6=new ArrayList<>();


        ArrayList<Integer> list7=new ArrayList<>();


        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(list1);
        adj.add(list2);
        adj.add(list3);
        adj.add(list4);
        adj.add(list5);
        adj.add(list6);
        adj.add(list7);

        List<Integer> ans=eventualSafeNodes(V,adj);
        System.out.println(ans);
    }

    private static List<Integer> eventualSafeNodes(int V, ArrayList<ArrayList<Integer>> adj) {

        int visited[]=new int[V];
        int pathVisited[]=new int[V];
        int check[]=new int[V];

        List<Integer> result=new ArrayList<>();

        for(int i=0;i<V;i++){
            if(visited[i]==0){
               dfs(i,adj,visited,pathVisited,check);
               }
            }
        for(int i=0;i<V;i++){
            if(check[i]==1)
            result.add(i);
        }
        return result;
        }


    private static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj,
                               int[] visited, int[] pathVisited,int[] check) {

        visited[node]=1;
        pathVisited[node]=1;
        check[node]=0;
        for(Integer i:adj.get(node)){
            if(visited[i]==0) {
                if (dfs(i, adj, visited, pathVisited,check) == true) {
                    check[i]=0;
                    return true;
                }
            }else if(pathVisited[i]==1){
                check[i]=0;
                return true;
            }
        }

        check[node]=1;
        pathVisited[node]=0;
        return false;
    }
}
