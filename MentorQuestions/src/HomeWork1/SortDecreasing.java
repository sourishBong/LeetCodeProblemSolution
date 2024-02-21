package HomeWork1;

import java.util.Arrays;

public class SortDecreasing {

    public static void main(String args[]){
        int[] arr={0,1,0,1,1,0,0,1,0} ;
        int[] output=sortDecreasing(arr);
        System.out.println(Arrays.toString(output));
    }

    private static int[] sortDecreasing(int[] arr) {
        int i=0;
        int j=0;

        while(i<arr.length){
            if(arr[i]==1){
                swap(arr,i,j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
