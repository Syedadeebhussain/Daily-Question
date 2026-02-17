// Last updated: 17/2/2026, 6:03:13 pm
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13      if(head==null || head.next==null || left==right) return head;
14      ListNode dummy=new ListNode(-1);
15      dummy.next=head;
16      ListNode prev=dummy;
17      for(int i=1;i<left;i++){
18           prev=prev.next;
19      }
20      ListNode start=prev.next;
21      prev.next=null;
22       ListNode end=start;
23       for(int i=left;i<right;i++){
24        end=end.next;
25       }
26       ListNode rem=end.next;
27       end.next=null;
28        ListNode mid=reverse(start);
29        prev.next=mid;
30         start.next=rem;
31         return dummy.next;
32    }
33     public ListNode reverse(ListNode head) {
34        ListNode prev = null;
35        ListNode curr = head;
36        while (curr != null) {
37            ListNode next = curr.next;
38            curr.next = prev;
39            prev = curr;
40            curr = next;
41        }
42        return prev;
43    }
44}