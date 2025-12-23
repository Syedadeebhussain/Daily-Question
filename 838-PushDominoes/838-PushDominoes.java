// Last updated: 23/12/2025, 4:01:09 pm
1class Solution {
2    public String pushDominoes(String dominoes) {
3        String s = "L" + dominoes + "R";
4        char[] arr = s.toCharArray();
5        int n = arr.length;
6        int left = 0;
7        for (int right = 1; right < n; right++) {
8            if (arr[right] == '.') continue;
9            if (arr[left] == arr[right]) {
10                for (int k = left + 1; k < right; k++) {
11                    arr[k] = arr[left];
12                }
13            } 
14            else if (arr[left] == 'R' && arr[right] == 'L') {
15                int i = left + 1, j = right - 1;
16                while (i < j) {
17                    arr[i++] = 'R';
18                    arr[j--] = 'L';
19                }
20            }
21            left = right;
22        }
23        return new String(arr, 1, n - 2);
24    }
25}
26