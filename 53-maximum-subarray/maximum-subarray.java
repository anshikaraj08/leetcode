class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int mx=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;++i){
            ans=Math.max(nums[i],ans+nums[i]);
            mx=Math.max(mx,ans);
        }
        return mx;
    }
}