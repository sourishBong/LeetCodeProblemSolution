package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraphGFG {

    public static void main(String args[]){
//        int V=4;
//        ArrayList<Integer> list1=new ArrayList<>();
//        list1.add(2);
//        list1.add(3);
//
//        ArrayList<Integer> list3=new ArrayList<>();
//        list3.add(0);
//        list3.add(3);
//
//        ArrayList<Integer> list4=new ArrayList<>();
//        list4.add(0);
//        list4.add(1);
//
//        ArrayList<Integer> list2=new ArrayList<>();
//        list2.add(3);
//
//        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
//        adj.add(list1);
//        adj.add(list2);
//        adj.add(list3);
//        adj.add(list4);

        int V=3;
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(0);
        list2.add(2);

        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(1);

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(list1);
        adj.add(list2);
        adj.add(list3);

        boolean ans=isBipartite(V,adj);
        System.out.println(ans);
    }

    private static boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {

        int visited[]=new int[V];
        Arrays.fill(visited,-1);


        for(int i=0;i<V;i++){
            if(visited[i]==-1){
            if(check(i,adj,visited)==false) {
                return false;
            }
            }
        }


        return true;
    }

    public static boolean check(int start, ArrayList<ArrayList<Integer>> adj,int visited[]){

        Queue<Integer> queue=new LinkedList<>();
        queue.add(start);
        visited[start]=0;

        while(!queue.isEmpty()){
            int node=queue.remove();

            for(int i:adj.get(node)){
                if(visited[node]==1 && visited[i]==1){
                    return false;
                }else if(visited[node]==0 && visited[i]==0){
                    return false;
                }else if(visited[node]==0 && visited[i]==-1){
                    visited[i]=1;
                    queue.add(i);
                }else if(visited[node]==1 && visited[i]==-1){
                    visited[i]=0;
                    queue.add(i);
                }
//                if(visited[i]==-1){
//                    visited[i]=1-visited[node];
//                    queue.add(i);
//                }else if(visited[i]==visited[node])
//                    return false;
            }
        }
            return true;
    }
}
