package easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {

    public static Queue<Integer> queue=new LinkedList<>();
    public static void main(String args[]){

        push(30);
        push(40);
        System.out.println(queue);
        int topElement=top();
        System.out.println(topElement+" is on top");
        push(10);
        System.out.println(queue);
        System.out.println(pop()+" is removed");
    }

    public static void push(int x){
        queue.add(x);
        for(int i=0;i<queue.size()-1;i++){
            queue.add(queue.remove());
        }
    }

    public static int pop() {
        return queue.remove();
    }

    public static int top(){
        return queue.peek();
    }

    public static boolean empty() {
        return queue.isEmpty();
    }
}
