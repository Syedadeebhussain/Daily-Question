// Last updated: 23/1/2026, 9:48:44 pm
1class Solution {
2    public long maxTotal(int[] value, int[] limit) {
3        Map<Integer, List<Integer>> buckets = new HashMap<>();
4        int n = value.length;
5        for (int i = 0; i < n; i++) {
6            buckets.computeIfAbsent(limit[i], k -> new ArrayList<>()).add(value[i]);
7        }
8        long ans = 0;
9        for (Map.Entry<Integer, List<Integer>> e : buckets.entrySet()) {
10            int L = e.getKey();
11            List<Integer> arr = e.getValue();
12            arr.sort(Comparator.reverseOrder());
13            int take = Math.min(L, arr.size());
14            for (int i = 0; i < take; i++) ans += arr.get(i);
15        }
16        return ans;
17    }
18}