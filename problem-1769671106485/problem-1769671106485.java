// Last updated: 29/1/2026, 12:48:26 pm
1class Solution {
2    public int[] evenOddBit(int n) {
3    int [] arr=new int[2];
4    int co=0;
5    int ce=0;
6    for(int i=0;i<32;i++){
7        if((n&(1<<i))!=0){
8            if(i%2==0){
9                ce++;
10            }
11            else{
12                co++;
13            }
14        }
15    }
16    return new int[]{ce,co};
17    }
18}