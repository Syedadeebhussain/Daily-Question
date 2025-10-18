// Last updated: 18/10/2025, 7:05:23 am
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int [][] arr=new int [image.length][image[0].length];
      for(int [] row:image){
        flip(row);
      }  
      for(int i=0;i<image.length;i++){
        for(int j=0;j<image[0].length;j++){
            // if(image[i][j]==1){
            //     arr[i][j]=0;
            // }
            // else{
            //     arr[i][j]=1;
            // }
           arr[i][j] = (image[i][j] == 1) ? 0 : 1;
        }
      }
      return arr;
    }
    public void flip(int [] row){
        int i=0;
        int j=row.length-1;
        while(i<j){
            int temp=row[i];
            row[i]=row[j];
            row[j]=temp;
            i++;
            j--;
        }
    }
}