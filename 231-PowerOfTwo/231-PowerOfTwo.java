// Last updated: 31/7/2025, 2:26:18 pm
class Solution {
    public boolean isPowerOfTwo(int n) {
    if(n==0)
    {
        return false;
    }
    while(n!=1)
    {
        if(n%2!=0)
        {
            return false;
        }
        else
        {
        n=n/2;
        }
    }

return true;
    }
}