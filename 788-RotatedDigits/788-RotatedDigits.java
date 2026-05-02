// Last updated: 3/5/2026, 12:02:22 am
1class Solution {
2    public int rotatedDigits(int n) {
3        int count = 0;
4        for (int i = 1; i <= n; i++) {
5            int num = i;
6            boolean isValid = true;
7            boolean hasChange = false;
8            while (num > 0) {
9                int digit = num % 10;
10                if (digit == 3 || digit == 4 || digit == 7) {
11                    isValid = false;
12                    break;
13                }
14                if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
15                    hasChange = true;
16                }
17                num /= 10;
18            }
19            
20            if (isValid && hasChange) {
21                count++;
22            }
23        }
24        
25        return count;
26    }
27}