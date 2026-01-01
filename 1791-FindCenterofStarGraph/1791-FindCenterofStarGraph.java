// Last updated: 1/1/2026, 10:52:15 am
1class Solution {
2    public int findCenter(int[][] edges) {
3    //  int [] arr=new int [edges.length+2];
4    //  for(int i=0;i<edges.length;i++){
5    //     arr[edges[i][0]]++;
6    //     arr[edges[i][1]]++;
7    //     if(arr[edges[i][1]]==edges.length){
8    //         return edges[i][1];
9    //     }
10    //     else if(arr[edges[i][0]]==edges.length){
11    //         return edges[i][0];
12    //     }
13    //  }   
14    //  return 0;
15      int [] arr=new int [edges.length+2];
16     for(int i=0;i<edges.length;i++){
17        arr[edges[i][0]]++;
18        arr[edges[i][1]]++;
19        if(arr[edges[i][1]]>1){
20            return edges[i][1];
21        }
22        else if(arr[edges[i][0]]>1){
23            return edges[i][0];
24        }
25     }   
26     return 0;
27    }
28}