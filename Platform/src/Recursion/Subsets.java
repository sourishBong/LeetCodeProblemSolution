package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String args[]){
        int input[]={1,2,3};
        List<List<Integer>> answer=solve(input);
        System.out.println(answer.toString());
    }

    private static List<List<Integer>> solve(int[] input) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        recursiveSubset(result,list,input,0);
        return result;

    }

    private static void recursiveSubset(List<List<Integer>> result, List<Integer> list, int[] input,int start) {
        result.add(new ArrayList<>(list));
        for(int i=start;i<input.length;i++){
            list.add(input[i]);
            recursiveSubset(result,list,input,i+1);
            list.remove(list.size()-1);
        }
    }
}
