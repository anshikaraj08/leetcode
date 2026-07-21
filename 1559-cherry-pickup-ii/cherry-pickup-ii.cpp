class Solution {
public:
    
    vector<vector<vector<int>>> dp;

    int solve(vector<vector<int>>& grid,int row,int c1,int c2,int m, int n){
       if (c1 < 0 || c1 >= n || c2 < 0 || c2 >= n)
            return -1e9;

        if(row>=m) return 0;//The maximum cherries that can be collected from "no remaining rows" is 0.
        if (dp[row][c1][c2] != -1)
            return dp[row][c1][c2];
        int cherry=grid[row][c1];
        if(c1!=c2){
            cherry+=grid[row][c2];
        }
        int ans=0;
        for(int i=-1;i<=1;++i){
            for(int j=-1;j<=1;++j){
                int newRow=row+1;
                int newc1=c1+i;
                int newc2=c2+j;
                
                ans=max(ans,solve(grid,newRow,newc1,newc2,m,n));
            }
        }
        return dp[row][c1][c2]=
        cherry+ans;

    }
    int cherryPickup(vector<vector<int>>& grid) {
        int m=grid.size();
        int n=grid[0].size();
        dp.resize(m,vector<vector<int>>(n,vector<int>(n,-1)));
        return solve(grid,0,0,n-1,m,n);
    }
};