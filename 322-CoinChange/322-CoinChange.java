// Last updated: 3/11/2025, 8:08:45 pm
class Solution {
    public int coinChange(int[] coins, int amount) {
         int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        int ans = solve(coins, amount, n, dp);
        return ans == Integer.MAX_VALUE - 1 ? -1 : ans;
    }

    static int solve(int[] coins, int amount, int i, int[][] dp) {
        if (amount == 0)
            return 0;
        if (i == 0)
            return Integer.MAX_VALUE - 1;// because of overflow

        if (dp[i][amount] != -1)
            return dp[i][amount];

        if (coins[i - 1] <= amount) {
            int take = 1 + solve(coins, amount - coins[i - 1], i, dp);
            int notTake = solve(coins, amount, i - 1, dp);
            dp[i][amount] = Math.min(take, notTake);
        } else {
            dp[i][amount] = solve(coins, amount, i - 1, dp);
        }
        return dp[i][amount];
    }
}