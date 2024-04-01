package medium;

public class MaxConsecutiveOnesIII {

    public static void main(String args[]){
        int nums[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int answer=longestOnes(nums,k);
        System.out.println(answer);
    }

    private static int longestOnes(int[] nums, int k) {
        int zeroes=0;
        int maxLength=Integer.MIN_VALUE;
        int l=0;
        int r=0;

        while(r<nums.length){

            if(nums[r]==0) zeroes++;

            if(zeroes> k) {
                if(nums[l]==0) zeroes--;
                l++;
            }
            if(zeroes<=k){
                int len=r-l+1;
                maxLength=Math.max(maxLength,len);
            }
            r++;
        }
        return maxLength;
    }
}
