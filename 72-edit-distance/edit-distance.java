class Solution {
    int[][] dp;
    public int solve(int i,int j,String s1, String s2){
        //base case
        if(i<0) return j+1;
        if(j<0) return 1+i;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            //do nothing
            return dp[i][j]=0+solve(i-1,j-1,s1,s2);
        }else{
            
            return dp[i][j] = Math.min(
                1+solve(i,j-1,s1,s2), //insert
                Math.min(
                    1+solve(i-1,j,s1,s2), //delete
                    1+solve(i-1,j-1,s1,s2)//replace
                )
            );
        }

    }
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        dp=new int[m][n];
        for(int [] row: dp){
            Arrays.fill(row,-1);
        }
        int ans=solve(m-1,n-1,word1, word2);
        return ans;
    }
}