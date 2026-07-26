class Solution {
    int [][] dp;
    public int solve(int n,int [] nums, int tar){
        // if(n==0 && nums[0]==tar) return 1;
        // else return 0;
        if(n==0){
            if(tar==0 && nums[0]==0) return 2;
            if(tar == 0 || nums[0]==tar) return 1;
            return 0;
        }
        if(dp[n][tar]!=-1) return dp[n][tar];
        int nottake=solve(n-1,nums,tar);
        int take=0;
        if(nums[n]<=tar) take=solve(n-1,nums,tar-nums[n]);

        return dp[n][tar]=take+nottake;
        
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int num: nums) sum+=num;
        if(sum-target<0 || (sum-target)%2!=0) return 0;
        int ntarget=(sum-target)/2;
        dp=new int[n][ntarget+1];

        for(int [] row: dp){
            Arrays.fill(row,-1);
        }
        

        int ans= solve(n-1,nums,ntarget);
        return ans;
    }
}