class Solution {
    public int maxProfit(int[] nums) {
        int minPrice=nums[0];
        int mx=0;
        for(int j=1;j<nums.length;++j){
            if(nums[j]<minPrice){
                minPrice=nums[j];
            }else{
                mx=Math.max(mx,nums[j]-minPrice);
            }
        }
        
        return mx;
    }
}