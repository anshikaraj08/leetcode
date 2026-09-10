class Solution {
public:
    int networkDelayTime(vector<vector<int>>& times, int V, int k) {
        vector<vector<pair<int,int>>> adj(V+1);
                for(auto & e: times){
                    int u=e[0];
                    int v=e[1];
                    int wt=e[2];

                    adj[u].push_back({v,wt});
                    // adj[v].push_back({u,wt});
                }
        
        priority_queue<pair<int,int>, vector<pair<int,int>>, greater<pair<int,int>>> pq;
        int src=k;
        vector<int> res(V+1,INT_MAX);
        res[src]=0;
        pq.push({0,src});//wt,node
        while(!pq.empty()){
            int d=pq.top().first;
            int u=pq.top().second;
            pq.pop();
            for(auto &v: adj[u]){
                int dis=v.second;
                int node=v.first;
                if(d+dis<res[node]){
                    res[node]=d+dis;
                    pq.push({d+dis,node});
                }
            }
        }

         int ans=*max_element(res.begin()+1,res.end());
        // cause in res at 0th index INT_MAX is there
        if(ans==INT_MAX) return -1
        ;
        return ans;
    }
};