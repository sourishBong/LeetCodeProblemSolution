package easy;

import java.util.ArrayList;
import java.util.List;

public class SumofAllSubsetXORTotals {
    static int sum=0;
    public static void main(String args[]){
        int nums[]={1,3};
        int answer=subsetXORSum(nums);
        System.out.println(answer);
    }

    private static int subsetXORSum(int[] nums) {
      return  recursiveXORSum(nums,0,0);
    }

    private static int recursiveXORSum(int[] nums, int index, int currentXor) {
        // return currentXor when all elements in nums are already considered
        if (index == nums.length) return currentXor;

        // calculate sum of xor with current element
        int withElement = recursiveXORSum(nums, index + 1, currentXor ^ nums[index]);

        // calculate sum of xor without current element
        int withoutElement = recursiveXORSum(nums, index + 1, currentXor);

        // return sum of xors from recursion
        return withElement + withoutElement;
    }
}
