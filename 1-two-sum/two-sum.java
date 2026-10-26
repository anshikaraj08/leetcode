class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        int []nums=new int[2];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;++i){
            int next=target-arr[i];
            if(mp.containsKey(next)){
                return new int[]{mp.get(next),i};
            }else{
                mp.put(arr[i],i);
            }
        }
        return new int []{-1,-1};
    }
}