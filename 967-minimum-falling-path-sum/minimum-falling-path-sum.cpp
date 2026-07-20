class Solution {
public:
vector<vector<int>> dp;
vector<vector<int>> vis;
int solve(vector<vector<int>>& matrix,int i,int j){
    int n=matrix.size();
    if(j<0 || j>=n) return 1e9;
    
    if(i==n-1) return matrix[i][j];
    if(vis[i][j]!=0) return dp[i][j];

    vis[i][j]=1;
    int up=matrix[i][j]+solve(matrix,i+1,j);
    int ld=matrix[i][j]+solve(matrix,i+1,j-1);
    int rd=matrix[i][j]+solve(matrix,i+1,j+1);

    return dp[i][j]=min(up,min(ld,rd));


}
    int minFallingPathSum(vector<vector<int>>& matrix) {
        int n=matrix.size();
        
        int ans=1e9;
        for(int i=0;i<n;++i){
            dp.resize(n,vector<int>(n,-1));
            vis.resize(n,vector<int>(n,0));
            ans= min(ans,solve(matrix,0,i));
        }
        return ans;

    }
};