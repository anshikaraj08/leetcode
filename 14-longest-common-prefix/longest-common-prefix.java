class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        // for(String s: strs){
        //     System.out.println(s);
        // }
        int n=strs.length;
        String s1= strs[0];
        String s2=strs[n-1];
        String ans="";
        int i=0;
        int j=0;
        int n1=s1.length();
        int n2=s2.length();
        while(i<n1 && j<n2){
            if(s1.charAt(i)==s2.charAt(j)){
                ans+=s1.charAt(i);
                i++;
                j++;
            }else {
                break;
            }  
        }
        return ans;
    }
}