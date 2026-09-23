class Solution {
public:
    const int M=1e9 + 7;
    int numberOfGoodPartitions(vector<int>& nums) {
        unordered_map<int,int> last;
        int n=nums.size();
        for(int i=0;i<n;++i){
            last[nums[i]]=i;

        }
        int result=1;
        int i=0;
        int j=last[nums[0]];
        while(i<n){
            if(i>j){
                result=(result*2)%M;
                
            }
            j=max(j,last[nums[i]]);
            i++;

        }
        return result;
        
    }
};