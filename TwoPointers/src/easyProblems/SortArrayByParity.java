package easyProblems;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String args[]){
       // int nums[]={3,1,2,4};
        int nums[]={1,0,3};
        int answer[]=sortArrayByParity(nums);
        System.out.println(Arrays.toString(answer));
    }

    //using two arrays
    private static int[] sortArrayByParity(int[] nums) {
        if(nums.length==1)
            return nums;
        int i=0;
        int j=nums.length-1;
        while(i<j){
//            if(nums.length==2 &&((nums[i]%2!=0 && nums[j]%2!=0) ||
//                    (nums[i]%2==0 && nums[j]%2==0) ))
//             return nums;
            if(nums[i]%2!=0 && nums[j]%2==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j--;
            }else if(nums[i]%2==0 && nums[j]%2!=0){
                i++;
                j--;
            }else if(nums[i]%2==0 && nums[j]%2==0){
                i++;
            }else{
                j--;
            }
        }
        return nums;
    }
}
