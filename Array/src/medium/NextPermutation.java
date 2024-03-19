package medium;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String args[]){
        int nums[]={3,2,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;

        //find the dipping point
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>=index;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }

        reverse(nums,index+1,n-1);
    }

    private static void reverse(int[] nums, int i, int k) {
        while(i<k){
            swap(nums,i,k);
            i++;
            k--;
        }
    }

    private static void swap(int[] nums, int i, int k) {
        int temp=nums[i];
        nums[i]=nums[k];
        nums[k]=temp;
    }
}
