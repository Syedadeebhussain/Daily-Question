// Last updated: 18/12/2025, 10:38:47 am
1class Solution {
2    public int findCenter(int[][] edges) {
3     int [] arr=new int [edges.length+2];
4     for(int i=0;i<edges.length;i++){
5        arr[edges[i][0]]++;
6        arr[edges[i][1]]++;
7        if(arr[edges[i][1]]==edges.length){
8            return edges[i][1];
9        }
10        else if(arr[edges[i][0]]==edges.length){
11            return edges[i][0];
12        }
13     }   
14     return 0;
15    }
16}