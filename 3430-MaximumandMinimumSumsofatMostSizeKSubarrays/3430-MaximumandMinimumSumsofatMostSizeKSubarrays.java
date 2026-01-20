// Last updated: 20/1/2026, 10:42:07 pm
1//this Q is almost similar to 2104. Sum of Subarray Ranges except for one thing
2
3class Solution {
4    public long minMaxSubarraySum(int[] arr, int k) {
5        return sumOfMax(arr, k) + sumOfMin(arr, k);
6    }
7    public long sumOfMin(int[] arr, int k) {
8        int n = arr.length;
9        int[] left = new int[n];
10        int[] right = new int[n];
11        Stack<Integer> st = new Stack<>();
12        for (int i = 0; i < n; i++) {
13            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
14                st.pop();
15            }
16            left[i] = st.isEmpty() ? i + 1 : i - st.peek();
17            st.push(i);
18        }
19        st.clear();
20        for (int i = n - 1; i >= 0; i--) {
21            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
22                st.pop();
23            }
24            right[i] = st.isEmpty() ? n - i : st.peek() - i;
25            st.push(i);
26        }
27        long sum = 0;
28        for (int i = 0; i < n; i++) {
29            sum += (long) arr[i] * countValidPairs(left[i], right[i], k);
30        }
31        return sum;
32    }
33    public long sumOfMax(int[] arr, int k) {
34        int n = arr.length;
35        int[] left = new int[n];
36        int[] right = new int[n];
37        Stack<Integer> st = new Stack<>();
38        for (int i = 0; i < n; i++) {
39            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
40                st.pop();
41            }
42            left[i] = st.isEmpty() ? i + 1 : i - st.peek();
43            st.push(i);
44        }
45        st.clear();
46        for (int i = n - 1; i >= 0; i--) {
47            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
48                st.pop();
49            }
50            right[i] = st.isEmpty() ? n - i : st.peek() - i;
51            st.push(i);
52        }
53        long sum = 0;
54        for (int i = 0; i < n; i++) {
55            sum += (long) arr[i] * countValidPairs(left[i], right[i], k);
56        }
57        return sum;
58    }
59    public long countValidPairs(int L, int R, int K) {
60        int lMax = Math.min(L, K);
61    if (lMax <= 0) return 0;
62    int full = Math.min(lMax, K - R + 1);
63    if (full < 0) full = 0;
64    long count = (long) full * R;
65    int rem = lMax - full;
66    if (rem > 0) {
67        long first = K - full;      
68        long last = K - lMax + 1; 
69        count += rem * (first + last) / 2;
70    }
71    return count;
72    }
73}
74