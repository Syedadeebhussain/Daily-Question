// Last updated: 4/1/2026, 1:10:40 pm
1class Solution {
2    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
3      int [] dist=new int[n];
4    
5      Arrays.fill(dist,Integer.MAX_VALUE);
6        dist[0]=0;
7      for(int i=0;i<restrictions.length;i++){
8         int idx=restrictions[i][0];
9         int val=restrictions[i][1];
10        //  dist[idx]=Math.min(dist[idx],val);
11        dist[idx]=val;
12      }
13      for(int i=1;i<n;i++){
14        dist[i]=Math.min(dist[i],dist[i-1]+diff[i-1]);
15      }
16      for(int i=n-2;i>=0;i--)
17      {
18     dist[i]=Math.min(dist[i],dist[i+1]+diff[i]);
19      }
20      int ans=Integer.MIN_VALUE;
21      for(int i:dist){
22        ans=Math.max(ans,i);
23      } 
24      return ans; 
25  }
26}