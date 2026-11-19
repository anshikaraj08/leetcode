class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n1=word1.length();
        int n2=word2.length();
        int n=Math.max(n1,n2);
        int i=0;
        int j=0;
        while(i<n1 || j<n2){
            if(i<n1 )
            sb.append(word1.charAt(i));
            if ( j<n2)
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        return sb.toString();
    }
}