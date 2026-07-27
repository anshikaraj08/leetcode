class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> mp= new HashMap<>();
        int n=nums2.length;


        for(int i=n-1;i>=0;i--){

                while(!st.empty() && st.peek()<nums2[i]){
                    st.pop();
                }


                if(st.empty()){ 
                    mp.put(nums2[i],-1);
                }else{//
                    mp.put(nums2[i],st.peek());
                 
                }
             st.push(nums2[i]);
        } 
        

        // for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;++i){
           ans[i]= mp.get(nums1[i]);
        }
        return ans;


    }
}