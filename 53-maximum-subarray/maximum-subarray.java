class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        int mx=ans;
        for(int i=1;i<nums.length;++i){
            ans=Math.max(nums[i],ans+nums[i]);
            mx=Math.max(mx,ans);
        }
        return mx;
    }
}