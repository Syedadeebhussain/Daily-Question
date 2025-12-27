// Last updated: 27/12/2025, 6:25:42 pm
1class Solution {
2    public int countBeautifulPairs(int[] nums) {
3        int count = 0;
4        for (int i = 0; i < nums.length; i++) {
5            int first = get(nums[i]);
6            for (int j = i + 1; j < nums.length; j++) {
7                int last = nums[j] % 10;
8                if (gcd(first, last) == 1) {
9                    count++;
10                }
11            }
12        }
13        return count;
14    }
15    public int get(int num) {
16        while (num >= 10) {
17            num /= 10;
18        }
19        return num;
20    }
21    public int gcd(int a, int b) {
22        while (b != 0) {
23            int t = a % b;
24            a = b;
25            b = t;
26        }
27        return a;
28    }
29}
30