package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class FindtheDuplicateNumber {

    public static void main(String args[]){
        int nums[]={1,3,4,2,2};
        int nums2[]={3,1,3,4,2};
        int answer=findDuplicate(nums);
        System.out.println(answer);
    }

    private static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            n=nums[i];
        }
        return n;
    }


    //using HashMap
    private static int findDuplicateMap(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        //Optional<Integer> num=map.entrySet().stream().filter(m->m.getValue()>1).map(m->m.getKey()).findFirst();
        List<Integer> num=map.entrySet().stream().filter(m->m.getValue()>1).map(m->m.getKey()).collect(Collectors.toList());
        return num.get(0);
    }
}
