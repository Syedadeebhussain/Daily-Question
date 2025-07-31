// Last updated: 31/7/2025, 2:28:02 pm
class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        int r;
        while(x>0)
        {
            r=x%10;
            rev=(rev*10)+r;
            x=x/10;
        }
        if(n==rev)
            return true;
            else
            return false;
    }

    }
