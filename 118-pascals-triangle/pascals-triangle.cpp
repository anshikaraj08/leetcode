class Solution {
public:
    vector<int> generateRow(int rows) {
        int ans=1;
        vector<int> res;
        res.push_back(1);
        for(int col=1;col<rows;++col){
            ans=ans*(rows-col);
            ans=ans/(col);
            res.push_back(ans);
        }
        return res;
    }
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> res;
        for(int row=1;row<=numRows;++row){
            res.push_back(generateRow(row));
        }
        return res;
        
    }
};