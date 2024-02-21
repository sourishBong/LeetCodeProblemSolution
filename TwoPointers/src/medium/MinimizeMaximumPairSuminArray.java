package medium;

import java.util.Arrays;

public class MinimizeMaximumPairSuminArray {

    public static void main(String args[]){
        int nums[]={3,5,4,2,4,6};
        int answer=minPairSum(nums);
        System.out.println(answer);
    }

    //solving in nlogn
    private static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int maxElement=Integer.MIN_VALUE;
        while(i<j){
            int sum=nums[i]+nums[j];
            maxElement=Math.max(maxElement,sum);
            i++;
            j--;
        }
        return maxElement;
    }
}
