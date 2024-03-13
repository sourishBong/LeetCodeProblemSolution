package medium;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public static void main(String args[]){
        int nums[]={0,0,1,0,0,0,1,1};
        int answer=findMaxLength(nums);
        System.out.println(answer);
    }

    private static int findMaxLength(int[] nums) {
        int count=0;
        int maxCount=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                nums[i]=-1;
        }
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(map.containsKey(sum)){
                count=i-(map.get(sum));
            }else{
                map.put(sum,i);
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}
