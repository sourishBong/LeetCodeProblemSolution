package medium;

import java.util.ArrayList;

public class UndirectedGraphCycleGFgUsingDFS {

    public static void main(String[] args) {
        int V=5;

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(0);
        list2.add(2);
        list2.add(4);

        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(1);
        list3.add(3);

        ArrayList<Integer> list4=new ArrayList<>();
        list4.add(2);
        list4.add(4);
        ArrayList<Integer> list5=new ArrayList<>();
        list5.add(1);
        list5.add(3);

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(list1);
        adj.add(list2);
        adj.add(list3);
        adj.add(list4);
        adj.add(list5);

        boolean ans=isCycle(V,adj);
        System.out.println(ans);
    }

    private static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int visited[]=new int[V];
        for(int i=0;i<V;i++){
            if(visited[i]==0) {
                if (dfs(i, -1, visited, adj)==true)
                    return true;
            }
        }
        return false;
    }

    private static boolean dfs(int node, int parent, int[] visited, ArrayList<ArrayList<Integer>> adj) {

        visited[node]=1;

        for(int adjacentNode:adj.get(node)){
            if(visited[adjacentNode]==0){
                if(dfs(adjacentNode,node,visited,adj)==true){
                    return true;
                }
            }else if(adjacentNode!=parent)
                return true;
        }
            return false;
    }
}
