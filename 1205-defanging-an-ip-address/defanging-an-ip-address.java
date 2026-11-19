class Solution {
    public String defangIPaddr(String address) {
        int n=address.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;++i){
            char c=address.charAt(i);
            if(c=='.'){
                sb.append("[.]");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}