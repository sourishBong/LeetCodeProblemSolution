package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetsII {

    public static void main(String args[]){
        int nums[]={1,2,2};
        List<List<Integer>> answer=subsetsWithDup(nums);
        System.out.println(answer);
    }

    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        recursiveSubsets(set,list,nums,0);
        result.addAll(set);
        return result;
    }

    private static void recursiveSubsets(Set<List<Integer>> set, List<Integer> list, int[] nums, int start) {
        set.add(new ArrayList<>(list));
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            recursiveSubsets(set,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }
}
