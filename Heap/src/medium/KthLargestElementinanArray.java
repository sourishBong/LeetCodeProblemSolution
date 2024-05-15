package medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementinanArray {

    public static void main(String args[]){
        int nums[]={3,2,1,5,6,4};
        int k=2;
        int ans=findKthLargest(nums,k);
        System.out.println(ans);
    }

    //create minheap for finding kth largest element
    //PriorityQueue<Integer> minHeap=new PriorityQueue<>();

    //create maxheap for finding kth smallest element
    //PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
    private static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }
        return minHeap.peek();
    }
}
