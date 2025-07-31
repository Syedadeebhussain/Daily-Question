// Last updated: 31/7/2025, 2:22:00 pm
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int n=grid.length*grid.length;
      int [] freq=new int[n+1];
      int [] arr=new int[2];
      for(int i=0;i<grid.length;i++)
      {
        for(int j=0;j<grid[0].length;j++)
        {
            freq[grid[i][j]]+=1;
        }
      }  
      for(int i1=1;i1<freq.length;i1++)
      {
        if(freq[i1]==0)
        {
            arr[1]=i1;
        }
        else if(freq[i1]==2)
        {
            arr[0]=i1;
        }
      }
      return arr;
    }
}