package medium;

import java.util.Arrays;

public class RotateArray {

    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
    }

    private static void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int i, int j) {
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
