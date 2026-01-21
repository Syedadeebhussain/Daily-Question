// Last updated: 21/1/2026, 9:40:26 pm
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode r1=Reverse(l1);
14        ListNode r2=Reverse(l2);
15        ListNode ans=Add_two_numbers(r1,r2);
16        return Reverse(ans);
17    }
18    public ListNode Reverse(ListNode l1){
19        ListNode prev=null;
20        ListNode curr=l1;
21        while(curr!=null){
22            ListNode temp=curr.next;
23            curr.next=prev;
24            prev=curr;
25            curr=temp;
26        }
27        return prev;
28    }
29    public ListNode Add_two_numbers(ListNode l1,ListNode l2){
30        ListNode dummy =new ListNode(0);
31        ListNode temp=dummy;
32        int carry=0;
33        while(l1!=null || l2!=null || carry!=0){
34            int sum=carry;
35            if(l1!=null)
36            {
37            sum+=l1.val;
38            l1=l1.next;
39            }
40            if(l2!=null)
41            {
42            sum+=l2.val;
43            l2=l2.next;
44            }
45            carry=sum/10;
46            dummy.next=new ListNode(sum%10);
47            dummy=dummy.next;
48        }
49        return temp.next;
50    }
51}