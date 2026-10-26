class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        int []nums=new int[2];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                if(arr[i]+arr[j]==target && i!=j){
                    nums[0]=i;
                    nums[1]=j;
                    
                }
            }
        }
        return nums;
    }
}