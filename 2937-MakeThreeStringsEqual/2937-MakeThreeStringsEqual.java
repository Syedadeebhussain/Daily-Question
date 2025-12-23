// Last updated: 24/12/2025, 12:23:53 am
1class Solution {
2    public int findMinimumOperations(String s1, String s2, String s3) {
3    int minLen = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
4    int l = 0;
5    for (int i = 0; i < minLen; i++) {
6        if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
7            l++;
8        } else {
9            break;
10        }
11    }
12    if (l == 0) return -1;
13    return (s1.length() - l) + (s2.length() - l) + (s3.length() - l);
14}
15}