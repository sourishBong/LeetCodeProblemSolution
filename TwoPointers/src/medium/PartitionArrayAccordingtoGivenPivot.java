package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArrayAccordingtoGivenPivot {

    public static void main(String args[]){
        int nums[]={9,12,5,10,14,3,10};
        int nums2[]={18,-13,-19,-11,5,-17,0,-18,-12,-6,-20,-8,-20,-4,8};
        int pivot=-20;
        int answer[]=pivotArray(nums2,pivot);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num < pivot) {
                ans[index++] = num;
            }
        }
        for (int num : nums) {
            if (num == pivot) {
                ans[index++] = num;
            }
        }
        for (int num : nums) {
            if (num > pivot) {
                ans[index++] = num;
            }
        }

        return ans;
    }

    //using two lists complex
    private static int[] pivotArrayList(int[] nums, int pivot) {
        List<Integer> small=new ArrayList<>();
        List<Integer> large=new ArrayList<>();
        int arr[]=new int[nums.length];
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot)
                small.add(nums[i]);
           else if(nums[i]>pivot)
                large.add(nums[i]);
           else
               count=count+1;
        }
       // System.out.println(small);
       // System.out.println(large);
        for(int i=0;i< small.size();i++){
            arr[i]= small.get(i);
            j=i;
        }
        while(count>0){
            if(small.size()==0){
                arr[j]=pivot;
            }else {
                arr[j + 1] = pivot;
            }
            j++;
            count--;
        }
        for(int i=0;i< large.size();i++){
            if(small.size()==0)
                arr[j]= large.get(i);
            else
            arr[j+1]= large.get(i);
            j++;
        }

        return arr;
    }


}
