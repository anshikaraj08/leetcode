class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n=nums.size();
        int cand=0;
        int count=0;
        for(int &num: nums){
            if(count==0){
                cand=num;
            }
            if(cand==num){
                count++;
            }else{
                count--;
            }
        }
        return cand;
    }
};