package medium;

import java.util.ArrayList;
import java.util.List;

public class SubsetsIINotOptimized {

    public static void main(String args[]){
        int nums[]={1,2,2};
        List<List<Integer>> answer=subsetsWithDup(nums);
        System.out.println(answer);
    }

    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        recursiveSubsets(result,list,nums,0);
        return result;
    }

    private static void recursiveSubsets(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
       if(!result.contains(list))
           result.add(new ArrayList<>(list));
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            recursiveSubsets(result,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }
}
