// Last updated: 20/9/2026, 5:39:33 pm
1class Solution {
2    public int reverseDegree(String s) {
3        int sum=0;
4      for(int i=0;i<s.length();i++){
5        int n=find(s.charAt(i));
6         sum+=n*(i+1);
7      }  
8      return sum;
9    }
10    public int find(char ch){
11        int x=ch-'a';
12        return Math.abs(x-26);
13    }
14}