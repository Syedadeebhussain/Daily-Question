// Last updated: 31/7/2025, 2:21:18 pm
class Solution {
    public int reverseDegree(String s) {
        int sum=0;
      for(int i=0;i<s.length();i++){
        int n=find(s.charAt(i));
         sum+=n*(i+1);
      }  
      return sum;
    }
    public int find(char ch){
        int x=ch-'a';
        return Math.abs(x-26);
    }
}