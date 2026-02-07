// Last updated: 7/2/2026, 10:43:01 pm
1class Solution {
2    public int minimumOperations(int[] nums) {
3        int n = nums.length;
4        if (n == 1) return 0;
5        int MAX = 100001;
6        int[] even = new int[MAX];
7        int[] odd = new int[MAX];
8        for (int i = 0; i < n; i++) {
9            if (i % 2 == 0) {
10                even[nums[i]]++;
11            } else {
12                odd[nums[i]]++;
13            }
14        }
15        int[] e = getTopTwo(even);
16        int[] o = getTopTwo(odd);
17        int evenCount = (n + 1) / 2;
18        int oddCount = n / 2;
19        if (e[0] != o[0]) {
20            return (evenCount - e[1]) + (oddCount - o[1]);
21        }
22        int option1 = (evenCount - e[1]) + (oddCount - o[3]);
23        int option2 = (evenCount - e[3]) + (oddCount - o[1]);
24        return Math.min(option1, option2);
25    }
26    public int[] getTopTwo(int[] freq) {
27    int max1Val = 0, max1Cnt = 0;
28    int max2Val = 0, max2Cnt = 0;
29    for (int i = 0; i < freq.length; i++) {
30        if (freq[i] > max1Cnt) {
31            max2Cnt = max1Cnt;
32            max2Val = max1Val;
33            max1Cnt = freq[i];
34            max1Val = i;
35        } 
36        else if (freq[i] > max2Cnt) {
37            max2Cnt = freq[i];
38            max2Val = i;
39        }
40    }
41    return new int[]{max1Val, max1Cnt, max2Val, max2Cnt};
42}
43}
44