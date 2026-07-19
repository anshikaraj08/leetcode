class Solution {
public:
    vector<vector<bool>> vis;

    int solve(int i,int j,vector<vector<int>>& triangle, int n,vector<vector<int>>& dp){
        if(i==n-1){
            //row is last means take it in answer
            return triangle[i][j];
        }

        if(i >= n) return 0;

        if(vis[i][j]) return dp[i][j];

        vis[i][j] = true;

        int down=triangle[i][j]+solve(i+1,j,triangle, n,dp);
        int dg=triangle[i][j]+solve(i+1,j+1,triangle, n, dp);

        return dp[i][j]=min(down,dg);
    }
    int minimumTotal(vector<vector<int>>& triangle) {
        int n=triangle.size();
        vector<vector<int>> dp(n,vector<int>(n,-1));
        vis.resize(n, vector<bool>(n, false));
        return solve(0,0,triangle,n,dp);
    }
};