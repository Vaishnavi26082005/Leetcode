/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
          if (head == null) return null;
        for(int i=0;i<k;i++){
            if(temp==null)return head;
            temp=temp.next;
        }
        ListNode nh= reverse(head,temp);
        head.next=reverseKGroup(temp,k);
        return nh;

    }
    public ListNode reverse(ListNode curr,ListNode end){
        ListNode prev=null;
        while(curr!=end){
            ListNode ahead= curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
      return prev;
    }
}