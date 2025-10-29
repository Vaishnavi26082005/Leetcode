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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr= head;
        ListNode dummy=head;
        int len=0;
       while(curr!=null){
        len++;
        curr=curr.next;
       }
       if(len==n)return head.next;
       for(int i=0;i<len-n-1;i++){
       dummy=dummy.next;

       }
       
       dummy.next=dummy.next.next;
       return head;

    }
}