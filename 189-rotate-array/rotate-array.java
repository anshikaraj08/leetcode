class Solution {
    public void reverse(int[] nums, int st,int n){
        int i=st;
        int j=n-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n);
        reverse(nums,0,k);
        reverse(nums,k,n);
    }
}