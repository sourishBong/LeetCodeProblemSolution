package easy;

import java.util.Arrays;

public class LeftandRightSumDifferences {

    public static void main(String args[]){
        int nums[]={10,4,8,3};
        int answer[]=leftRightDifference(nums);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] leftRightDifference(int[] nums) {
        int[] lSum=new int[nums.length];
        int[] rSum=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            sum=sum+nums[i];
            lSum[i+1]=sum;
        }
        sum=0;
        for(int i=nums.length-1;i>0;i--){
            sum=sum+nums[i];
            rSum[i-1]=sum;
        }
        for(int i=0;i<nums.length;i++){
            lSum[i]=Math.abs(lSum[i]-rSum[i]);
        }
        return lSum;
    }
}
