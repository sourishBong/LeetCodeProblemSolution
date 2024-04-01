package sortingTechnique;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String args[]){
        int arr[]={2, 13, 4, 1, 3, 6, 28};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //bubble sort-sort adjacent element
    private static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int didSwap=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                    didSwap=1;
                }
            }
            //if it is 0 that means array is already sorted..no need to check any more
            if(didSwap==0)
                break;
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
