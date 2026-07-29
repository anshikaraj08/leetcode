class Solution {
    int [][] dp;
    // public int solve(int l1,int l2,String s1, String s2){
    //     //out of bound
    //     if(l1<0 || l2<0) return 0;
    //     if(dp[l1][l2]!=-1) return dp[l1][l2];
    //     //match
    //     if(s1.charAt(l1)==s2.charAt(l2))
    //         return dp[l1][l2]= 1+solve(l1-1,l2-1,s1,s2);
     
    //     //not match
    //     return dp[l1][l2]=0+Math.max(solve(l1-1,l2,s1,s2),solve(l1,l2-1,s1,s2));
        
        
    // }
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int l1=text1.length();
    //     int l2=text2.length();
    //     dp=new int[l1][l2];

    //     for(int [] row: dp){
    //         Arrays.fill(row,-1);
    //     }
        
    //     int ans=solve(l1-1,l2-1,text1,text2);
    //     return ans;
    // }

    public int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length();
        int l2=text2.length();
        dp=new int[l1+1][l2+1];

        for(int i=0;i<l1+1;++i){
            for(int j=0;j<l2+1;++j){
                if(i==0 || j==0) dp[i][j]=0;  
            }
        }
        for(int i=1;i<l1+1;++i){ 
            for(int j=1;j<l2+1;++j){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                } else {
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                } 
            }
        }
        return dp[l1][l2];


        
        
        
    }
}