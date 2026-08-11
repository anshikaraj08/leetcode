class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        int [] dp=new int [n];
        int [] hash=new int [n];
        Arrays.fill(dp,1);
        int mx=0;
        int ld=0;
        Arrays.sort(nums);
        for(int i=1;i<n;++i){
            hash[i]=i;
            for(int j=0;j<i;++j){
                if(nums[i]%nums[j]==0 && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    hash[i]=j;

                }
            }
           if (dp[i] > mx) {
                mx = dp[i];
                ld = i;
            }

        }

        // int i=0;
        List<Integer> ans=new ArrayList<>();
        while(hash[ld]!=ld){
            ans.add(nums[ld]);
            ld=hash[ld];

        }
        ans.add(nums[ld]);

        Collections.reverse(ans);
        return ans;
    }
    
}