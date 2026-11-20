class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb=new StringBuilder();
        
        String s2=s.trim();
        int n=s2.length();
        int c=0;
        for(int i=n-1;i>=0;--i){
            char ch=s2.charAt(i);
            if(ch==' '){
                break;   
            } 
            c++;  
        }
        return c++;
    }
}