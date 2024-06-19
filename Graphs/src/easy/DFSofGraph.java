package easy;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
public class DFSofGraph {

    public static void main(String args[]){
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(1);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(0);
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(0);
        list3.add(4);

        ArrayList<Integer> list4=new ArrayList<>();
        list4.add(0);
        ArrayList<Integer> list5=new ArrayList<>();
        list5.add(2);
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(list1);
        adj.add(list2);
        adj.add(list3);
        adj.add(list4);
        adj.add(list5);

        int V=5;

        ArrayList<Integer> ans=dfsOfGraph(V,adj);
        System.out.println(ans);
    }

    private static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        int visited[]=new int[V];
        ArrayList<Integer> ans=new ArrayList<>();

        //visited[0]=1;
        dfs(0,visited,adj,ans);
        return ans;
    }

    private static void dfs(int node, int[] visited, ArrayList<ArrayList<Integer>> adj,
                            ArrayList<Integer> ans) {

        visited[node]=1;
        ans.add(node);

        for(Integer i:adj.get(node)){
            if(visited[i]==0){
                dfs(i,visited,adj,ans);
            }
        }
    }
}
