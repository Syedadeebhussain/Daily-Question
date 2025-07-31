// Last updated: 31/7/2025, 2:25:59 pm
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode a=head;
        ListNode b=head.next;
        ListNode c=b;
        while(b!=null && b.next!=null){
           a.next=b.next;
           a=a.next;
           b.next=a.next;
           b=b.next;
        }
        a.next=c;
        return head;
    }
}