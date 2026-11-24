class Solution {
    public String addStrings(String nums1, String nums2) {
        int n=nums1.length();
        int m=nums2.length();
        int carry=0;
        StringBuilder sb = new StringBuilder();

        while(n>0 || m>0 || carry>0){

            int c1=0;
            if(n>0) 
            c1=nums1.charAt(n-1)-'0';

            int c2=0;
            if(m>0)
            c2=nums2.charAt(m-1)-'0';

            int sum=c1+c2+carry;
            int ld=sum%10;
            String s=Integer.toString(ld);
            carry=sum/10;
            sb.append(s);
            n--;
            m--;

        }
        return sb.reverse().toString();

    }
}