// Last updated: 31/7/2025, 2:23:31 pm
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
     
     if(m*n!=original.length)
     {
        return new int[0][0];
     }
     int [][] arr=new int[m][n];
     int i1=0;
     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=original[i1];
            i1++;
        }
     }  
     return arr;
    }
}