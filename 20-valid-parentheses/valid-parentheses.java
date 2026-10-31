class Solution {
    public boolean isValid(String s) {

        Stack<Character> st=new Stack<>();
        if(s.length()==1) return false;
        for(char c: s.toCharArray()){
            if(st.isEmpty() && (c == ')' || c == '}' || c == ']')){
                return false;
            }
            if(c=='('){
                st.push(c);
            }else if(c=='{'){
                st.push(c);
            }else if(c=='['){
                st.push(c);
            }else if(!st.isEmpty() && c=='}' ){
                if(st.peek()=='{') st.pop();
                else return false;
            }else if(!st.isEmpty() && c==']' ){
                if(st.peek()=='[') st.pop();
                else return false;
            }else if(!st.isEmpty() && c==')' ){
                if(st.peek()=='(') st.pop();
                else return false;
            }
            
        }
        return st.isEmpty();
    }
}