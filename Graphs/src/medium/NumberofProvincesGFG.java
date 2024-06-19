package medium;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/problems/number-of-provinces/1
public class NumberofProvincesGFG {

    public static void main(String args[]){
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(2);

        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(1);

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(list1);
        adj.add(list2);
       // adj.add(list3);

        int V=2;
        int ans=numProvinces(adj,V);
        System.out.println(ans);
    }

    private static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {

//        ArrayList<ArrayList<Integer>> adjLs=new ArrayList<>();
//
//        for(int i=0;i<V;i++){
//            adjLs.add(new ArrayList<>());
//        }
//
//        //to change adjacency matrix to list
//        for(int i=0;i<V;i++){
//            for(int j=0;j<V;j++){
//                if(adj.get(i).get(j)==1 && i!=j){
//                    adjLs.get(i).add(j);
//                    adjLs.get(j).add(i);
//                }
//            }
//        }
        int visited[]=new int[V];
        int count=0;

        for(int i=1;i<V;i++){
            if(visited[i]==0){
                count++;
                dfs(i,visited,adj);
            }
        }
        return count;
    }

    public static void dfs(int node,int visited[],
                           ArrayList<ArrayList<Integer>> adj){
        visited[node]=1;

        for(Integer i:adj.get(node)){
            if(visited[i]==0)
                dfs(i,visited,adj);
        }
    }
}
