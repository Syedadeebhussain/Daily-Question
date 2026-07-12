// Last updated: 12/7/2026, 10:30:33 pm
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int[] a = arr.clone();
4        Arrays.sort(a);
5        Map<Integer, Integer> mp = new HashMap<>();
6        int rank = 1;
7        for (int i = 0; i < a.length; i++) {
8            if (!mp.containsKey(a[i])) {
9                mp.put(a[i], rank);
10                rank++;
11            }
12        }
13        int[] ans = new int[arr.length];
14        for (int i = 0; i < arr.length; i++) {
15            ans[i] = mp.get(arr[i]);
16        }
17        return ans;
18    }
19}