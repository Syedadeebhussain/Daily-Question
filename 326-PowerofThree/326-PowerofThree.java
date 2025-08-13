// Last updated: 13/8/2025, 8:42:44 am
class Solution {
    public boolean isPowerOfThree(int n) {
    if(n==0)
    {
        return false;
    }
    while(n!=1)
    {
        if(n%3==0)
        {
            n=n/3;
        }
        else
        {
            return false;
        }
    }
    return true;
    }

}