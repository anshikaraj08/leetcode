class Solution {
public:

    int find(int x,vector<int> &parent){
        if(x==parent[x]) return x;
        
        return parent[x]=find(parent[x],parent);
    }
    
    void union1( int x, int y, vector<int> &parent, vector<int> &rank){
        int px=find(x,parent);
        int py=find(y,parent);
        
        if(rank[px]==rank[py]){
            // let py be parent & inc its rank
            parent[px]=py;
            rank[py]++;
            
        }else if(rank[px]<rank[py]){
            parent[px]=py;
          
        }else{
            parent[py]=px;
        }
        
    }
    int makeConnected(int n, vector<vector<int>>& connections) {
        vector<int> parent(n,0);
        for(int i=0;i<n;++i){
            parent[i]=i;
        }
        vector<int> rank(n,0);
        // for(auto &e: connections){
        //     int u=e[0];
        //     int v=e
        // }
        int en=connections.size();
        if(en<(n-1)) return -1;
        int comp=n;
        for(auto &e: connections){
            int u=e[0];
            int v=e[1];

            int pu=find(u,parent);
            int pv=find(v,parent);
             // everything is a separate component
            if(pu==pv) continue;

            else if(pu!=pv){
                union1(u,v,parent,rank);
                comp--;
            }


        }
        return comp-1; //edges=comp-1


    }
};