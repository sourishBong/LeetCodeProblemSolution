package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TopologicalsortGFG {
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

        int ans[]=topoSort(V,adj);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {

        int visited[]=new int[V];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<V;i++){
            if(visited[i]==0)
                dfs(i,adj,visited,st);
        }

        int arr[]=new int[V];
        int i=0;
        while(!st.isEmpty()){
            arr[i++]=st.pop();
        }
        return arr;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, Stack<Integer> st) {

        visited[node]=1;

        for(int i:adj.get(node)){
            if(visited[i]==0)
                dfs(i,adj,visited,st);
        }

        st.add(node);
    }
}
