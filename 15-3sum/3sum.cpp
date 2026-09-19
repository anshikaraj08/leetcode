class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        sort(nums.begin(), nums.end());
        vector<vector<int>> ans;
        for(int i=0;i<=n-3;++i){
            if(i > 0 && nums[i]==nums[i-1]) continue;
            int n1=nums[i];
            int target=-n1;
            int l=i+1;
            int r=n-1;
            while(l<r){
                
                int sum=nums[l]+nums[r];
                if(sum==target){
                    while(l<r && nums[l]==nums[l+1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r-1]){
                        r--;
                    }
                     ans.push_back( {n1,nums[l],nums[r]});
                     l++;
                     r--;
                }
                else if(sum>target) r--;
                else l++;
            }

            
        }
        return ans;
    }
};