// Last updated: 12/2/2026, 11:34:47 pm
1class Solution {
2    public int minAddToMakeValid(String s) {
3        int op=0;
4        int c=0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)=='('){
7                op++;
8            }
9            else {
10                op--;
11                if(op<0){
12                    op++;
13                    c++;
14                }
15            }
16        }
17        return op==0?c:c+op;
18    }
19}