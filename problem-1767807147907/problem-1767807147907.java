// Last updated: 7/1/2026, 11:02:27 pm
1class Solution {
2    public List<Integer> goodDaysToRobBank(int[] security, int time) {
3        int n = security.length;
4        int[] left = new int[n]; 
5        int[] right = new int[n];  
6        List<Integer> ans = new ArrayList<>();
7        for (int i = 1; i < n; i++) {
8            if (security[i - 1] >= security[i]) {
9                left[i] = left[i - 1] + 1;
10            }
11        }
12        for (int i = n - 2; i >= 0; i--) {
13            if (security[i + 1] >= security[i]) {
14                right[i] = right[i + 1] + 1;
15            }
16        }
17        for (int i = 0; i < n; i++) {
18            if (left[i] >= time && right[i] >= time) {
19                ans.add(i);
20            }
21        }
22
23        return ans;
24    }
25}
26