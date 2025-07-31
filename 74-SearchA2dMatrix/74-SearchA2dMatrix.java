// Last updated: 31/7/2025, 2:27:23 pm
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c=0;
   for(int i=0;i<matrix.length;i++)
   {
    for(int j=0;j<matrix[0].length;j++)
    {
        if(matrix[i][j]==target)
        {
            c++;
        }
    }
    if(c>=1)
    {
        return true;
    }
   
   } 
    return false;
    }

}