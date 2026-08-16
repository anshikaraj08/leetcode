class Solution {
    int [][] dp;
    boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    int solve(String s,int i,int j){
        if(i>=j) return 0;
        if(isPalindrome(s,i,j)) return 0;
        int mn=Integer.MAX_VALUE;
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        for(int k=i;k<=j-1;++k){
            // int tempans=1+solve(s,i,k)+solve(s,k+1,j);
            // mn=Math.min(mn,tempans);

                if (isPalindrome(s, i, k)) {
                int tempans = 1 + solve(s, k + 1, j);
                mn = Math.min(mn, tempans);
            }
        }
        return dp[i][j]= mn;

    }
    public int minCut(String s) {
        int n=s.length();

        dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(s,0,n-1);
    }
}