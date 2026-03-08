// Last updated: 8/3/2026, 8:09:21 am
1class Solution {
2    public int minimumIndex(int[] capacity, int itemSize) {
3      int min=Integer.MAX_VALUE;
4      int idx=-1;
5        for(int i=0;i<capacity.length;i++){
6            if(capacity[i]>=itemSize){
7                if(min>capacity[i]){
8                    min=capacity[i];
9                    idx=i;
10                }
11            }
12        }
13        return idx;
14    }
15}