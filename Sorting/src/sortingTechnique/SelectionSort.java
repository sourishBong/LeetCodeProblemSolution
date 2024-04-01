package sortingTechnique;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String args[]){
        int arr[]={8,6,2,5,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //selection sort--select the minimum
    private static void selectionSort(int[] arr) {

        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            swap(arr,i,min);
        }
    }

    private static void swap(int arr[], int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
