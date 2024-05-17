package hard;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//https://leetcode.com/problems/find-median-from-data-stream/
public class FindMedianfromDataStream {
    Queue<Integer> minHeap;
    Queue<Integer> maxHeap;
    public FindMedianfromDataStream() {
        minHeap=new PriorityQueue<>();
        maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek()>=num){
            maxHeap.add(num);
        }else{
            minHeap.add(num);
        }

        if(maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }
        else if(maxHeap.size()<minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            return (double) (maxHeap.peek()+minHeap.peek())/2;
        }else{
            return maxHeap.peek();
        }
    }
}
