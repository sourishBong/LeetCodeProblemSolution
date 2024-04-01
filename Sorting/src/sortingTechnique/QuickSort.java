package sortingTechnique;

import java.util.Arrays;

public class QuickSort {

    public static void main(String args[]){
        int arr[]={8,6,2,5,1};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        int l=0;
        int h=arr.length-1;
        sort(arr,l,h);
    }

    private static void sort(int[] arr, int l, int h) {
        if(l>=h)
            return;
        int partition=findPartition(arr,l,h);
        sort(arr,l,partition-1);
        sort(arr,partition+1,h);

    }

    private static int findPartition(int[] arr, int l, int h) {
        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<j){
            while(arr[i]<=pivot && i<=h-1) {
                i++;
            }
            while(arr[j]>pivot && j>=l+1) {
                j--;
            }
            if(i<j)
                swap(arr,i,j);
        }
        swap(arr,j,l);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
