class Solution {
public:
    void merge(vector<int>& nums,int left,int mid,int right){
        int n1=mid;
        int n2=right-(mid+1);
        int i=left;
        int j=mid+1;
        vector<int> temp;
        while (i <= mid && j <= right){
            if(nums[i]<=nums[j]){
                temp.push_back(nums[i]);
                i++;
            }else{
                temp.push_back(nums[j]);
                j++;
            }
        }
        while (i <= mid ){
            temp.push_back(nums[i]);
            i++;
        }
         while (j <= right){
            temp.push_back(nums[j]);
            j++;
        }

        for(int k=left;k<=right;++k){
            nums[k]=temp[k-left];
        }

    }
    int countPairs(vector<int>& nums,int low,int mid,int high){
        int c=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && nums[i]>(long long)2*nums[right]){
                right++;
            }
                c+=(right-(mid+1));
            
        }
        return c;

    }
    int mergeSort(vector<int>& nums,int left,int right){
        int c=0;
        if(left>=right) return c;
        int mid=left+(right-left)/2;
        c+=mergeSort(nums,mid+1,right);
        c+=mergeSort(nums,left,mid);
        c+=countPairs(nums,left,mid,right);
        merge(nums,left,mid,right);
        return c;
    }
    int reversePairs(vector<int>& nums) {
        int n=nums.size();
        
        int ans=mergeSort(nums,0,n-1);
        return ans;
    }
};