// Last updated: 27/8/2025, 11:26:48 pm
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
       ListNode one=head;
       ListNode two=head.next;
       while(two!=null){
        int g=gcd(one.val,two.val);
        ListNode nn=new ListNode();
        nn.val=g;
        one.next=nn;
        nn.next=two;
        
        one=two;
        two=two.next;
       }
       return head;
    }
    public int gcd(int dividend,int divisor ){
        while (dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
        return divisor;
    }
}