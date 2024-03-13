package easy;

import java.util.Arrays;

public class CheckifArrayIsSortedandRotated {

    public static void main(String args[]){
        int nums[]={2,1,3,4};
        boolean answer=check(nums);
        System.out.println(answer);
    }

    private static boolean check(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            //taking mod to compare last element with first element
            if(nums[i]>nums[(i+1)%nums.length])
                k++;
        }
        if(k>1)
            return false;
        else
            return true;
    }


}
