// Last updated: 8/2/2026, 7:32:05 pm
1class Solution {
2    public List<Long> mergeAdjacent(int[] nums) {
3        Stack<Long> st = new Stack<>();
4        for (int x : nums) {
5            long num = x;
6            while (!st.isEmpty() && st.peek() == num) {
7                num += st.pop();
8            }
9            st.push(num);
10        }
11        List<Long> ll=new ArrayList<>();
12        while(!st.isEmpty()){
13            ll.add(st.pop());
14        }
15        Collections.reverse(ll);
16        return ll;
17    }
18}
19