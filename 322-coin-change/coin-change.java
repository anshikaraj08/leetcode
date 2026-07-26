class Solution {
    int [][] dp;
    public int solve(int n,int [] coins,int amount){
        if(amount==0 ) return 0;
        if(n==0 && amount % coins[n]!=0) return (int)1e9;
        if(n==0 && amount % coins[n]==0) return amount / coins[n];
        if(dp[n][amount]!=0) return dp[n][amount];
        int nottake=0+solve(n-1,coins,amount);
        int take=(int)1e9;
        if(coins[n]<=amount){
            take=1+solve(n,coins,amount-coins[n]);
        }
        return dp[n][amount]=Math.min(take, nottake);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        dp=new int [n][amount+1];
        int ans= solve(n-1,coins,amount);
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        
        if (ans >= (int)1e9)
        return -1;
        else return ans;
    }
}