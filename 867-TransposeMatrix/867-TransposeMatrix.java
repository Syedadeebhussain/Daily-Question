// Last updated: 30/12/2025, 3:01:14 pm
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int [][] ans=new int [matrix[0].length][matrix.length];
4        for(int i=0;i<matrix[0].length;i++){
5            for(int j=0;j<matrix.length;j++){
6                ans[i][j]=matrix[j][i];
7            }
8        }
9        return ans;
10    }
11}