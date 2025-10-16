// Last updated: 16/10/2025, 9:40:38 pm
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points,(a,b)->a[0]-b[0]);
        int max=Integer.MIN_VALUE;
        for(int i=1;i<points.length;i++){
            int diff=points[i][0]-points[i-1][0];
            max=Math.max(max,diff);
        }
        return max;
    }
}