// Last updated: 4/1/2026, 11:13:30 am
1class Solution {
2    public int maxRepeating(String sequence, String word) {
3        int k = 0;
4        String temp = word;
5        while (sequence.contains(temp)) {
6            k++;
7            temp += word;
8        }
9        return k;
10    }
11}
12