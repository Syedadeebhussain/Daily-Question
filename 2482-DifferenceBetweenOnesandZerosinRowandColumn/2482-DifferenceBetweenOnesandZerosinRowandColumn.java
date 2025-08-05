// Last updated: 5/8/2025, 10:34:37 pm
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
       int [][] arr=new int[grid.length][grid[0].length];
       int [] onesrow=new int [grid.length];
       int [] onesCol=new int [grid[0].length];
       int [] zerosRow=new int [grid.length];
       int [] zerosCol=new int [grid[0].length];

       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1){
                onesrow[i]++;
                onesCol[j]++;
            }
            else {
                zerosRow[i]++;
                zerosCol[j]++;
            }
        }
        
       } 
      for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                arr[i][j] = onesrow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];
            }
        }

        return arr;
    }
}