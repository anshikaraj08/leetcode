class Solution {
public:
    vector<vector<int>> dp;
    int solve(vector<int>& prices,int idx,int canBuy){
        //base case
        if(idx>=prices.size()) return 0;
        if(dp[idx][canBuy]!=-1) return dp[idx][canBuy];
        int profit=0;
        //allowed to buy->buy or skip
        if(canBuy){
            profit+=max(-prices[idx]+solve(prices,idx+1,0), solve(prices,idx+1,1));
        }else{
            profit+=max(prices[idx]+solve(prices,idx+1,1),solve(prices,idx+1,0));
        }
        return dp[idx][canBuy]= profit;
    }
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        dp.resize(n,vector<int>(2,-1));
        int ans=solve(prices,0,1);
        return ans;
    }
};