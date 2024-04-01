package medium;

public class MaximumProductSubarray {

    public static void main(String args[]){
        int nums[]={-2,0,-1};
        int answer=maxProduct(nums);
        System.out.println(answer);
    }

    private static int maxProduct(int[] nums) {
        int prefix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefix==0) prefix=1;
            if (suffix==0) suffix=1;

            prefix=prefix*nums[i];
            //calculating from back
            suffix=suffix*nums[nums.length-i-1];
            max=Math.max(max,Math.max(suffix,prefix));
        }
        return max;
    }
}
