package easy;

import root.Node;

public class ReverseLinkedList {
    static int arr[]={1,2,3,4,5};
    static Node list= ConvertArrayToLinkedList.convert(arr);
    public static void main(String args[]){
        list=reverseList(list);
        System.out.println(list.toString());
    }

    private static Node reverseList(Node head) {
//        Node curr=head;
//        Node prev=null;
//        Node reverseLL=null;
//        while(curr!=null){
//            reverseLL=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=reverseLL;
//        }
//        return prev;
        Node curr=head;
        Node prev=null;
        Node front=null;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
}
