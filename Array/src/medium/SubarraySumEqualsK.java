package medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static void main(String args[]){
        int nums[]={1,2,1,2,1};
        int k=3;
        int answer=subarraySum(nums,k);
        System.out.println(answer);
    }

    private static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
       int count=0;
       int  prefixSum=0;
       for(int i=0;i<nums.length;i++){
           prefixSum=prefixSum+nums[i];
           if(map.containsKey(prefixSum-k)) {
               count = count + map.get(prefixSum - k);
           }
           map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
       }
       return count;
    }


    //Brute Force
    private static int subarraySumBruteForce(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==k)
                    count++;
            }
        }
        return count;
    }
}
