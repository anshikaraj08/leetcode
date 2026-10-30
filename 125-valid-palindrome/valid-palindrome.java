class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j){
            
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            // should be after
            char ci=s.charAt(i);
            char cj=s.charAt(j);
            if(Character.toLowerCase(ci)==Character.toLowerCase(cj)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}