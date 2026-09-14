class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int n=nums.size();
        int cand1 = 0, cand2 = 0;
        int count1 = 0, count2 = 0;
        vector<int> ans;

        for(int &num: nums){

            //check 1st
            if(num==cand1){
                count1++;
            }else if(num==cand2) count2++;
            else if(count1==0) {cand1=num; count1=1;}
            else if(count2==0) {cand2=num; count2=1;}
            else{
                count1--;
                count2--;
            }

        }

        //verify
        int freq1=0;
        int freq2=0;

        for(int &num: nums){
            if(num==cand1) freq1++;
            else if(num==cand2) freq2++;
        }
        if(freq1>floor(n/3)) ans.push_back(cand1);
        if(freq2> floor(n/3)) ans.push_back(cand2);
        return ans;

    
    }
};