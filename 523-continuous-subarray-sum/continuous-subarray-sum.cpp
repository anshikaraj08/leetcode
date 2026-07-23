class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        
        int n=nums.size();
        unordered_map<int,int> mp;
        mp.insert({0,-1});
        int sum=0;
        for(int i=0;i<n;++i){
            sum+=nums[i];
            int rem=sum%k;
            if(mp.count(rem)!=0){
                int sz=i-mp[rem];
                if(sz>=2) return true;
    
            }else {
                mp[rem] = i;
            }

        }
        return false;
    }
};