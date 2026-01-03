// Last updated: 3/1/2026, 10:40:53 am
1class Solution {
2    public int findChampion(int n, int[][] edges) {
3    int [] indegree=new int [n];
4    for(int i=0;i<edges.length;i++){
5        int b=edges[i][1];
6        indegree[b]++;
7    }
8    int c=0;
9    int ans=-1;
10    for(int i=0;i<n;i++){
11        if(indegree[i]==0){
12          ans=i;
13          c++;
14          if(c>1){
15            return -1;
16          }
17        }
18    }
19    return ans;
20    }
21}