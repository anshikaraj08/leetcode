class Solution {
    public static void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }
    }
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        // StringBuilder str=new StringBuilder(s);
        int n=s.length();
        
        for(int i=0;i<n;i+=2*k){
            if(n-i<k)
            reverse(sb,i,n-1);
            else if(n-i<2*k && n-i>=k){
                reverse(sb,i,i+k-1);
            }else{
                reverse(sb,i,i+k-1);
            }

        }
         return sb.toString();
    }
   
}