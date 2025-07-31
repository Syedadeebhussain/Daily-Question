// Last updated: 31/7/2025, 2:28:03 pm
class Solution {
    public int reverse(int x) {
      int r;
    long rev=0;
    while(x!=0)
    {
       r=x%10;
       rev=rev*10+r; 
       x=x/10;
    }   
    
    if(rev>=Integer.MIN_VALUE && rev<=Integer.MAX_VALUE)
    {
    return (int)rev;
    }
    else
    {
 return 0;
    }
    }
    }

