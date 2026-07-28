class Solution {
    public void reverse(int[] arr, int left, int right) {
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        int piv=-1;
        while(i>=0){
            //1st decreasing element
            if(nums[i]<nums[i+1]){
                piv=i;
              
                break;
            }
            i--;
        }
        if (piv == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        int j=n-1;
        int ng=0;
        while(j>=0){
            //next greater=> 1st greater than piv element
            if(nums[piv]<nums[j]){
                ng=j;
                break;
            }
            j--;
        }
        //swap
        int temp=nums[piv];
        nums[piv]=nums[ng];
        nums[ng]=temp;

        reverse(nums,i+1,n-1);

    }
}