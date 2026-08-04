class Solution {
    void solve(int[] nums1, int m, int[] nums2, int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        if(m==0) nums1[0]=nums2[0];
        while(i>=0 && j>=0 && k>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        //if 2 has some elements left
        while(j>=0){
            nums1[k]=nums2[j];
                j--;
                k--;
        }
        // No need to copy remaining elements of nums1.
        // They are already in the correct position.
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        solve(nums1,m,nums2,n);
    }
}