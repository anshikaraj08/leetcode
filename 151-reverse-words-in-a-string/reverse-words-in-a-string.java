class Solution {
    
    public String reverseWords(String s) {
        
        StringBuilder sb=new StringBuilder(s.trim());
        sb.reverse();
        
        int n=sb.length();
        // System.out.println(sb.toString());

      
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<n;i++){
            
            StringBuilder word=new StringBuilder();

            while(i<n && !Character.isWhitespace(sb.charAt(i)) ){
                word.append(sb.charAt(i));
                i++;
            }
            word.reverse();
            

            if(word.length()>=1){
                
                ans.append(" ");
                ans.append(word);
            
            }
            
        }
        return ans.substring(1);
    }
}