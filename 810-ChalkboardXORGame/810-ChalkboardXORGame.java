// Last updated: 21/1/2026, 7:29:55 pm
1class Solution {
2    public boolean xorGame(int[] nums) {
3        int xor=0;
4     for(int num:nums){
5        xor^=num;
6     }   
7     if(xor==0) return true;
8     if(nums.length%2==0) return true; //Alice always has a “reply move” for Bob’s move
9     else return false; //Bob always has a “counter move” to whatever Alice does
10    }
11
12    // If the XOR is already zero before Alice starts, then Alice wins immediately and we return true
13
14}