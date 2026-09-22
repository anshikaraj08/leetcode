class Solution {
public:
    // void dfs(vector<vector<int>> ans,stack<int> st,int u,vector<int> vis){
    //     vis[u]=1;
    //     st.push(u);
        
    //     if(!st.empty()){
    //         int t=st.top();
    //         st.pop();
    //         // adj[t].pop_back();
    //         for(int v: adj[t]){
    //             dfs()
    //         }
    //     }

    // }
    vector<vector<int>> validArrangement(vector<vector<int>>& pairs) {
        // adjacency list
        unordered_map<int, vector<int>> adj;

        // indegree and outdegree
        unordered_map<int, int> indegree, outdegree;

        // Build graph
        for (auto &e : pairs) {
            int u = e[0];
            int v = e[1];

            adj[u].push_back(v);

            outdegree[u]++;
            indegree[v]++;
        }

        // Find starting node
        int start = pairs[0][0];

        for (auto &p : pairs) {
            int node = p[0];

            if (outdegree[node] - indegree[node] == 1) {
                start = node;
                break;
            }
        }
        vector<int> ans;
        
        stack<int> st;

        st.push(start);

        while(!st.empty()){
            int node=st.top();//curr node
            if(!adj[node].empty()){
                int next=adj[node].back();
                adj[node].pop_back();
                st.push(next);
            }else{
                //no neighbours of top node
                ans.push_back(node);
                st.pop();
            }
        }
        // reverse

        reverse(ans.begin(), ans.end());
        vector<vector<int>> ans2;

        for(int i=0;i<ans.size()-1;++i){
            ans2.push_back({ans[i],ans[i+1]});
        }
        return ans2;


        

        

    }
};