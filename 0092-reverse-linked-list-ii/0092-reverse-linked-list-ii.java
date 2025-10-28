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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
    ListNode dummy= new ListNode(0);
    dummy.next=head;
    ListNode curr=dummy;
    for(int i=1;i<left;i++){
        curr=curr.next;
    }
    ListNode ans=curr;
    ListNode start=curr.next;
    ListNode temp=start;
    ListNode prev=null;
    for(int i=left;i<=right;i++){
        ListNode ahead = temp.next;
    temp.next = prev;
    prev = temp;
    temp = ahead;


    }
     ans.next=prev;
     start.next=temp;
     return dummy.next;

    }
    
}