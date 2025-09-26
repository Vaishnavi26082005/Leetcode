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
        if(head==null)return null;
        ListNode dummy= head;
      ListNode res= head;
      int len=0;
      while(head!=null){
        len++;
        head= head.next;
      }
      if(n==len)return res.next;
      for(int i=0;i<len-n-1;i++){
       dummy = dummy.next;
      }
      dummy.next= dummy.next.next;
      return res;
    }
}