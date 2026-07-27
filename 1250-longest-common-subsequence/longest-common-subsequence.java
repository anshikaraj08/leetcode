class Solution {
    int [][] dp;
    public int solve(int l1,int l2,String s1, String s2){
        //out of bound
        if(l1<0 || l2<0) return 0;
        if(dp[l1][l2]!=-1) return dp[l1][l2];
        //match
        if(s1.charAt(l1)==s2.charAt(l2))
            return dp[l1][l2]= 1+solve(l1-1,l2-1,s1,s2);
     
        //not match
        return dp[l1][l2]=0+Math.max(solve(l1-1,l2,s1,s2),solve(l1,l2-1,s1,s2));
        
        
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length();
        int l2=text2.length();
        dp=new int[l1][l2];

        for(int [] row: dp){
            Arrays.fill(row,-1);
        }
        
        int ans=solve(l1-1,l2-1,text1,text2);
        return ans;
    }
}