package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    public static void main(String args[]){
        int nums[]={1,2,2};
        List<List<Integer>> answer=subsetsWithDup(nums);
        System.out.println(answer);
    }
    /*
    Time: O(N * 2^N)
    Space: O(N * 2^N)
     */
    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        result.add(new ArrayList<>());
        recursiveSubsets(result,list,nums,0,true);
        return result;
    }

    private static void recursiveSubsets(List<List<Integer>> result, List<Integer> list,
                                         int[] nums, int start,boolean isPicked) {
        // base case
        if (start >= nums.length) {
            return;
        }
        int val=nums[start];
        // duplicate checking (convert && to ||)
        if (start == 0 || nums[start - 1] != nums[start] || isPicked == true) {
            list.add(nums[val]);
            recursiveSubsets(result,list,nums,start+1,true);
            result.add(new ArrayList<>(list));
            list.remove(list.size()-1);
        }
        recursiveSubsets(result,list,nums,start+1,false);
    }

}
