// Last updated: 2/2/2026, 10:47:42 am
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13         if (head == null || head.next == null) {
14            return null;
15        }
16        ListNode middle=MiddleNode(head);
17    return head;
18    }
19    public ListNode MiddleNode(ListNode head) {
20    ListNode slow=head;
21        ListNode fast=head;
22        ListNode prev=null;
23        while(fast!=null && fast.next!=null){
24            prev=slow;
25            slow=slow.next;
26            fast=fast.next.next;
27        }
28     prev.next=slow.next;
29     slow.next=null;
30     return head;
31}
32}