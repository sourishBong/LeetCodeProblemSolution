package medium;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {

    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int k=4;
        int x=3;
        List<Integer> answer=findClosestElements(arr,k,x);
        System.out.println(answer);
    }

    private static ArrayList<Integer> findClosestElements(int[] arr, int k, int x) {
        int low=0;
        int high=arr.length-1;

        while(high-low>=k){
            if(Math.abs(arr[low]-x)>Math.abs(arr[high]-x)){
                low++;
            }else{
                high--;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=low;i<=high;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}
