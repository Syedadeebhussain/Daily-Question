// Last updated: 1/10/2025, 3:33:47 pm
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
      int p=intervals[0][1];
      int c=0;
      for(int i=1;i<intervals.length;i++){
        if(p>intervals[i][0]){
            c++;
        }
        else{
            p=intervals[i][1];
        }
      }
      return c;
    }
}