package medium;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1
public class DirectedGraphCycleGFG {

    public static void main(String[] args) {
        int V=4;
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(2);

        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(3);

        ArrayList<Integer> list4=new ArrayList<>();
        list3.add(3);

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(list1);
        adj.add(list2);
        adj.add(list3);
        adj.add(list4);

        boolean answer=isCyclic(V,adj);
        System.out.println(answer);
    }

    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int visited[]=new int[V];
        int pathVisited[]=new int[V];

        for(int i=0;i<V;i++){
            if(visited[i]==0){
                if(dfs(i,visited,pathVisited,adj)==true)
                    return true;
            }
        }
        return false;
    }

    private static boolean dfs(int node, int[] visited, int[] pathVisited, ArrayList<ArrayList<Integer>> adj) {

        visited[node]=1;
        pathVisited[node]=1;

        for(int i:adj.get(node)){
            if(visited[i]==0){
                if(dfs(i,visited,pathVisited,adj)==true){
                    return true;
                }
            }else if(pathVisited[i]==1){
                return true;
            }
        }
        pathVisited[node]=0;
        return false;
    }
}
