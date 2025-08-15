// Last updated: 15/8/2025, 8:06:57 am
class Solution {
    public boolean isPowerOfFour(int n) {
   if(n==0)
   {
    return false;
   }
   while(n!=1)
   {
    if(n%4==0)
    {
        n=n/4;
    }
    else
    {
        return false;
    }
   }
   return true;
}
}