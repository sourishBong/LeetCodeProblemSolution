package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Klargestelements {

    public static void main(String args[]){
        int arr[]={12,5,787,1,23};
        int n=5;
        int k=2;
       ArrayList<Integer> ans=kLargest(arr,n,k);
       System.out.println(ans);
    }

    private static ArrayList<Integer> kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for(int i=0;i<n;i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k)
                minHeap.remove();
        }

        ArrayList<Integer> ans=new ArrayList<>();
        while(!minHeap.isEmpty()){
            ans.add(minHeap.remove());
        }
        Collections.reverse(ans);
        return ans;
    }
}
