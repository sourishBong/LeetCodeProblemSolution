package easy;

import java.util.Arrays;

public class SquaresofaSortedArray {

    public static void main(String args[]){
        int nums[]={-4,-1,0,3,10};
        int answer[]=sortedSquares(nums);
        System.out.println(Arrays.toString(answer));
    }
    /*
        Time Complexity-O(n)
     */
    private static int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int index = nums.length-1;
        int result[]=new int[nums.length];
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])) {
                result[index] = nums[i] * nums[i];
                i++;
            }else{
                result[index]=nums[j]*nums[j];
                j--;
            }
            index--;
        }
            return result;
    }
}
