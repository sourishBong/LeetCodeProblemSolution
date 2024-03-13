package medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String args[])
    {
        int candidates[]={2,3,6,7};
        int target=7;
        List<List<Integer>> answer=combinationSum(candidates,target);
        System.out.println(answer);
    }

    /*
    Time Complexity: O(2^n)
    Space Complexity: O(n)
     */
    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        recursiveCombinations(candidates,target,result,list,0);
        return result;
    }

    private static void recursiveCombinations(int[] candidates, int target,
                                              List<List<Integer>> result, List<Integer> list, int index) {
        if(index==candidates.length){
            if(target==0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[index]<=target){
            list.add(candidates[index]);
            recursiveCombinations(candidates,target-candidates[index],result,list,index);
            list.remove(list.size()-1);
        }
        recursiveCombinations(candidates,target,result,list,index+1);
    }
}
