class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int i=0;
        int n=nums.length;
        int []ans=new int [n];
        int prod=1;

        ans[0]=1;
        for(int i=1;i<n;++i){
            ans[i]=ans[i-1]*nums[i-1];//all left products using prefix
        }
        for(int i=0;i<n;++i){
            System.out.print(ans[i]+" ");
        }
        
        int right=1;
        for(int i= n-1;i>=0;i--){
            ans[i]=right*ans[i];
            
                right*=nums[i];
        }
        return ans;

    }
}