// Last updated: 31/7/2025, 2:26:17 pm
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
    public boolean isPalindrome(ListNode head) {

     //find middle 
      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
     ListNode rev=reverse(slow,null);
     // Step 3: Compare both halves
        ListNode first = head;
        ListNode second = rev;
        while (second != null) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;

    }
    public ListNode reverse(ListNode curr,ListNode prev)
    {
        if(curr==null){
            return prev;
        }
        ListNode temp= reverse( curr.next, curr);
        curr.next=prev;
        return temp;
    }
}
