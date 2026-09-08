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

    bool equationsPossible(vector<string>& equations) {
        vector<int> parent(26,0);
        for(int i=0;i<26;++i){
            parent[i]=i;
        }
        vector<int> rank(26,0);

        for(string &s: equations){
            if(s[1] == '='){
                union1(s[0]-'a',s[3]-'a',parent,rank);
            }
        }
        for(string &s: equations){
            if(s[1]=='!'){
                int px=find(s[0]-'a',parent);
                int py=find(s[3]-'a',parent);

                if(px==py) return false;
            }
        }
        return true;
    }
};