package easy;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String args[]){
        int nums[]={0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int i=0;
        int n=nums.length;
        for(int num:nums){
            if(num!=0){
                nums[i]=num;
                i++;
            }
        }
        while(i<n){
            nums[i]=0;
            i++;
        }
    }

    //need optimization
    private static void moveZeroesNotOptimized(int[] nums) {
       // int answer[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                //answer[j]=nums[i];
                nums[j]=nums[i];
                j++;
            }
        }
       while(j<nums.length){
           nums[j]=0;
           j++;
       }
    }
}
