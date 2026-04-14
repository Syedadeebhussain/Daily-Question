// Last updated: 14/4/2026, 11:21:54 pm
1class Solution {
2    public int maxArea(int[] height) {
3     int l=0;
4     int r=height.length-1;
5     int ans=Integer.MIN_VALUE;
6     while(l<r){
7        ans=Math.max(ans,Math.min(height[l],height[r])*(r-l));
8        if(height[l]<height[r]){
9            l++;
10        }
11        else{
12            r--;
13        }
14     } 
15     return ans;
16    }
17}