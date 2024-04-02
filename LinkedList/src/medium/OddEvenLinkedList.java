package medium;

import easy.ConvertArrayToLinkedList;
import root.Node;

public class OddEvenLinkedList {

    static int arr[]={1,2,3,4,5};
    static Node list= ConvertArrayToLinkedList.convert(arr);
    public static void main(String args[]){
        list=oddEvenList(list);
        System.out.println(list.toString());
    }

    private static Node oddEvenList(Node head) {
        if(head==null || head.next==null)
            return head;
        Node even=head.next;
        Node evenHead=head.next;
        Node odd=head;

        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;

    }

    //Not Optimized
    private static Node oddEvenListNotOptimized(Node head) {
        int count=1;
        Node odd=new Node(-1);
        Node even=new Node(-1);
        Node current=head;
        Node front=null;
        Node tempEven=even;
        Node tempOdd=odd;
        while(current!=null){
            front=current.next;
            if(count%2==0){
                Node newNode=new Node(current.data);
                tempEven.next=newNode;
                tempEven=tempEven.next;
            }else{
                Node newNode=new Node(current.data);
                tempOdd.next=newNode;
                tempOdd=tempOdd.next;
            }
            count++;
            current=front;
        }

        tempOdd=odd;
        while(tempOdd.next!=null){
            tempOdd=tempOdd.next;
        }
        tempOdd.next=even.next;
        return odd.next;
    }

    //This is checking the value instead of the Node
    private static Node oddEvenListNotWorking(Node head) {

        Node odd=new Node(-1);
        Node even=new Node(-1);

        Node current=head;
        Node front=null;
        Node tempEven=even;
        Node tempOdd=odd;
        while(current!=null){
            front=current.next;
             if(current.data%2==0){
                 Node temp=new Node(current.data);
                 tempEven.next=temp;
                 tempEven=tempEven.next;
             }else{
                 Node temp=new Node(current.data);
                 tempOdd.next=temp;
                 tempOdd=tempOdd.next;
             }
             current=front;
        }
        tempOdd=odd;
        while(tempOdd.next!=null){
            tempOdd=tempOdd.next;
        }
        tempOdd.next=even.next;
        return odd.next;
    }
}
