// Last updated: 4/6/2026, 11:33:15 pm
1class Solution {
2    public int totalWaviness(int num1, int num2) {
3        int c=0;
4       for(int i=num1;i<=num2;i++){
5        c+=Solve(i);
6       } 
7       return c;
8    }
9    public int Solve(int n){
10        String s=String.valueOf(n);
11        int c=0;
12        for(int i=1;i<s.length()-1;i++){
13            int c1=s.charAt(i-1)-'0';
14            int c2=s.charAt(i)-'0';
15            int c3=s.charAt(i+1)-'0';
16            if(c2>c1 && c2>c3){
17                c++;
18            }
19            else  if(c2<c1 && c2<c3){
20                c++;
21            }
22        }
23        return c;
24    }
25}