// Last updated: 31/7/2025, 2:26:01 pm
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