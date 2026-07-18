class Solution {
public:
    int solve(int i,int j,int m,int n,vector<vector<int>> &dp,vector<vector<int>>& obstacleGrid){
        if(i>m-1 || j>n-1) return 0;
        if(i>=0 && j>=0 && obstacleGrid[i][j]==1) return 0;
        if(i==m-1 &&  j==n-1) return 1;
        
        if(i>m-1 || j>n-1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int down=solve(i+1, j, m,n,dp,obstacleGrid);
        int right= solve(i, j+1, m,n,dp,obstacleGrid );
        
        return dp[i][j]=down+right;

    }
    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        int m=obstacleGrid.size();
        int n=obstacleGrid[0].size();
        vector<vector<int>> dp(m,vector<int>(n,-1));
        return solve(0,0,m,n,dp,obstacleGrid);
    }
};