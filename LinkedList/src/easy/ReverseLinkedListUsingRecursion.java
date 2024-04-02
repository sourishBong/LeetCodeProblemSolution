package easy;

import root.Node;

public class ReverseLinkedListUsingRecursion {

    static int arr[]={1,2,3,4,5};
    static Node list= ConvertArrayToLinkedList.convert(arr);
    public static void main(String args[]){
        list=reverseList(list);
        System.out.println(list.toString());
    }

    private static Node reverseList(Node head) {
         if(head == null || head.next==null) {
             return head;
         }
         Node newHead=reverseList(head.next);
         Node front=head.next;
         front.next=head;
         head.next=null;

         return newHead;
    }
}
