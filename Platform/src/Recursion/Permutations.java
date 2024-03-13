package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String args[]){
        int[] input={1,2,3};
        List<List<Integer>> answer=solve(input);
        System.out.println(answer.toString());
    }

    private static List<List<Integer>> solve(int[] input) {
        List<List<Integer>> result=new ArrayList<>();
        //for storing permutations
        List<Integer> list=new ArrayList<>();
        //for checking whether element is already ticked or not
        boolean check[]=new boolean[input.length];
        recursivePermutations(result,list,check,input);
        return result;
    }

    private static void recursivePermutations(List<List<Integer>> result, List<Integer> list, boolean[] check, int[] input) {
        if(list.size()==input.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<input.length;i++){
           if(!check[i]) {
               list.add(input[i]);
               check[i]=true;
               recursivePermutations(result,list,check,input);
               list.remove(list.size()-1);
               check[i]=false;
           }
        }
    }
}
