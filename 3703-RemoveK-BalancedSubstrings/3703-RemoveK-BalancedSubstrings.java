// Last updated: 29/12/2025, 10:34:58 pm
1class Solution {
2    class Pair {
3        char ch;
4        int c;
5
6        Pair(char ch, int c) {
7            this.ch = ch;
8            this.c = c;
9        }
10    }
11
12    public String removeSubstring(String s, int k) {
13        Stack<Pair> st = new Stack<>();
14        for (int i = 0; i < s.length(); i++) {
15            if (!st.isEmpty() && st.peek().ch == s.charAt(i)) {
16                st.peek().c++;
17            } else {
18                st.push(new Pair(s.charAt(i), 1));
19            }
20            if (st.size() >= 2) {
21                Pair last = st.get(st.size() - 1);
22                Pair prev = st.get(st.size() - 2);
23    if (prev.ch == '(' && prev.c >= k && last.ch == ')' && last.c == k) {
24                    prev.c -= k;
25                    st.pop();
26                    if (prev.c == 0) {
27                        st.pop();
28                    }
29                }
30            }
31        }
32        StringBuilder sb = new StringBuilder();
33        for (Pair p : st) {
34            for (int i = 0; i < p.c; i++) {
35                sb.append(p.ch);
36            }
37        }
38        return sb.toString();
39    }
40}