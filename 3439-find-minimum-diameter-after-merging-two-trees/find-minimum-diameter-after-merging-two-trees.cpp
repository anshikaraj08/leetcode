class Solution {
public:
    unordered_map<int,vector<int>> buildAdj(vector<vector<int>>& edges){
//         For a tree:

// number of nodes = number of edges + 1

// So if:
        int V=edges.size()+1;
         unordered_map<int,vector<int>> adj;
        for(int i = 0; i < V; i++){
            adj[i] = {};
        }
       
        for(auto e: edges){
            int u=e[0];
            int v=e[1];

            adj[u].push_back(v);
            adj[v].push_back(u);
        }
        return adj;
    }

    pair<int,int> bfs(unordered_map<int,vector<int>> &adj, int u){
        queue<int> q;
        q.push(u);
        int V=adj.size();
        vector<int> vis(V,0);
        vis[u]=1;
        int dist=0;
        int farthest=u;
        while(!q.empty()){
            int n=q.size();
            while(n--){
                int f=q.front();
                q.pop();
                farthest=f;
                for(auto v: adj[f]){
                    if(!vis[v]){
                        vis[v]=1;
                        q.push(v);
                        
                    }
                }
                

            }
            if(!q.empty()) dist++;
        }
        return {farthest, dist};

    }
    int findDia(unordered_map<int,vector<int>> &adj){
        //find the farthest node from u=0;//basically one end
        auto [farth1,dist]=bfs(adj,0);
        //find the farthest node from farth1 which will be 2nd end of dia
        auto [farth2,dia]=bfs(adj,farth1);
        return dia;
    }
    int minimumDiameterAfterMerge(vector<vector<int>>& edges1, vector<vector<int>>& edges2) {
        int v1=edges1.size();
        int v2=edges2.size();

        unordered_map<int,vector<int>> adj1=buildAdj(edges1);
        unordered_map<int,vector<int>> adj2=buildAdj(edges2);

        int d1=findDia(adj1);
        int d2=findDia(adj2);

        int comb=((d1+1)/2)+((d2+1)/2)+1;

        return max(d1,max(d2,comb));

    }
};