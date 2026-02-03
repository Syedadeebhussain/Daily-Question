// Last updated: 3/2/2026, 3:32:00 pm
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
13        ListNode first=head;
14      for(int i=1;i<k;i++){
15        first=first.next;
16      }  
17      ListNode temp=first;
18      ListNode last=head;
19      while(first.next!=null){
20        last=last.next;
21        first=first.next;
22      }
23      int value=temp.val;
24      temp.val=last.val;
25      last.val=value;
26      return head;
27    }
28}
29// class Solution {
30//     public ListNode swapNodes(ListNode head, int k) {
31//        ListNode first=find(head,k);
32//        ListNode rev=reverse(head);//in place
33//        ListNode last=find(rev,k);
34//        int temp=first.val;
35//        first.val=last.val;
36//        last.val=temp;
37//        reverse(rev);
38//        return head;
39
40//     }
41//     public ListNode reverse(ListNode head)
42//     {
43//         ListNode prev=null;
44//         while(head!=null){
45//             ListNode temp=head.next;
46//             head.next=prev;
47//             prev=head;
48//             head=temp;
49//         }
50//         return prev;
51//     }
52//     public ListNode find(ListNode curr,int k){
53//         for(int i=1;i<k;i++){
54//             curr=curr.next;
55//         }
56//         return curr;
57//     }
58// }