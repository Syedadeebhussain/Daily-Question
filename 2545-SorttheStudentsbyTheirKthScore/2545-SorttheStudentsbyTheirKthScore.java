// Last updated: 8/8/2025, 12:04:43 pm
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (p, q) -> Integer.compare(q[k], p[k]));
        return score;
    }
}