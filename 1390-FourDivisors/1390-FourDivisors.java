// Last updated: 4/1/2026, 10:42:05 am
1class Solution {
2    public int sumFourDivisors(int[] nums) {
3     int s=0;
4      for(int i:nums){
5        int c=0,count=0;
6        for(int j=1;j<=i;j++){
7            if(i%j==0){
8                c+=j;
9                count++;
10                if(count>4) break;
11            }
12        }
13        if(count==4){
14            s+=c;
15        }
16      }  
17      return s;
18    }
19}