package medium;

import java.util.Arrays;
import java.util.Stack;

public class SumofSubarrayMinimums {

    public static void main(String args[]){
        int arr[]={3,1,2,4};
        int answer=sumSubarrayMins(arr);
        System.out.println(answer);
    }

    private static int sumSubarrayMins(int[] arr) {
        int right[]=new int[arr.length];
        int left[]=new int[arr.length];

        Arrays.fill(right,arr.length);
        Arrays.fill(left,-1);

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            while(!st.isEmpty() && arr[st.peek()]>=element){
                st.pop();
            }

            if(!st.isEmpty()){
                left[i]=st.peek();
            }
            st.push(i);
        }
            st.clear();

        for(int i=arr.length-1;i>=0;i--){
            int element=arr[i];
            while(!st.isEmpty() && arr[st.peek()]>element){
                st.pop();
            }
            if(!st.isEmpty()){
                right[i]=st.peek();
            }
            st.push(i);
        }

        // modulo 10^9 + 7
        int mod = (int) 1e9 + 7;
        long answer = 0;

        for(int i=0;i<arr.length;i++){

            answer += (long) (i - left[i]) * (right[i] - i) % mod * arr[i] % mod;
            answer %= mod;
        }
        return (int) answer;
    }
}
