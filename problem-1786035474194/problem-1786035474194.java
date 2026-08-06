// Last updated: 6/8/2026, 10:27:54 pm
1class Solution {
2    public int smallestNumber(int n, int t) {
3        int i=n;
4        while(i>=n){
5            if(isproduct(i)%t==0){
6                return i;
7            }
8            i++;
9        }
10        return 0;
11    }
12    public int isproduct(int n){
13        int p=1;
14        while(n!=0){
15            p*=n%10;
16            n/=10;
17        }
18        return p;
19    }
20}