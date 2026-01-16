// Last updated: 16/1/2026, 9:59:34 pm
1class Solution {
2    public int[] findOriginalArray(int[] changed) {
3        int n = changed.length;
4        if (n % 2 != 0) return new int[0];
5        Arrays.sort(changed);
6        Map<Integer, Integer> mp = new HashMap<>();
7        for (int num : changed) {
8            mp.put(num, mp.getOrDefault(num, 0) + 1);
9        }
10        int[] ans = new int[n / 2];
11        int j = 0;
12        for (int num : changed) {
13            if (mp.get(num) == 0) continue;
14            if (num == 0 && mp.get(num) < 2) {
15                return new int[0];
16            }
17            if (mp.getOrDefault(num * 2, 0) == 0) {
18                return new int[0];
19            }
20            ans[j++] = num;
21            mp.put(num, mp.get(num) - 1);
22            mp.put(num * 2, mp.get(num * 2) - 1);
23            if (j == ans.length) break;
24        }
25        return ans;
26    }
27}
28