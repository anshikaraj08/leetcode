class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n=nums.size();
        int idx=-1;
        int p=0;

        if (nums.get(n - 1) > nums.get(0)) {
            p++;
        }



        for(int i=0;i<n-1;++i){
            if(nums.get(i)>nums.get(i+1)){
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