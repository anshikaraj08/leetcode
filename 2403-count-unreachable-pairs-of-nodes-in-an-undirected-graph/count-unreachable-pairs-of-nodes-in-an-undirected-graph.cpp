class Solution {
public:
    int find(int x,vector<int> &par){
        if(par[x]==x) return x;
        return par[x]=find(par[x],par);
    }
    void union1(int u,int v, vector<int> &par,vector<int>& rank){
        int pu=find(u,par);
        int pv=find(v,par);
        if(pv==pu) return;
        if(pv!=pu){
            if(rank[pv]>rank[pu]){
                par[pu]=pv;
            }else if(rank[pv]<rank[pu]){
                par[pv]=pu;
            }else {//(rank[pv] == rank[pu])
                par[pv]=pu;
                rank[pu]++;
            }
        }
    }
    long long countPairs(int n, vector<vector<int>>& edges) {
        vector<vector<int>> adj(n);
        vector<int> rank(n,0);
        vector<int> parent(n,0);
        for(int i=0;i<n;++i){
            parent[i]=i;
        }
        for(auto &e: edges){
            int u=e[0];
            int v=e[1];
            union1(u,v,parent,rank);

        }

        unordered_map<int,int> mp;

        for(int i=0;i<n;++i){
            int p=find(i,parent); //parent -> representative
            mp[p]++;
        }
        long long  res=0;
        int remain=n;
        // iterate in this map
        for(auto &m: mp){
            int p = m.first;
            int size=m.second;

            // int remain=n;
            res+=1LL*size*(remain-size);
            remain-=size;
        }
        return res;
        


        

    }
};