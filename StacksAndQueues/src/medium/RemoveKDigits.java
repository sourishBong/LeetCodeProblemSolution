package medium;

import java.util.Stack;

public class RemoveKDigits {

    public static void main(String args[]){
        //String num="1432219";
        //int k=3;
        String num="10200";
        int k=1;
        String ans=removeKdigits(num,k);
        System.out.println(ans);
    }

    private static String removeKdigits(String num, int k) {
        if(num.length()==k)
            return "0";
        Stack<Integer> st=new Stack<>();

        for(Character ch:num.toCharArray()){
            while(!st.isEmpty() && st.peek()>(ch-'0') && k>0){
                st.pop();
                k=k-1;
            }
            st.push(ch-'0');
        }

        // corner case like "1111"
        while(k>0){
            st.pop();
            k--;
        }

        //construct the number from the stack
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        sb.reverse();

        //remove all the 0 at the head
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}
