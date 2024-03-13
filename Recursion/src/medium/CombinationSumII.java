package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public static void main(String args[]){
        int candidates[]={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> answer=combinationSum2(candidates,target);
        System.out.println(answer);
    }

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        recursiveCombination(result,list,candidates,target,0);
        return result;
    }

    private static void recursiveCombination(List<List<Integer>> result, List<Integer> list,
                                             int[] candidates, int target, int index) {
            if (target == 0) {
                result.add(new ArrayList<>(list));
                return;
            }
            for(int i=index;i<candidates.length;i++){
                if(i>index && candidates[i]==candidates[i-1]) continue;
                if(candidates[i]>target) break;

                list.add(candidates[i]);
                recursiveCombination(result,list,candidates,target-candidates[i],i+1);
                list.remove(list.size()-1);
            }
    }
}
