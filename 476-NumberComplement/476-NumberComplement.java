// Last updated: 19/1/2026, 1:31:46 pm
1class Solution {
2    public int hammingDistance(int x, int y) {
3    int z=x^y;
4    int bit=0;
5    while(z>0){
6        if((z&1)!=0) bit++;
7        z>>=1;
8    }
9    return bit;
10    }
11}