// Last updated: 25/12/2025, 9:38:39 pm
1class Solution {
2     int MOD = 1000000007;
3    public int numberOfGoodSubsets(int[] nums) {
4        int[] primeList = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
5        int[] count = new int[31];
6        for (int num : nums) {
7            count[num]++;
8        }
9        int[] primeMask = new int[31];
10        for (int num = 2; num <= 30; num++) {
11            int temp = num;
12             int mask = 0;
13              boolean isValid = true;
14            for (int i = 0; i < primeList.length; i++) {
15                int prime = primeList[i];
16                int times = 0;
17                while (temp % prime == 0) {
18                    temp /= prime;
19                    times++;
20         }
21                if (times > 1) {
22                    isValid = false;
23                    break;
24                       }
25                if (times == 1) {
26                    mask |= (1 << i);
27                }
28            }
29     primeMask[num] = isValid ? mask : -1;
30        }
31 long[] dp = new long[1 << 10];
32dp[0] = 1;
33        for (int num = 2; num <= 30; num++) {
34            if (count[num] == 0 || primeMask[num] == -1) continue;
35            int curMask = primeMask[num];
36            for (int state = (1 << 10) - 1; state >= 0; state--) {
37                if ((state & curMask) == 0) {
38                    dp[state | curMask] =
39                        (dp[state | curMask] + dp[state] * count[num]) % MOD;
40                }
41            }
42        }
43        long total = 0;
44        for (int state = 1; state < (1 << 10); state++) {
45            total = (total + dp[state]) % MOD;
46        }
47        long Two = 1;
48        for (int i = 0; i < count[1]; i++) {
49            Two = (Two * 2) % MOD;
50        }
51
52        return (int) ((total * Two) % MOD);
53    }
54}
55