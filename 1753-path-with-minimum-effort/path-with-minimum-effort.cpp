class Solution {
public:
    bool isSafe(int r, int c, int n,int m) {
        return r >= 0 && r < m &&
               c >= 0 && c < n;
            //    grid[r][c] == 0;
    
    }

    typedef pair<int,pair<int,int>> p;


    int minimumEffortPath(vector<vector<int>>& heights) {
        int m = heights.size();

        if (m == 0)
            return -1;

        int n = heights[0].size();

        if (n == 0)
            return -1;

        vector<vector<int>> directions = {
             {0,-1},
            {0,1},
            {-1,0},
            {1,0}
        };
        vector<vector<int>> res(m,vector<int>(n,INT_MAX));
        priority_queue<p,vector<p>,greater<p>> pq;
        pq.push({0,{0,0}});
        res[0][0]=0;

        while(!pq.empty()){
            auto f=pq.top();
            int d = f.first;
            auto [r,c] = f.second;
            pq.pop();

            for(auto dir: directions){
                // int dis = heights[nr][nc];
                // abs(heights[r][c]-heights[nr][nc];)
                int nr = r+dir[0];
                int nc = c+dir[1];
                if (!isSafe(nr, nc, n, m))
                    continue;   
                int diff=abs(heights[r][c]-heights[nr][nc]);
                int cost=max(diff ,d);
                if(isSafe(nr,nc,n,m) && res[nr][nc] > cost){
                    res[nr][nc]=cost;
                    pq.push({cost,{nr,nc}});
                } 
            }
        }

        return (res[m-1][n-1]==INT_MAX) ? -1 : res[m-1][n-1];


    }
};