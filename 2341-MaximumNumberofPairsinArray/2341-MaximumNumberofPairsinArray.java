// Last updated: 22/1/2026, 11:51:46 pm
1class Solution {
2    public int[] numberOfPairs(int[] nums) {
3        int[] freq = new int[101];
4        for (int i = 0; i < nums.length; i++) {
5            freq[nums[i]]++;
6        }
7        int p = 0;
8        int l = 0;
9        for (int f : freq) {
10            p+=f/2;   
11            l+=f%2; 
12        }
13        return new int[]{p,l};
14    }
15}
16