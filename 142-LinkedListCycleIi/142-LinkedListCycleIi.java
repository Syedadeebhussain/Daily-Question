// Last updated: 31/7/2025, 2:26:45 pm
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode meet=hascycle(head);
        if(meet==null){
            return null;
        }
         ListNode fast=meet;
        ListNode slow=head;
         while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
         }
         return fast;
    }
    public ListNode hascycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
}