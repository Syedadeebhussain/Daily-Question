// Last updated: 14/1/2026, 11:36:19 pm
1class Solution {
2     class DSU {
3        class Node {
4            int val;
5            Node parent;
6            int rank;
7            Node(int val) {
8                this.val = val;
9                this.parent = this;
10                this.rank = 0;
11            }
12        }
13        Map<Integer, Node> map = new HashMap<>();
14        DSU(int n) {
15            for (int i = 0; i < n; i++) {
16                map.put(i, new Node(i));
17            }
18        }
19        Node find(Node x) {
20            if (x.parent != x)
21                x.parent = find(x.parent);
22            return x.parent;
23        }
24        void union(int a, int b) {
25            Node pa = find(map.get(a));
26            Node pb = find(map.get(b));
27            if (pa == pb) return;
28            if (pa.rank < pb.rank) {
29                pa.parent = pb;
30            } else if (pa.rank > pb.rank) {
31                pb.parent = pa;
32            } else {
33                pb.parent = pa;
34                pa.rank++;
35            }
36        }
37    }
38
39    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
40        DSU dsu = new DSU(n);
41        int[][] arr = new int[n][2];
42        for (int i = 0; i < n; i++) {
43            arr[i][0] = nums[i];
44            arr[i][1] = i;
45        }
46        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
47        for (int i = 1; i < n; i++) {
48            if (arr[i][0] - arr[i - 1][0] <= maxDiff) {
49                dsu.union(arr[i][1], arr[i - 1][1]);
50            }
51        }
52        boolean[] ans = new boolean[queries.length];
53        for (int i = 0; i < queries.length; i++) {
54    ans[i] =dsu.find(dsu.map.get(queries[i][0])) ==dsu.find(dsu.map.get(queries[i][1]));
55        }
56        return ans;
57    }
58}
59