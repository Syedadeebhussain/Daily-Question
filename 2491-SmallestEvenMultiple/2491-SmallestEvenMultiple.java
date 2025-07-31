// Last updated: 31/7/2025, 2:22:51 pm
class Solution {
    public int smallestEvenMultiple(int n) {
        int max=Integer.MAX_VALUE;
        for(int i=1;i<max;i++)
        {
            if(i%2==0 && i%n==0)
            {
                return i;
            }
        }
        return 0;
    }
}