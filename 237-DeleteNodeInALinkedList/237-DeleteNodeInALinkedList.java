// Last updated: 31/7/2025, 2:26:14 pm
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
          node.val = node.next.val;
        node.next = node.next.next; 
        
    }
  
}