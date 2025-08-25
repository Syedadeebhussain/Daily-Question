// Last updated: 25/8/2025, 10:27:28 pm
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
       int max=Integer.MIN_VALUE;
       int [] arr=new int [2];
    for(int i=0;i<mat.length;i++){
       int s=0;
        for(int j=0;j<mat[0].length;j++){
            s+=mat[i][j];
        }
        if(s>max){
            max=s;
            arr[0]=i;
            arr[1]=s;
        }
    }
    return arr;
    }
}