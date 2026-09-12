class Solution {
public:
    bool isSafe(int r, int c, int n, vector<vector<int>>& grid) {
        return r >= 0 && r < n &&
               c >= 0 && c < n &&
               grid[r][c] == 0;
    }

    int shortestPathBinaryMatrix(vector<vector<int>>& grid) {

        int m = grid.size();
        int n = grid[0].size();

        if(grid[0][0] == 1 || grid[n-1][n-1] == 1)
            return -1;

        vector<vector<int>> directions = {
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1},           {0,1},
            {1,-1},  {1,0},   {1,1}
        };

        queue<pair<int,int>> q;

        q.push({0,0});
        grid[0][0] = 1;

        int level = 0;
        while(!q.empty()){
            int size=q.size();
            while(size--){
                auto f=q.front();
                int r=f.first;
                int c=f.second;
                q.pop();
                if(r==m-1 && c==n-1) return level+1;

                for(auto dir: directions){
                    int nr=r+dir[0];
                    int nc=c+dir[1];

                    if(isSafe(nr,nc,n,grid)){
                        q.push({nr,nc});
                        grid[nr][nc] = 1;

                    }
                }
            }
            level+=1;
        }
        return -1;
    }
};