package medium;

import java.util.ArrayList;
import java.util.List;

public class PermutationsIINotOptimized {

    public static void main(String args[]){
        int nums[]={1,1,2};
        List<List<Integer>> answer=permuteUnique(nums);
        System.out.println(answer);
    }

    private static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean flag[]=new boolean[nums.length];
        permuteRecurssion(result,list,nums,flag);
        return result;
    }

    private static void permuteRecurssion(List<List<Integer>> result, List<Integer> list,
                                          int[] nums, boolean[] flag) {
        if(list.size()==nums.length){
            if(!result.contains(list))
                result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!flag[i]){
                list.add(nums[i]);
                flag[i]=true;
                permuteRecurssion(result,list,nums,flag);
                list.remove(list.size()-1);
                flag[i]=false;
            }
        }
    }
}
