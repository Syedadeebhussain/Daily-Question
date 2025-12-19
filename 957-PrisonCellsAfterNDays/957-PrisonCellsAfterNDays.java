// Last updated: 19/12/2025, 9:34:37 pm
1class Solution {
2    public int[] prisonAfterNDays(int[] cells, int n) {
3      n=n%14;
4      if(n==0){
5       n=14;
6      }
7      for(int i=0;i<n;i++){
8        int [] next=new int [8];
9        for(int i1=1;i1<7;i1++){
10            next[i1]=(cells[i1-1]==cells[i1+1])?1:0;
11        }
12       cells=next;
13      }
14      return cells;  
15    }
16}