package easy;

import root.Node;

public class ConvertArrayToLinkedList {

    public static void main(String args[]){
        int arr[]={4,2,5,1};
        Node ans=convert(arr);
        System.out.println(ans.toString());
    }

    public static Node convert(int[] arr) {
        Node head=new Node(arr[0]);
        Node current=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            current.next=temp;
            current=current.next;
        }
        return head;
    }

    public static Node createCycle(int[] arr) {
        Node head=new Node(arr[0]);
        Node current=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            current.next=temp;
            current=current.next;
        }
        current=head.next;
        return head;
    }
}
