package medium;

import java.util.Arrays;
import java.util.Stack;

public class SumofSubarrayRanges {

    public static void main(String args[]){
        int nums[]={1,2,3};
        //int nums[]={3,1,2,4};
        long ans=subArrayRanges(nums);
        System.out.println(ans);
    }

    private static long subArrayRanges(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            int max=nums[i];
            int min=nums[i];
            for(int j=i;j<nums.length;j++) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                result = result + (max - min);
            }
        }
        return result;
    }

    /*
    Time:- O(n)
     */
    private static long subArrayRangesNotOptimized(int[] nums) {
        long min=subArrayMin(nums);
        long max=subArrayMax(nums);
        return max-min;
    }

    private static long subArrayMax(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];

        Arrays.fill(left,-1);
        Arrays.fill(right,nums.length);

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                left[i]=st.peek();
            }
            st.push(i);
        }

        st.clear();

        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                right[i]=st.peek();
            }
            st.push(i);
        }

        long ans=0;
        for(int i=0;i<nums.length;i++){
            long tot=(long)(right[i]-i)*(i-left[i]);
            ans=ans+(tot*nums[i]);
        }
        return ans;
    }

    private static long subArrayMin(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];

        Arrays.fill(left,-1);
        Arrays.fill(right,nums.length);
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<nums.length;i++){

            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                left[i]=st.peek();
            }
            st.push(i);
        }

        st.clear();

        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                right[i]=st.peek();
            }
            st.push(i);
        }

        long ans=0;

        for(int i=0;i<nums.length;i++){
            long tol=(long)(right[i]-i)*(i-left[i]);
            ans=ans+(tol*nums[i]);
        }
        return ans;
    }
}
