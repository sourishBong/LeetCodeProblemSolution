package easy;

import java.util.Stack;

public class ImplementQueueusingStacks {

    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();
    public ImplementQueueusingStacks() {

    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.add(input.pop());
            }
        }
        return output.pop();
    }

    public int peek() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.add(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        if(input.isEmpty() && output.isEmpty())
            return true;
        else
            return false;
    }
}
