class Solution {
    int [][] dp;
    public int solve(int i,int j,String s,String rev){
        if(i==0 || j==0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(s.charAt(i-1)==rev.charAt(j-1)){
            return dp[i][j]=1+solve(i-1,j-1,s,rev);

        }else{
            return dp[i][j]=Math.max(solve(i-1,j,s,rev),solve(i,j-1,s,rev));
        }
    }
    public int minInsertions(String s) {
        String rev=new StringBuilder(s).reverse().toString();
        int n=s.length();
        dp=new int[n+1][n+1];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        int LPS=solve(n,n,s,rev);
        return n-LPS;
    }
}