// Last updated: 5/2/2026, 10:20:36 pm
1class Solution {
2    public List<String> invalidTransactions(String[] transactions) {
3        int n = transactions.length;
4        List<String> res = new ArrayList<>();
5        String[] name = new String[n];
6        int[] time = new int[n];
7        int[] amount = new int[n];
8        String[] city = new String[n];
9        boolean[] invalid = new boolean[n];
10
11        for (int i = 0; i < n; i++) {
12            String[] parts = transactions[i].split(",");
13            name[i] = parts[0];
14            time[i] = Integer.parseInt(parts[1]);
15            amount[i] = Integer.parseInt(parts[2]);
16            city[i] = parts[3];
17            if (amount[i] > 1000) invalid[i] = true;
18        }
19
20        for (int i = 0; i < n; i++) {
21            for (int j = i + 1; j < n; j++) {
22                if (name[i].equals(name[j]) && !city[i].equals(city[j]) && Math.abs(time[i] - time[j]) <= 60) {
23                    invalid[i] = true;
24                    invalid[j] = true;
25                }
26            }
27        }
28
29        for (int i = 0; i < n; i++) {
30            if (invalid[i]) res.add(transactions[i]);
31        }
32
33        return res;
34    }
35}
36