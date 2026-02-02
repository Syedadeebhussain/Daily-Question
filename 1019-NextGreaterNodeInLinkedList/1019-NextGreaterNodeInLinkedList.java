// Last updated: 2/2/2026, 11:46:05 am
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
12    public int[] nextLargerNodes(ListNode head) {
13        List<Integer> values = new ArrayList<>();
14        ListNode curr = head;
15        while (curr != null) {
16            values.add(curr.val);
17            curr = curr.next;
18        }
19
20        int n = values.size();
21        int[] ans = new int[n];
22        Stack<Integer> st=new Stack<>();
23         for (int i = 0; i < n; i++) {
24            while (!st.isEmpty() && values.get(i) > values.get(st.peek())) {
25                ans[st.pop()] = values.get(i);
26            }
27            st.push(i);
28        }
29
30        return ans;
31    }
32}