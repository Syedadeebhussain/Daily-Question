// Last updated: 30/10/2025, 10:08:49 pm
import java.util.Arrays;

class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        return Combination(coins, amount, 0, dp);
    }

    public static int Combination(int[] coin, int amount, int idx, int[][] dp) {
        if (amount == 0) return 1;  
        if (idx == coin.length) return 0; 

        if (dp[idx][amount] != -1) return dp[idx][amount]; 

        int ways = 0;
        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                ways += Combination(coin, amount - coin[i], i, dp); 
            }
        }
        return dp[idx][amount] = ways; 
    }
}
