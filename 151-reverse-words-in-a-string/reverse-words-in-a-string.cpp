class Solution {
public:
    string reverseWords(string s) {
        stringstream ss(s);
        string result;
        string token;
        while(ss>>token){
            result=token+" "+result;

            
        }
        result = result.substr(0, result.size() - 1);
        return  result;
    }
};