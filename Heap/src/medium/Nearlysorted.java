package medium;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Nearlysorted {

    public static void main(String args[]){
        int arr[]={6,5,3,2,8,10,9};
        int num=7;
        int k=3;
        ArrayList<Integer> ans=nearlySorted(arr, num, k);
        System.out.println(ans);
    }

    //using minHeap because asking to sort it in ascending
    private static ArrayList<Integer> nearlySorted(int[] arr, int num, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
                ans.add(minHeap.remove());
            }
        }
        while(!minHeap.isEmpty()){
            ans.add(minHeap.remove());
        }
        return ans;
    }
}
