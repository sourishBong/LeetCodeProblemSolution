package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {

    public static void main(String args[]){
        int nums[]={1,1,2};
        List<List<Integer>> answer=permuteUnique(nums);
        System.out.println(answer);
    }

    private static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        recursivePermute(result,nums,0);
        return result;
    }

    private static void recursivePermute(List<List<Integer>> result, int[] nums, int start) {
        if(start==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(i!=start && !isDuplicate(start,i,nums))
                continue;
            swap(start,i,nums);
            recursivePermute(result,nums,start+1);
            swap(start,i,nums);
        }
    }

    private static boolean isDuplicate(int start, int curr, int[] nums) {
        for(int i=start;i<curr;i++){
            if(nums[curr]==nums[i])
                return false;
        }
        return true;
    }

    private static void swap(int i,int j,int nums[]){

        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
