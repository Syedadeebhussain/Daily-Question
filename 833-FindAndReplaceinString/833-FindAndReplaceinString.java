// Last updated: 22/12/2025, 12:58:06 pm
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        String[] replace = new String[s.length()];
4        int[] skip = new int[s.length()];
5        for (int i = 0; i < indices.length; i++) {
6            int idx = indices[i];
7            if (s.startsWith(sources[i], idx)) {
8                replace[idx] = targets[i];
9                skip[idx] = sources[i].length();
10            }
11        }
12        StringBuilder st = new StringBuilder();
13        int i = 0;
14        while (i < s.length()) {
15            if (replace[i] != null) {
16                st.append(replace[i]);
17                i += skip[i]; 
18            } else {
19                st.append(s.charAt(i));
20                i++;
21            }
22        }
23        return st.toString();
24    }
25}
26