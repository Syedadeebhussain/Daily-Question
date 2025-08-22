// Last updated: 22/8/2025, 10:59:49 am
class Solution {
    public int minimumArea(int[][] grid) {
    int maxR=-1;
    int minR=grid.length;
    int maxC=-1;
    int minC=grid[0].length;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1){
                if(i<minR) minR=i;
                if(i>maxR) maxR=i;
                if(j<minC) minC=j;
                if(j>maxC) maxC=j;
            }
        }
    }
    return (maxR-minR+1)*(maxC-minC+1);
    }
}