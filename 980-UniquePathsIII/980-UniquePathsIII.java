// Last updated: 5/10/2025, 7:29:30 pm
class Solution {
    public int uniquePathsIII(int[][] grid) {
  // this Q is similar to all unique except we have keep track on the number of cells that are zero
        int zero=0;
        int x=0;
        int y=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) zero++;
                if(grid[i][j]==1){
                    x=i;
                    y=j;
                }
        }
    }
    return find(grid,x,y,zero);
}
public int find(int [][] arr,int i,int j,int zero){
     if(i<0 || j<0|| i>=arr.length ||j>=arr[0].length || arr[i][j]==-1){
            return 0;
        }
        if(arr[i][j]==2){
            if(zero==-1){// for target also we have minus zero
                return 1;
            }
            return 0;
        }
        arr[i][j]=-1;
        zero--;
        int a=0;
        a+=find(arr,i,j+1,zero);
        a+=find(arr,i,j-1,zero);
        a+=find(arr,i+1,j,zero);
        a+=find(arr,i-1,j,zero);
        arr[i][j]=0;
        zero++;
        return a;

    }
}