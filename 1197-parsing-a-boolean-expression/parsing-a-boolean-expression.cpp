class Solution {
public:
    char eval(vector<char> v,char oper){
        if(oper=='!'){
            return v[0]=='t'?'f':'t';
        }
        else if(oper=='&'){
            for(char c: v){
                if(c=='f'){
                    return 'f';
                }
            }
            return 't';
        }
        else if(oper=='|'){
            for(char c: v){
                if(c=='t'){
                    return 't';
                } 
            }
            return 'f'; 
        }
        return 'f';//default
    }
    bool parseBoolExpr(string exp) {
        stack<char> st;
        int n=exp.length();
        for(char c: exp){
            
            if(c==',') continue;
            else if(c==')'){
                vector<char> v; //t,f
                while(st.top()!='('){
                    v.push_back(st.top()); st.pop();
                }
                st.pop();//pop '('
                char oper=st.top(); st.pop();
                st.push(eval(v,oper));

            }else{
                st.push(c);
            }
        }
        return st.top()=='t'?true:false;
        
    }
};