// Last updated: 19/5/2026, 10:46:18 pm
1class Solution {
2    public boolean isGood(int[] nums) {
3    Arrays.sort(nums);
4    int max=nums[nums.length-1];
5    int [] freq=new int[201];
6    for(int i=0;i<nums.length;i++){
7        freq[nums[i]]++;
8    }
9    for(int i=1;i<max;i++){
10        if(freq[i]!=1) return false;
11    }
12    int c=freq[max];
13    if(c==2) return true;
14    return false;    
15    }
16}