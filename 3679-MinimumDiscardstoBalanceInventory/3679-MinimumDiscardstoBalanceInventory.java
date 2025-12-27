// Last updated: 27/12/2025, 6:43:28 pm
1class Solution {
2    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
3      Map<Integer, Integer> count = new HashMap<>();
4        Queue<int[]> q = new LinkedList<>(); 
5        int c = 0;
6         for (int i = 0; i < arrivals.length; i++) {
7            int day = i + 1;
8             int type = arrivals[i];
9            while (!q.isEmpty() && q.peek()[0] < day - w + 1) {
10                int[] old = q.poll();
11                count.put(old[1], count.get(old[1]) - 1);
12             }
13            if (count.getOrDefault(type, 0) < m) {
14                q.offer(new int[]{day, type});
15                count.put(type, count.getOrDefault(type, 0) + 1);
16            } else {
17                c++; 
18                  }
19        }
20        return c;
21    }
22}
23