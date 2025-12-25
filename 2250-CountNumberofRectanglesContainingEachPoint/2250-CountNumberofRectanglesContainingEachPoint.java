// Last updated: 25/12/2025, 9:10:20 pm
1class Solution {
2
3    public int[] countRectangles(int[][] rectangles, int[][] points) {
4        List<Integer>[] box = new ArrayList[101];
5        for (int i = 1; i <= 100; i++) {
6            box[i] = new ArrayList<>();
7        }
8        for (int[] r : rectangles) {
9            box[r[1]].add(r[0]);
10        }
11        for (int i = 1; i <= 100; i++) {
12            Collections.sort(box[i]);
13        }
14        int[] ans = new int[points.length];
15        for (int i = 0; i < points.length; i++) {
16            int px = points[i][0];
17            int py = points[i][1];
18            int cnt = 0;
19            for (int h = py; h <= 100; h++) {
20                List<Integer> w = box[h];
21                if (!w.isEmpty()) {
22                    int p = Collections.binarySearch(w, px);
23                    if (p < 0) p = -p - 1;
24                    cnt += w.size() - p;
25                }
26            }
27            ans[i] = cnt;
28        }
29        return ans;
30    }
31}
32