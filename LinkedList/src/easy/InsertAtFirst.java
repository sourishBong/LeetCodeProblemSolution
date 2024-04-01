package easy;

import root.Node;

public class InsertAtFirst {
    public static void main(String args[]){
        int arr[]={4,2,5,1};
        Node list=ConvertArrayToLinkedList.convert(arr);
        int newValue=0;
        System.out.println(list);
        list=insertAtFirst(list,newValue);
        System.out.println(list);
    }

    private static Node insertAtFirst(Node list, int newValue) {
       Node head=list;
       Node temp=new Node(newValue);
       temp.next=head;
       head=temp;

       return head;
    }


}
