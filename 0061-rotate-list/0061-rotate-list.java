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
    public ListNode rotateRight(ListNode head, int k) {
        int n=0;
        if (head == null || head.next == null || k == 0) return head;
        ListNode dummy=head;
        ListNode curr= head;
        while(head!=null){
            n++;
            head=head.next;

        }
        k= k%n;
        if(k==0)return dummy;
        if(n==k)return dummy;
        for(int i=0;i<n-k-1;i++){
          curr= curr.next;

        }
        
        ListNode ans=curr.next;
        curr.next=null;
        ListNode nh=ans;
        while(nh.next!=null){
           nh=nh.next;
        }
        nh.next=dummy;
        return ans;
        

    }
}