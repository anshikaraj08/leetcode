class Solution {
    int [][] dp;
    public int solve(int i,int j,String s, String t){
        if(j<0) return 1;
        if(i<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){ // made a mistake compare s and s at i and j in future take care of this
            return dp[i][j]= solve(i-1,j,s,t)+solve(i-1,j-1,s,t);
        }else{
            return dp[i][j]= solve(i-1,j,s,t);
        }
    }
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        dp=new int[n][m];
        for(int [] row: dp){
            Arrays.fill(row,-1);
        }
        int ans=solve(n-1,m-1,s,t);
        return ans;
    }
}