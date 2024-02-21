package medium;

import java.util.Arrays;

public class SortColors {

    public static void main(String args[]){
        int nums[]={0,1,0};
        sortColors(nums);
    }

    private static void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(i<=k){
            if(nums[i]==2){
                swap(nums,i,k);
                k--;
            }
            else if(nums[i]==0){
                swap(nums,i,j);
                i++;
                j++;
            }else{
               i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int i, int k) {
        int temp=nums[i];
        nums[i]=nums[k];
        nums[k]=temp;
    }
}
