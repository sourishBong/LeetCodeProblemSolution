package easy;

import root.Node;

public class MiddleoftheLinkedList {
    static int arr[]={1,2,3,4,5};
    static Node list= ConvertArrayToLinkedList.convert(arr);
    public static void main(String args[]){
        list=middleNode(list);
        System.out.println(list.toString());
    }

    private static Node middleNode(Node head) {
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }
}
