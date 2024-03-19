package medium;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {

    public static void main(String args[]){
        int nums[]={3,1,-2,-5,2,-4};
        int answer[]=rearrangeArray(nums);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0, neg = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }

        return ans;
    }


    //not optimized
    private static int[] rearrangeArrayNotOptimized(int[] nums) {
        int positive[]=new int[nums.length/2];
        int negative[]=new int[nums.length/2];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive[j]=nums[i];
                j++;
            }else{
                negative[k]=nums[i];
                k++;
            }
        }
        j=0;
        k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=positive[j];
                j++;
            }else{
                nums[i]=negative[k];
                k++;
            }

        }
        return nums;
    }
}
