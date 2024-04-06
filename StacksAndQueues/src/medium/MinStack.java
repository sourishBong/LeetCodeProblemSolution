package medium;

import java.util.Stack;
public class MinStack {
    static Stack<Integer> st=new Stack<>();
    int min=Integer.MAX_VALUE;
    public MinStack() {

    }

    public static void main(String args[]){
        MinStack minstack=new MinStack();
        minstack.push(-2);
        minstack.push(0);
        minstack.push(-3);
        minstack.getMin();
        minstack.pop();
        minstack.top();
        minstack.getMin();
    }

    public void push(int val) {
        if(st.isEmpty()) {
            if (val < min) {
                min = val;
            }
            st.push(val);
        }else{
          if(val<min){
              //this is the formula
              st.push((2*val)-min);
              min=val;
          }else
              st.push(val);
        }

    }

    public void pop() {
        if(st.peek()<min){
            //this is the formula
            min=(2*min)-st.peek();
        }
        st.pop();
    }

    public int top() {
        if(st.peek()<min)
            return min;
        else
            return st.peek();
    }

    public int getMin() {
        return min;
    }

}
