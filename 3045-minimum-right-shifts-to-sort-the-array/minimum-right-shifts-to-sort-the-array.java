class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n=nums.size();
        int idx=-1;
        int p=0;

        



        for(int i=0;i<n;++i){
            int next=(i+1)%n;
            if(nums.get(i)>nums.get(next)){
                idx=i;
                p++;
            }
        }
        if(idx==-1) return 0;
        if(p>1) return -1;
        int ans=n-idx-1;
        return ans;
    }
}