// Last updated: 28/12/2025, 9:46:45 pm
1class Solution {
2    public String minimizeStringValue(String s) {
3        int[] freq = new int[26];
4        char[] arr = s.toCharArray();
5        for (char c : arr) {
6            if (c != '?') {
7                freq[c - 'a']++;
8            }
9        }
10        List<Character> add = new ArrayList<>();
11        for (char c : arr) {
12            if (c == '?') {
13                int minFreq = Integer.MAX_VALUE;
14                int best = 0;
15                for (int i = 0; i < 26; i++) {
16                    if (freq[i] < minFreq) {
17                        minFreq = freq[i];
18                        best = i;
19                    }
20                }
21                freq[best]++;
22                add.add((char) ('a' + best));
23            }
24        }
25        Collections.sort(add);
26        int idx = 0;
27        for (int i = 0; i < arr.length; i++) {
28            if (arr[i] == '?') {
29                arr[i] = add.get(idx++);
30            }
31        }
32        return new String(arr);
33    }
34}
35