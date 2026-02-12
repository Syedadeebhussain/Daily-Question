// Last updated: 12/2/2026, 11:18:02 pm
1class Solution {
2    public int nearestValidPoint(int x, int y, int[][] points) {
3      int min=Integer.MAX_VALUE;
4      int id=-1;
5      int i=0;
6      for(int []arr:points){
7        int[] a=arr;
8        if(a[0]==x || a[1]==y){
9            int dist=(x-a[0])*(x-a[0])+(y-a[1])*(y-a[1]);
10          if(dist<min){
11            min=dist;
12            id=i;
13          }
14        }
15        i++;
16      }  
17      return id;
18    }
19}