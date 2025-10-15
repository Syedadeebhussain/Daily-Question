// Last updated: 15/10/2025, 9:15:47 pm
class Solution {
    public int findChampion(int n, int[][] edges) {
    int [] indegree=new int [n];
    for(int i=0;i<edges.length;i++){
        int b=edges[i][1];
        indegree[b]++;
    }
    int c=0;
    int ans=-1;
    for(int i=0;i<n;i++){
        if(indegree[i]==0){
          ans=i;
          c++;
          if(c>1){
            return -1;
          }
        }
    }
    return ans;
    }
}