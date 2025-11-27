// Last updated: 27/11/2025, 10:36:17 pm
1class Solution {
2    public int minimumFlips(int n) {
3        String s=Integer.toBinaryString(n);
4        String r=new StringBuilder(s).reverse().toString();
5        int c=0;
6        for(int i=0;i<s.length();i++)
7            {
8                if(s.charAt(i)!=r.charAt(i)) c++;
9            }
10        return c;
11        
12    }
13}