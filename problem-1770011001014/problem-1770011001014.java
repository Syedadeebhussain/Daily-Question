// Last updated: 2/2/2026, 11:13:21 am
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
12    public ListNode doubleIt(ListNode head) {
13     ListNode  list1= reverse(head);
14     ListNode  list2= list1;
15     ListNode ans=add_two_numbers(list1,list2);
16     return reverse(ans);   
17    }
18    public ListNode reverse(ListNode head){
19        ListNode prev=null;
20        ListNode curr=head;
21        while(curr!=null){
22            ListNode temp=curr.next;
23            curr.next=prev;
24            prev=curr;
25            curr=temp;
26        }
27        return prev;
28    }
29    public ListNode add_two_numbers(ListNode l1,ListNode l2){
30        int sum=0;
31        int carry=0;
32        ListNode ans=new ListNode(0);
33        ListNode temp=ans;
34        while(l1!=null ||l2!=null || carry!=0){
35            sum=carry;
36            if(l1!=null){
37               sum+=l1.val;
38               l1=l1.next;
39            }
40            if(l2!=null){
41                sum+=l2.val;
42                l2=l2.next;
43            }
44            carry=sum/10;
45            temp.next=new ListNode(sum%10);
46            temp=temp.next;
47        }
48        return ans.next;
49    }
50}