package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String args[]){
        int nums[]={1,2,3};
        List<List<Integer>> answer=permute(nums);
        System.out.println(answer);
    }
    /*
    Time-O(n!n)
    Space-O(n)
     */
    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int index=0;
        permuteRecursion(result,index,nums);
        return result;
    }

    private static void permuteRecursion(List<List<Integer>> result, int index, int[] nums) {
        if(index==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
            result.add(new ArrayList<>(list));
            return;
        }
       for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            permuteRecursion(result,index+1,nums);
            swap(i,index,nums);
        }
    }

    private static void swap(int i, int j, int[] nums) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
