package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {

    public static void main(String args[]){
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};

        int ans[]=nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        Map<Integer,Integer> greaterMap=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int element=nums2[i];

            if(st.isEmpty()){
                st.push(element);
                greaterMap.put(element,-1);
                continue;
            }

            //if top f statck is greater, it is next greatest
            if(st.peek()>element){
                greaterMap.put(element,st.peek());
                st.push(element);
                continue;
            }

            //if stack element smaller than element
            while(!st.isEmpty() && st.peek()<=element){
                st.pop();
            }

            if(!st.isEmpty()){
                greaterMap.put(element,st.peek());
            }else{
                greaterMap.put(element,-1);
            }

            st.push(element);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=greaterMap.get(nums1[i]);
        }
        return nums1;
    }
}
