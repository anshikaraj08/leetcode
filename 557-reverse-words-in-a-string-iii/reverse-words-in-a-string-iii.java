class Solution {
    public static void reverse(StringBuilder sb,int l,int r){
        char temp=sb.charAt(l);
        sb.setCharAt(l,sb.charAt(r));
        sb.setCharAt(r,temp);

    }
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<n;++i){
            int j=i;
            while(j<n && s.charAt(j)!=' '){
                reverse(sb,i,j);
                j++;
            }
        }
        return sb.toString();
    }
}