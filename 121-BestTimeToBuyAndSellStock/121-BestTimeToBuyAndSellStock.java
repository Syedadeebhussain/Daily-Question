// Last updated: 31/7/2025, 2:26:56 pm
class Solution {
    public int maxProfit(int[] prices) {
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int p=0;
    for(int j:prices)
    {
     if(j<=min)
     {
        min=j;
     }
     p=j-min;
     max=Math.max(max,p);
    }
    return max;

    }
}