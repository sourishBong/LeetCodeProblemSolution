package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraphCycleGFG {

    public static void main(String args[]){
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
            if(visited[i]==0){
                if(checkForCycle(i,V,adj,visited))
                    return true;
            }
        }
        return false;
    }

    private static boolean checkForCycle(int src, int v, ArrayList<ArrayList<Integer>> adj, int[] visited) {

        visited[src]=1;
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{src,-1});

        while(!queue.isEmpty()){
            int val[]=queue.peek();
            int node=val[0];
            int parent=val[1];
            queue.remove();

            for(int adjacentNode:adj.get(node)){
                if(visited[adjacentNode]==0){
                    visited[adjacentNode]=1;
                    queue.add(new int[]{adjacentNode,node});
                }else if(parent!=adjacentNode){
                    return true;
                }
            }
        }
        return false;
    }
}
