package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
public class BFSofgraph {

    public static void main(String args[]){
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(4);

        ArrayList<Integer> list4=new ArrayList<>();
        ArrayList<Integer> list5=new ArrayList<>();

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(list1);
        adj.add(list2);
        adj.add(list3);
        adj.add(list4);
        adj.add(list5);

        int V=5;
        ArrayList<Integer> ans=bfsOfGraph(V,adj);
        System.out.println(ans);
    }

    private static ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        int visited[]=new int[v];
        Queue<Integer> queue=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        queue.add(0);
        visited[0]=1;
        while(!queue.isEmpty()){
            Integer node=queue.poll();
            ans.add(node);

            for(Integer i:adj.get(node)){
                if(visited[i]==0){
                    visited[i]=1;
                    queue.add(i);
                }
            }
        }
        return ans;
    }
}
