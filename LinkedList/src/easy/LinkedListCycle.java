package easy;

import root.Node;

public class LinkedListCycle {
    static int arr[]={3,2,0,-4};
    static Node list= ConvertArrayToLinkedList.createCycle(arr);
    public static void main(String args[]){
        boolean answer=hasCycle(list);
        System.out.println(answer);
    }

    private static boolean hasCycle(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }
}
