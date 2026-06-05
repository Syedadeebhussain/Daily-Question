// Last updated: 5/6/2026, 8:40:11 pm
1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3        int c=0;
4        char d=(char)(digit+'0');
5     for(int i=0;i<nums.length;i++){
6        String s=String.valueOf(nums[i]);
7        for(int j=0;j<s.length();j++){
8            if(s.charAt(j)==d){
9                c++;
10            }
11        }
12     }   
13     return c;
14    }
15}