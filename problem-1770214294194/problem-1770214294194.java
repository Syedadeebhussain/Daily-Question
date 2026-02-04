// Last updated: 4/2/2026, 7:41:34 pm
1import java.util.*;
2
3class Solution {
4    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
5        int[][] arr = new int[profits.length][2];
6        for (int i = 0; i < profits.length; i++) {
7            arr[i][0] = capital[i];  // required capital
8            arr[i][1] = profits[i]; // profit
9        }
10        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
11        PriorityQueue<int[]> pq = new PriorityQueue<>(
12            (a, b) -> b[1] - a[1]
13        );
14
15        int i = 0; 
16        while (k > 0) {
17            while (i < arr.length && arr[i][0] <= w) {
18                pq.add(arr[i]);
19                i++;
20            }
21            if (pq.isEmpty()) {
22                return w;
23            }
24            w += pq.poll()[1];
25            k--;
26        }
27return w;
28}
29}