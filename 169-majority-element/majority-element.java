class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        for(int i=0;i<n;++i){
            if(mp.get(nums[i])>n/2) return nums[i];
        }
        return -1;
    }
}