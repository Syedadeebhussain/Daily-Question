// Last updated: 31/7/2025, 2:28:00 pm
class Solution {
    public int maxArea(int[] height) {
        int lo=0;
        int hi=height.length-1;
        int water=0;
        while(lo<hi)
        {
            water=Math.max(water,Math.min(height[lo],height[hi])*(hi-lo));
            if(height[lo]>height[hi])
                hi--;
            else
                lo++;
        }
        return water;
    }
}