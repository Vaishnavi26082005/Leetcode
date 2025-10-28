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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null||l2==null)return l1==null?l2:l1;
        ListNode res=new ListNode();
        ListNode ans= res;
        int carry=0;
        while(l1!=null&&l2!=null){
            int sum=l1.val+l2.val+carry;
            int s=sum%10;
            carry=sum/10;
            l1=l1.next;
            l2=l2.next;
            res.next=new ListNode(s);
            res=res.next;


        }
        while(l1!=null){
            int sum=l1.val+carry;
            int s=sum%10;
            carry=sum/10;
            res.next= new ListNode(s);
            l1=l1.next;
            res=res.next;

        }
        while(l2!=null){
            int sum=l2.val+carry;
            int s=sum%10;
            carry=sum/10;
            res.next= new ListNode(s);
            l2=l2.next;
            res=res.next;
            
        }
         
        if(carry != 0){
            res.next = new ListNode(carry);
        }
return ans.next;
    }
}