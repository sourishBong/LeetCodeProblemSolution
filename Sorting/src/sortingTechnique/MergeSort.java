package sortingTechnique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String args[]){
        int arr[]={2, 13, 4, 1, 3, 6, 28};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low>=high)
            return;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
       // int temp[]=new int[arr.length];
        List<Integer> temp=new ArrayList<>();
       // int i=0;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }

        }

        while(left<=mid){
           temp.add(arr[left]);
            left++;

        }

        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        for(int j=low;j<=high;j++){
            arr[j]=temp.get(j-low);
        }
    }
}
