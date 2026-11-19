class Solution {
    public String toLowerCase(String s) {
        
        String r="";

        for(int i=0;i<s.length();++i){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)){
                int a = (int) c;
                a=a+32;
                c=(char) a;
                r+=c;
            }else{
                r+=c;
            }

            
        }
        return r;
    }
}