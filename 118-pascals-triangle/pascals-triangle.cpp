class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        int n=numRows;
        // int m=numRows[0].size();
        
        vector<vector<int>> ans;
        for(int i=0;i<n;++i){
            vector<int> col;
            for(int j=0;j<i+1;++j){
                if(j==0 || j==i ) col.push_back(1);
                else 
                col.push_back(ans[i-1][j-1]+ans[i-1][j]);

                
            }
            ans.push_back(col);
        }
        return ans;
    }
};