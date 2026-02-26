// Last updated: 26/2/2026, 10:18:00 pm
1class Solution {
2    public int numSteps(String s) {
3        int carry=0;
4        int steps=0;
5     for(int i=s.length()-1;i>0;i--){
6        int bit=s.charAt(i)-'0';
7        if(bit+carry==1){
8           steps+=2;
9           carry=1;
10        }
11        else{
12            steps+=1;
13        }
14     }   
15     return steps+carry;
16    }
17}