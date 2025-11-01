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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode list=new ListNode(0);
        ListNode temp=list;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums) {
            set.add(i);
        }
        while(head!=null) {
            if(!set.contains(head.val)) {
                list.next=new ListNode(head.val);
                list=list.next;
            }
            head=head.next;
            
        }
        return temp.next;
    }
}