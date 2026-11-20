class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        int n=command.length();
        for(int i=0;i<n;++i){
            char c=command.charAt(i);
            char c2=' ';
            if(i<n-1)
                c2=command.charAt(i+1);
            if(c=='G'){
                sb.append("G");
            }else if(c=='(' && c2!=' ' && c2==')'){ 
                sb.append("o");
            }else if(c=='(' && c2=='a'){
                sb.append("al");
            }
        }
        return sb.toString();
    }
}