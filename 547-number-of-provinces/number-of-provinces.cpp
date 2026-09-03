class Solution {
public:
    
    void dfs(int u, vector<vector<int>>& adj, vector<int>& vis) {
        vis[u] = 1;
        
        for(int v : adj[u]) {
            if(!vis[v]) {
                dfs(v, adj, vis);
            }
        }
    }

    int findCircleNum(vector<vector<int>>& isConnected) {
        
        int n = isConnected.size();

        // Matrix -> Adjacency List
        vector<vector<int>> adj(n);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(isConnected[i][j] == 1) {
                    adj[i].push_back(j);
                }
            }
        }

        vector<int> vis(n, 0);
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(!vis[i]) {
                count++;
                dfs(i, adj, vis);
            }
        }

        return count;
    }
};