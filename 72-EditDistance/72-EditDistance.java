// Last updated: 12/9/2025, 9:23:58 am
class Solution {
    public int minDistance(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i < dp.length; i++) dp[i][0] = i; 
        for (int j = 0; j < dp[0].length; j++) dp[0][j] = j; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int del = dp[i - 1][j];     
                    int ins = dp[i][j - 1];     
                    int rep = dp[i - 1][j - 1]; 
                    dp[i][j] = 1 + Math.min(del, Math.min(ins, rep));
                }
            }
        }

        return dp[n][m];
    }
}