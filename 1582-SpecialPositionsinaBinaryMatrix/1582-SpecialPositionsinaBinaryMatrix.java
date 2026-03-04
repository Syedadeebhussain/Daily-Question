// Last updated: 4/3/2026, 10:01:36 pm
1class Solution {
2    public int numSpecial(int[][] mat) {
3    int [] row=new int [mat.length];
4    int [] col=new int [mat[0].length];
5    for(int i=0;i<mat.length;i++){
6        for(int j=0;j<mat[0].length;j++){
7            if(mat[i][j]==1){
8                 row[i]++;
9                 col[j]++;
10            }
11        }
12    }
13    int c=0;
14    for(int i=0;i<mat.length;i++){
15        for(int j=0;j<mat[0].length;j++){
16            if(mat[i][j]==1 && row[i]==1 && col[j]==1){
17                c++;
18            }
19        }
20    }  
21    return c;
22    }
23}