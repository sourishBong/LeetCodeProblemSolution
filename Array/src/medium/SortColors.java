package medium;

import java.util.Arrays;

public class SortColors {

    public static void main(String args[]){
        int nums[]={2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    /*
    We are diving into 3 parts
    j will have 0
    i will have 1
    k will have 2
    Whenever i!=1 then we swap
     */
    private static void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(i<=k){
            if(nums[i]==2) {
                swap(nums, i, k);
                k--;
            }else if(nums[i]==0){
                swap(nums, i, j);
                i++;
                j++;
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] nums, int i, int k) {
            int temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
    }
}
