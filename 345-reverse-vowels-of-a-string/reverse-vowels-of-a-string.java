class Solution {
    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }

        return false;
    }
    
    public static void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }
        public String reverseVowels(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        StringBuilder sb=new StringBuilder(s);

        while(i<j){
            char ci=sb.charAt(i);
            char cj=sb.charAt(j);
            if(isVowel(ci) && isVowel(cj)){
                swap(sb,i,j);  
                i++;
                j--;    
            }else if(!isVowel(cj)){
                j--;
            }else{
                i++;
            }
        }
        return sb.toString();
        
    }
}