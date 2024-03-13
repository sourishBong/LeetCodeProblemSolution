package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationsII {

    public static void main(String args[]){
        int input[]={1,1,2};
        List<List<Integer>> answer=solve(input);
        System.out.println(answer.toString());
    }

    private static List<List<Integer>> solve(int[] input) {
        Set<List<Integer>> result=new HashSet<>();
        List<List<Integer>> answer=new ArrayList<>();
       // Set<Integer> set=new HashSet<>();
        List<Integer> set=new ArrayList<>();
        boolean flag[]=new boolean[input.length];
        recursivePermutations(result,set,flag,input);
        answer.addAll(result);
        return answer;
    }

    private static void recursivePermutations(Set<List<Integer>> result, List<Integer> set,
                                              boolean[] flag, int[] input) {
        if(set.size()==input.length) {
            result.add(new ArrayList<>(set));
            return;
        }
        for(int i=0;i<input.length;i++){
            //checking in flag array whether it is present in flag array in ith position or not
            if(!flag[i]) {
                set.add(input[i]);
                flag[i] = true;
                recursivePermutations(result, set, flag, input);
                set.remove(set.size() - 1);
                flag[i] = false;
            }
        }
    }

}
