// Last updated: 31/7/2025, 10:05:11 pm
class Solution {
    public int commonFactors(int a, int b) {
        int count=1;
        int minimum=a>b?b:a;
        
        for(int i=2;i<=minimum;i++)
        {
            if(a%i==0 && b%i ==0)
                count+=1;

        }
        return count;
    }
}