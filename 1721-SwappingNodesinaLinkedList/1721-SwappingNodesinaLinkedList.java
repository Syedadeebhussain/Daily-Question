// Last updated: 3/2/2026, 3:20:10 pm
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
12    public ListNode swapNodes(ListNode head, int k) {
13       ListNode first=find(head,k);
14       ListNode rev=reverse(head);//in place
15       ListNode last=find(rev,k);
16       int temp=first.val;
17       first.val=last.val;
18       last.val=temp;
19       reverse(rev);
20       return head;
21
22    }
23    public ListNode reverse(ListNode head)
24    {
25        ListNode prev=null;
26        while(head!=null){
27            ListNode temp=head.next;
28            head.next=prev;
29            prev=head;
30            head=temp;
31        }
32        return prev;
33    }
34    public ListNode find(ListNode curr,int k){
35        for(int i=1;i<k;i++){
36            curr=curr.next;
37        }
38        return curr;
39    }
40}