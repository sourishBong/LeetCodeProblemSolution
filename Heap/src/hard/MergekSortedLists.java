package hard;

import java.util.List;

public class MergekSortedLists {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String args[]){

    }

    public ListNode mergeKLists(ListNode[] lists) {
        return helper(lists,0,lists.length-1);
    }

    ListNode merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;

        if(l1.val<l2.val){
            l1.next=merge(l1.next,l2);
            return l1;
        }else{
            l2.next=merge(l1,l2.next);
            return l2;
        }
    }

    ListNode helper(ListNode[] lists, int start, int end){
        if(start==end){
           return lists[start];
        }
        while(start<end){
            int mid=(start+end)/2;
            ListNode l1=helper(lists,start,mid);
            ListNode l2=helper(lists,mid+1,end);
            return merge(l1,l2);
        }
           return null;
    }
}
