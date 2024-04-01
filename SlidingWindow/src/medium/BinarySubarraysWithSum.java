package medium;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarraysWithSum {

    public static void main(String args[]){
        int nums[]={0,1,1,1,1};
        int goal=3;
        int ans=numSubarraysWithSum(nums,goal);
        System.out.println(ans);
    }

    //PrefixSum solution
    //both time and space O(n)
    private static int numSubarraysWithSumPrefixSum(int[] nums, int goal) {

        Map<Integer,Integer> frequency=new HashMap<>();
        int result=0;
        int prefixSum=0;
        frequency.put(0,1);

        for(int i=0;i<nums.length;i++){
                prefixSum=prefixSum+nums[i];
                int temp=prefixSum-goal;
            if(frequency.containsKey(temp)){
                result=result+frequency.get(temp);
            }
               frequency.put(prefixSum,frequency.getOrDefault(prefixSum, 0) + 1);
        }
            return result;
    }

    //sliding window
    private static int numSubarraysWithSum(int[] nums, int goal) {
        int l=0;
        int r=0;
        int count=0;
        int sum=0;
        int countZeroes=0;

        while(r<nums.length){
            sum=sum+nums[r];

            while(l<r && (nums[l]==0 || sum>goal)){

                if(nums[l]==0)
                    countZeroes++;
                else
                    countZeroes=0;

                sum=sum-nums[l];
                l++;

            }
            if(sum==goal)
                count=count+1+countZeroes;
            r++;
        }
        return count;
    }
}
