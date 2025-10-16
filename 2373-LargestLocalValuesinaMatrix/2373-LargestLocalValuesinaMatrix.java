// Last updated: 16/10/2025, 9:01:35 pm
class Solution {
    public int[][] largestLocal(int[][] grid) {
     int [][] arr=new int [grid.length-2][grid.length-2];
      for(int i=0;i<grid.length-2;i++){
        for(int j=0;j<grid.length-2;j++){
            arr[i][j]=findMax(i,j,grid);
        }
      }
      return arr;
    }
    public int findMax(int row,int col,int [][] arr){
        int max=Integer.MIN_VALUE;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                max=Math.max(max,arr[i][j]);
            }
        }
        return max;
    }
}