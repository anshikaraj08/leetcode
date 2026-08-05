class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int m=nums.length;
        int n=nums[0].length;

        int i=0;
        int j=m*n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int row=mid/n;
            int col=mid%n;
            if(nums[row][col]==target) return true;
            else if(nums[row][col]<target) i=mid+1;
            else j=mid-1;
        }
        return false;
    }
}