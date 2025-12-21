// Last updated: 21/12/2025, 12:12:36 pm
1class Solution {
2    public int mirrorDistance(int n) {
3    String s=Integer.toString(n);
4   int n1 = Integer.parseInt(new StringBuilder(s).reverse().toString());
5    return Math.abs(n-n1);    
6    }
7}