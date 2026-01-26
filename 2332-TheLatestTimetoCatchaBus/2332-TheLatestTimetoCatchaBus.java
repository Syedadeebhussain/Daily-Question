// Last updated: 26/1/2026, 10:09:30 pm
1class Solution {
2    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
3        Arrays.sort(buses);
4        Arrays.sort(passengers);
5        int p = 0;
6        int n = passengers.length;
7        int lastTime = 0;
8        for (int bus : buses) {
9            int count = 0;
10            while (p < n && passengers[p] <= bus && count < capacity) {
11                lastTime = passengers[p];
12                p++;
13                count++;
14            }
15            if (bus == buses[buses.length - 1]) {
16                if (count < capacity) {
17                    lastTime = bus;
18                } else {
19                    lastTime = lastTime - 1;
20                }
21            }
22        }
23        HashSet<Integer> set = new HashSet<>();
24        for (int x : passengers) set.add(x);
25        while (set.contains(lastTime)) {
26            lastTime--;
27        }
28        return lastTime;
29    }
30}
31