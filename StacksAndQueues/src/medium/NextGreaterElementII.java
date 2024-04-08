package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementII {

    public static void main(String args[]){
        int nums[]={100,1,11,1,120,111,123,1,-1,-100};
        int ans[]=nextGreaterElements(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int result[]=new int[n];

        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(i<n) {
                if (st.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = st.peek();
                }
            }
            st.push(nums[i%n]);
        }
        return result;
    }

    //needs optimization
    private static int[] nextGreaterElementsNotOptimized(int[] nums) {
        Stack<Integer> st=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        int nextGreater[] =new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int element=nums[i];

            if(st.isEmpty()){
                st.push(element);
               for(int j=0;j<i;j++){
                   if(nums[j]>element) {
                       map.put(element, nums[j]);
                       nextGreater[i]=nums[j];
                       break;
                   }
               }
               if(!map.containsKey(element)) {
                   map.put(element, -1);
                   nextGreater[i] = -1;
               }
               continue;
            }

            if(st.peek()>element){
                nextGreater[i]=st.peek();
                map.put(element,st.peek());
                st.push(element);
                continue;
            }

            while(!st.isEmpty() && st.peek()<=element){
                st.pop();
            }

            if(!st.isEmpty()){
                map.put(element,st.peek());
                nextGreater[i]=st.peek();
                st.push(element);
            }else{
                for(int j=0;j<i;j++){
                    if(nums[j]>element) {
                        map.put(element, nums[j]);
                        nextGreater[i]=nums[j];
                        break;
                    }
                }
                if(!map.containsKey(element)) {
                    map.put(element, -1);
                    nextGreater[i] = -1;
                }
                st.push(element);
            }
        }
//        for(int i=0;i<nums.length;i++){
//            nums[i]=map.get(nums[i]);
//        }
        return nextGreater;
    }
}
