// Last updated: 27/12/2025, 10:08:03 pm
1class Solution {
2    public String resultingString(String s) {
3        StringBuilder st = new StringBuilder();
4        for (char ch : s.toCharArray()) {
5            int len = st.length();
6            if (len > 0 && find(st.charAt(len - 1), ch)) {
7                st.deleteCharAt(len - 1); // remove pair
8            } else {
9                st.append(ch);
10            }
11        }
12        return st.toString();
13    }
14
15    public boolean find(char a, char b) {
16 return Math.abs(a - b) == 1 ||(a == 'a' && b == 'z') ||(a == 'z' && b == 'a');
17    }
18}
19