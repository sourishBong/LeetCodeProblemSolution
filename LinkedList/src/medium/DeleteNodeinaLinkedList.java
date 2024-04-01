package medium;

import easy.ConvertArrayToLinkedList;
import root.Node;

public class DeleteNodeinaLinkedList {
    static int arr[]={4,5,1,9};
    static Node list= ConvertArrayToLinkedList.convert(arr);

    public static void main(String args[]){
       Node node=new Node(5);
        deleteNode(node);
        System.out.println(list.toString());
    }

    private static void deleteNode(Node node) {
        if(node != null && node.next != null) {
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }
}
