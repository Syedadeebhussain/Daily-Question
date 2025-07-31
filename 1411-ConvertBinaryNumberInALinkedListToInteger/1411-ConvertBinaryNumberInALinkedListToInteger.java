// Last updated: 31/7/2025, 2:24:47 pm
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
    public int getDecimalValue(ListNode head) {
        ListNode current =head;
        int sum=0;
        while(current!=null){
            sum = sum * 2 + current.val;
            current=current.next;
        }
        return sum;
    }
}