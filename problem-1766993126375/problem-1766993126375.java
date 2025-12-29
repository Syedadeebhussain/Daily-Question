// Last updated: 29/12/2025, 12:55:26 pm
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int old=image[sr][sc];
4        if(old==color) return image;
5        dfs(image,sr,sc,old,color);
6        return image;
7    }
8    public void dfs(int [][] image,int i,int j,int old,int color){
9        if(i<0 ||i>=image.length ||j<0||j>=image[0].length ||image[i][j]!=old){
10            return ;
11        }
12        image[i][j]=color;
13        dfs(image,i,j-1,old,color);
14        dfs(image,i,j+1,old,color);
15        dfs(image,i+1,j,old,color);
16        dfs(image,i-1,j,old,color);
17    }
18}