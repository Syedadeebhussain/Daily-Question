// Last updated: 3/2/2026, 10:06:53 am
1class Solution {
2    public ListNode insertionSortList(ListNode head) {
3        if (head == null || head.next == null) {
4            return head;
5        }
6        ListNode midPrev = middle(head);// because of infinite recursion we are taking mid-1
7        ListNode next_mid = midPrev.next;
8        midPrev.next = null;
9        ListNode a = insertionSortList(head);
10        ListNode b = insertionSortList(next_mid);
11        return merge_two_sorted(a, b);
12    }
13    public ListNode middle(ListNode head) {
14        ListNode slow = head;
15        ListNode fast = head;
16        ListNode prev = null;
17        while (fast != null && fast.next != null) {
18            prev = slow;
19            slow = slow.next;
20            fast = fast.next.next;
21        }
22        return prev;
23    }
24    public ListNode merge_two_sorted(ListNode a, ListNode b) {
25        ListNode dummy = new ListNode(0);
26        ListNode temp = dummy;
27        while (a != null && b != null) {
28            if (a.val > b.val) {
29                temp.next = b;
30                b = b.next;
31            } else {
32                temp.next = a;
33                a = a.next;
34            }
35            temp = temp.next;
36        }
37        if (a != null) temp.next = a;
38        if (b != null) temp.next = b;
39
40        return dummy.next;
41    }
42}
43