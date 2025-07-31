// Last updated: 31/7/2025, 2:27:28 pm
class Solution {
    public int[][] generateMatrix(int n) {
    int [][] arr=new int[n][n];
   int minc = 0, minr = 0, maxc = arr[0].length - 1, maxr = arr.length - 1;
		int te = arr.length * arr[0].length;
		int c = 0;
    int value=1;
    while (c < te) {
			for (int i = minc; i <= maxc && c < te; i++) {
				arr[minr][i]=value++;
				c++;
			}
			minr++;
			for (int i = minr; i <= maxr && c < te; i++) {
				arr[i][maxc]=value++;
				c++;
			}
			maxc--;
			for (int i = maxc; i >= minc && c < te; i--) {
				arr[maxr][i]=value++;
				c++;
			}
			maxr--;
			for (int i = maxr; i >= minr && c < te; i--) {
				arr[i][minc]=value++;
				c++;
			}
			minc++;
		}
        return arr;
	}

}