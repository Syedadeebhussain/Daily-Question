// Last updated: 27/1/2026, 2:28:37 pm
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode reverse=rev(head);
14       if (n == 1) {
15            reverse = reverse.next;
16        } else {
17            ListNode node = getNode(reverse, n-1);
18            node.next = node.next.next;
19        }
20        return rev(reverse);
21
22    }
23    public ListNode getNode(ListNode head,int n){
24        for(int i=1;i<n;i++){
25            head=head.next;
26        }
27        return head;
28    }
29    public ListNode rev(ListNode head){
30        ListNode prev=null;
31        ListNode curr=head;
32        while(curr!=null){
33            ListNode temp=curr.next;
34            curr.next=prev;
35            prev=curr;
36            curr=temp;
37        }
38         return prev;
39    }
40}