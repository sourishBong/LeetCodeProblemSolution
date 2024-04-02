package easy;

import root.Node;

public class PalindromeLinkedList {
    static int arr[]={1,2,2,1};
    static Node l1= ConvertArrayToLinkedList.convert(arr);

    public static void main(String args[]){
        boolean ans=isPalindrome(l1);
        System.out.println(ans);
    }

    private static boolean isPalindrome(Node l1) {
        if (l1 == null || l1.next == null) {
            // It's a palindrome by definition
            return true;
        }

        Node temp=l1;
        Node slow=temp;
        Node fast=temp;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node reversed=reverLinkedList(slow.next);

            Node curr=l1;
            Node reverse=reversed;
            while(reverse!=null){
                if(curr.data!=reverse.data){
                    reverLinkedList(reverse);
                    return false;
                }
                curr=curr.next;
                reverse=reverse.next;
            }
        reverLinkedList(reverse);
        return true;
    }

    private static Node reverLinkedList(Node temp) {
        Node prev=null;
        Node curr=temp;
        Node following=null;

        while(curr!=null){

            following=curr.next;
            curr.next=prev;
            prev=curr;
            curr=following;
        }

        return prev;
    }
}
