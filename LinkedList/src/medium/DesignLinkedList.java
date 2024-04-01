package medium;

public class DesignLinkedList {
    Node head;
    int length;
    public class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    public DesignLinkedList(){
        this.head = null;
        this.length = 0;
    }

    public int get(int index) {
        if(index >= length)
            return -1;
        int count=0;
        Node current=head;
        while(count<index) {
            count++;
            current=current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next=head;
        head=newNode;
        length++;
    }

    public void addAtTail(int val) {
        if(head == null) {
            addAtHead(val);
        }else {
            Node current=head;
            while(current.next!=null)
                current=current.next;
            Node newNode=new Node(val);
            current.next=newNode;
            length++;
        }
    }

    // 20,30,10,20,5,50
    public void addAtIndex(int index, int val) {
        if(index > length)
            return;
        if(index == 0){
            addAtHead(val);
        }else {
           Node prev=head;
           Node current=prev.next;
           int count=0;
           while(count<index-1) {
               prev=prev.next;
               current = current.next;
               count++;
           }
           Node newNode=new Node(val);
           prev.next=newNode;
           newNode.next=current;
           length++;
        }
    }

    //20->30->10->15->20->5->null
    public void deleteAtIndex(int index) {
        if(index >= length)
            return;
        if(index == 0) {
            head = head.next;
            length--;
        }else{
            int count=0;
            Node prev=head;
            Node current=prev.next;
            while(count<index-1){
                prev=prev.next;
               current=current.next;
                count++;
            }
            prev.next=current.next;
            length--;
        }
    }

    public void print(){
        Node current=head;
        while(current.next!=null){
            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]){
        DesignLinkedList list=new DesignLinkedList();
        list.addAtHead(5);
        list.addAtHead(20);
        list.addAtHead(10);
        list.addAtHead(30);
        list.addAtHead(20);
        list.addAtTail(50);
        list.addAtIndex(3,15);
        list.deleteAtIndex(4);
        list.print();
    }

}
