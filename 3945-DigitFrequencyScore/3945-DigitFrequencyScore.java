// Last updated: 3/6/2026, 11:56:09 pm
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int s=0;
4        while(n!=0){
5            s+=n%10;
6            n=n/10;
7        }
8        return s;
9    }
10}