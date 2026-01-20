// Last updated: 20/1/2026, 9:13:36 pm
1class Solution {
2    public int[] countBits(int n) {
3    int [] ans=new int[n+1];
4    for(int i=0;i<=n;i++){
5        int c=0;
6        int temp=i;
7        while(temp!=0){
8            temp=temp&(temp-1);
9            c++;
10        }
11        ans[i]=c;
12    } 
13    return ans;
14    }
15}