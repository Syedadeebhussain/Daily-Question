// Last updated: 5/10/2025, 5:07:42 pm
class Solution {
    public boolean winnerOfGame(String colors) {
        int aMoves = 0, bMoves = 0;
        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i - 1) == 'A' && colors.charAt(i) == 'A' && colors.charAt(i + 1) == 'A') {
                aMoves++;
            }
            if (colors.charAt(i - 1) == 'B' && colors.charAt(i) == 'B' && colors.charAt(i + 1) == 'B') {
                bMoves++;
            }
        }
        return aMoves > bMoves;
    }
}
