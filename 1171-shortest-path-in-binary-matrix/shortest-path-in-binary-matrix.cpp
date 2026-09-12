class Solution {
public:
    typedef  pair<int,pair<int,int>> p;
    bool isSafe(int r, int c, int n, vector<vector<int>>& grid) {
        return r >= 0 && r < n &&
               c >= 0 && c < n &&
               grid[r][c] == 0;
    }

    int shortestPathBinaryMatrix(vector<vector<int>>& grid) {

        int m = grid.size();
        int n = grid[0].size();

        if(m==0 || n==0 || grid[0][0]!=0) return -1;

        if(grid[0][0] == 1 || grid[n-1][n-1] == 1)
            return -1;

        vector<vector<int>> directions = {
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1},           {0,1},
            {1,-1},  {1,0},   {1,1}
        };

        vector<vector<int>> res(m,vector<int>(n,INT_MAX));

        priority_queue<p,vector<p>,greater<p>> q;

        res[0][0]=0;
        q.push({0,{0,0}}); 
        grid[0][0]=1;

        while(!q.empty()){
            auto f=q.top();
            q.pop();


            int d=f.first;

            auto [r,c]=f.second;
            for(auto dir: directions){
                int nr=r+dir[0];
                int nc=c+dir[1];
                
                if(isSafe(nr,nc,n,grid) && res[nr][nc] > d+1){
                    res[nr][nc]=d+1;
                    q.push({d+1,{nr,nc}});
                    grid[nr][nc]=1;
                }

            


            }

        }
        return res[m-1][n-1] == INT_MAX ? -1 : res[m-1][n-1] + 1;

        
    }
};