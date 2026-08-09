class Solution {
    int [][] dp;
    public int solve(int[] nums,int idx,int prevIdx){
        if(idx>=nums.length) return 0;
        if(dp[idx][prevIdx+1]!=-1) return dp[idx][prevIdx+1];
        int take=0;
        if(prevIdx==-1 || nums[prevIdx]<nums[idx]){
            take=1+solve(nums,idx+1,idx);
        }
        int skip=0+solve(nums,idx+1,prevIdx);

        return dp[idx][prevIdx+1]=Math.max(take,skip);
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        dp = new int [n][n+1];
        for(int [] row: dp){
            Arrays.fill(row,-1);
        }

        return solve(nums,0,-1);
    }
}