class Solution {
public:
const int M=1e9+7;
    int numSubseq(vector<int>& nums, int target) {
        int n=nums.size();
        sort(nums.begin(),nums.end());
        vector<int> pow2(n);
        pow2[0]=1;//2^0=1
        for(int i=1;i<n;++i){
            pow2[i]=(pow2[i-1]*2)%M;

        }


        int l=0;
        int r=n-1;
        int ans=0;
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                ans=ans%M+(pow2[r-l]%M);
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
};