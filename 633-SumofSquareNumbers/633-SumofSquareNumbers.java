// Last updated: 5/8/2026, 11:01:53 pm
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long j=(long)Math.sqrt(c);
4        long i=0;
5        while(i<=j){
6            if(i*i+j*j==c){
7                return true;
8            }
9            else if(i*i+j*j<c){
10                i++;
11            }
12            else{
13                j--;
14            }
15        }
16        return false;
17
18    }
19}