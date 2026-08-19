class Solution {
    int[][] dp;

    public int solve(int e, int f) {
        if (f <= 1) return f;
        if (e == 1) return f;

        if (dp[e][f] != -1)
            return dp[e][f];

        int low = 1;
        int high = f;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int breakEgg = solve(e - 1, mid - 1);
            int notBreak = solve(e, f - mid);

            int temp = 1 + Math.max(breakEgg, notBreak);
            ans = Math.min(ans, temp);

            if (breakEgg < notBreak) {
                // Need to go higher
                low = mid + 1;
            } else {
                // Need to go lower
                high = mid - 1;
            }
        }

        return dp[e][f] = ans;
    }

    public int superEggDrop(int k, int n) {
        dp = new int[k + 1][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(k, n);
    }
}