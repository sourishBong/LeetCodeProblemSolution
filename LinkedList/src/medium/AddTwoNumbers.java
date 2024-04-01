package medium;

import easy.ConvertArrayToLinkedList;
import root.Node;

public class AddTwoNumbers {

    static int arr[]={2,4,3};
    static Node l1= ConvertArrayToLinkedList.convert(arr);

    static int arr2[]={5,6,4};
    static Node l2= ConvertArrayToLinkedList.convert(arr2);

    public static void main(String args[]){
        Node ans=addTwoNumbers(l1,l2);
        System.out.println(ans.toString());
    }

    private static Node addTwoNumbersRefactor(Node l1,Node l2){
        Node dummyNode=new Node(-1);
        Node curr=dummyNode;
        int carry =0;
        while(l1!=null || l2!=null || carry == 1){
            int sum=0;

            if(l1!=null) {
                sum=sum+l1.data;
                l1=l1.next;
            }

            if(l2!=null){
                sum=sum+l2.data;
                l2=l2.next;
            }
            sum += carry;
            carry = sum / 10;
            Node newNode=new Node(sum%10);
            curr.next=newNode;
            curr=curr.next;

        }

        return dummyNode.next;
    }
    private static Node addTwoNumbers(Node l1, Node l2) {
        Node dummyNode=new Node(-1);
        Node curr=dummyNode;
        Node temp1=l1;
        Node temp2=l2;
        int carry =0;
        while(temp1!=null || temp2!=null || carry == 1){
            int sum=carry;

            if(temp1!=null) sum=sum+temp1.data;

            if(temp2!=null) sum=sum+temp2.data;

            Node newNode=new Node(sum%10);
            carry=sum/10;

            curr.next=newNode;
            curr=curr.next;

            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
        }

        if(carry!=0){
            Node newNode=new Node(carry);
            curr.next=newNode;
        }

        return dummyNode.next;
    }

}
