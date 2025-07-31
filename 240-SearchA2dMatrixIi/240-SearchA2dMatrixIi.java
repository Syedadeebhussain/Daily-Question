// Last updated: 31/7/2025, 2:26:11 pm
class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0)
        {
            if(arr[row][col]==target)
            {
                return true;
            }
            else if(arr[row][col]>target)
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return false;
    }
}