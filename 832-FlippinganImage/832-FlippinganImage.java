// Last updated: 18/10/2025, 7:05:44 am
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int i = 0, j = row.length - 1; i <= j; i++, j--) {
                int temp = row[i] ^ 1;
                row[i] = row[j] ^ 1;
                row[j] = temp;
            }
        }
        return image;
    }
}
