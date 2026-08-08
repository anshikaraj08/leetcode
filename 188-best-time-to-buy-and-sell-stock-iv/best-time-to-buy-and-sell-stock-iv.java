
    class Solution {

    int[][][] dp;

    public int solve(int[] prices, int idx, int buy, int cap) {

        if (cap == 0 || idx == prices.length)
            return 0;

        // already calculated
        if (dp[idx][buy][cap] != -1)
            return dp[idx][buy][cap];

        if (buy == 1) {

            // buy OR skip
            dp[idx][buy][cap] = Math.max(
                -prices[idx] + solve(prices, idx + 1, 0, cap),
                solve(prices, idx + 1, 1, cap)
            );

        } else {

            // sell OR skip
            dp[idx][buy][cap] = Math.max(
                prices[idx] + solve(prices, idx + 1, 1, cap - 1),
                solve(prices, idx + 1, 0, cap)
            );
        }

        return dp[idx][buy][cap];
    }

    

    public int maxProfit(int k, int[] prices) {
        int n = prices.length;

        dp = new int[n][2][k+1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(prices, 0, 1, k);
    }
}