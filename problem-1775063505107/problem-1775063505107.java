// Last updated: 1/4/2026, 10:41:45 pm
1class Solution {
2    public int calculate(String s) {
3        String post = postfix(s);
4        return evaluatePostfix(post);
5    }
6    public String postfix(String s) {
7        StringBuilder sb = new StringBuilder();
8        Stack<Character> st = new Stack<>();
9        for (int i = 0; i < s.length(); i++) {
10            char ch = s.charAt(i);
11            if (Character.isDigit(ch)) {
12                while (i < s.length() && Character.isDigit(s.charAt(i))) {
13                    sb.append(s.charAt(i));
14                    i++;
15                }
16                sb.append(' ');
17                i--;
18            }
19            else if(ch == '(') {
20                st.push(ch);
21            }
22            else if(ch == ')') {
23                while(st.peek() != '(') {
24                    sb.append(st.pop()).append(' ');
25                }
26                st.pop();
27            }
28            else if (ch == ' ') continue;
29            else {
30                int j = i - 1;
31                while (j >= 0 && s.charAt(j) == ' ') j--;
32                if (ch == '-' && (j < 0 || s.charAt(j) == '(')) {
33                    sb.append("0 ");
34                }
35                while (!st.isEmpty() && prec(ch) <= prec(st.peek())) {
36                    sb.append(st.pop()).append(' ');
37                }
38                st.push(ch);
39            }
40        }
41        while (!st.isEmpty()) {
42            sb.append(st.pop()).append(' ');
43        }
44        return sb.toString();
45    }
46    public int prec(char ch) {
47        if (ch == '*' || ch == '/') return 2;
48        if (ch == '+' || ch == '-') return 1;
49        return -1;
50    }
51    public int evaluatePostfix(String s) {
52    Stack<Long> st = new Stack<>();
53    String[] tokens = s.split(" ");
54
55    for (String token : tokens) {
56        if (token.equals("")) continue;
57
58        if (!token.equals("+") && !token.equals("-") &&
59            !token.equals("*") && !token.equals("/")) {
60
61            st.push(Long.parseLong(token));
62        } 
63        else {
64            long a = st.pop();
65            long b = st.pop();
66
67            if (token.equals("+")) st.push(b + a);
68            else if (token.equals("-")) st.push(b - a);
69            else if (token.equals("*")) st.push(b * a);
70            else st.push(b / a);
71        }
72    }
73    return (int) (long) st.peek();
74}}