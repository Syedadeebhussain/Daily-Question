// Last updated: 16/10/2025, 9:44:43 pm
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xPoints = new int[points.length];

        for (int i=0; i<points.length; i++) {
            xPoints[i] = points[i][0];
        }

        Arrays.sort(xPoints);
        int widestArea = 0;

        for (int i=0; i<xPoints.length-1; i++) {
            int area = xPoints[i+1] - xPoints[i];
            widestArea = Math.max(widestArea, area);
        }

        return widestArea;
        
    }
}