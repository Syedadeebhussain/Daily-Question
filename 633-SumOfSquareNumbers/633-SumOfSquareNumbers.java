// Last updated: 31/7/2025, 2:25:29 pm
class Solution {
    public boolean judgeSquareSum(int c) {
      long lo=0;
      long hi=(int)Math.sqrt(c);
      while(lo<=hi){
        long sum=lo*lo+hi*hi;
        if(sum==c){
            return true;
        }
        else if(sum<c){
            lo++;
        }
        else
        {
            hi--;
        }

      } 
      return false;
    }
}