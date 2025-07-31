// Last updated: 31/7/2025, 2:27:25 pm
class Solution {
    public int mySqrt(int n) {
      int lo=0;
      int hi=n;
      int ans=0;
      while(lo<=hi)
      {
          int mid=(lo+hi)/2;
          if(Math.pow(mid,2)<=n)
          {
            ans=mid;
            lo=mid+1;
          }
          else
          {
            hi=mid-1;
          }
      }
    return ans;
        }
}
