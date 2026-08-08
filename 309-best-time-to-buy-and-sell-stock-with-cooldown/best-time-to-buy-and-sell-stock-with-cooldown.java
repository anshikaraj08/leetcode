class Solution {

    int[][] dp;

    public int solve(int[] prices, int idx, int canBuy) {

        // base case
        if (idx >= prices.length)
            return 0;

        // already calculated
        if (dp[idx][canBuy] != -1)
            return dp[idx][canBuy];

        int profit = 0;

        // allowed to buy -> buy or skip
        if (canBuy == 1) {

            profit = Math.max(
                -prices[idx] + solve(prices, idx + 1, 0),
                solve(prices, idx + 1, 1)
            );

        } else {

            // allowed to sell -> sell or skip
            profit = Math.max(
                prices[idx] + solve(prices, idx + 2, 1),//only sell in whole code therefore while selling just jump 2 days not 1
                solve(prices, idx + 1, 0)
            );
        }

        return dp[idx][canBuy] = profit;
    }
    public int maxProfit(int[] prices) {
         int n = prices.length;

        dp = new int[n][2];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(prices, 0, 1);
    }
}




