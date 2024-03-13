package easy;

public class MaxConsecutiveOnes {

    public static void main(String args[]){
        int nums[]={1,1,0,1,1,1};
      //  int answer=findMaxConsecutiveOnes(nums);
        int answer=findMaxConsecutiveOnesMoreOptimized(nums);
        System.out.println(answer);
    }

    //best approach
    private static int findMaxConsecutiveOnesMoreOptimized(int[] nums) {
        int max=0,j=-1,i=0;
        for(;i<nums.length;i++){
            if(nums[i]==0){
                max=Math.max(max,i-j-1);
                j=i;
            }
        }
        return Math.max(max,i-j-1);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count=0;
        for(int i:nums){
            if(i==1){
                count++;
                if(max<count){
                    max=count;
                }
            }
            else
                count=0;
        }
        return max;
    }

    //brute force approach
    private static int findMaxConsecutiveOnesBruteForce(int[] nums) {
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                count++;
            else
                count=0;
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}
