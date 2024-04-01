package medium;

import easy.ConvertArrayToLinkedList;
import root.Node;

public class LinkedListCycleII {
    static int arr[]={1,2,3,4,5};
    static Node list= ConvertArrayToLinkedList.convert(arr);
    public static void main(String args[]){
        Node answer=null;
        answer=detectCycle(list);
        System.out.println(answer.toString());
    }

    private static Node detectCycle(Node head) {
        if(head==null || head.next==null)
            return null;

        Node fast=head;
        Node slow=head;
        Node entry=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){  //there is a cycle
                while(slow!=entry){ //found the entry location
                    slow=slow.next;
                    entry=entry.next;
                }
                return entry;
            }

        }

        return null;
    }
}
