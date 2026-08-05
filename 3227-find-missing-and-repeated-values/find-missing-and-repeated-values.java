class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int [] ans=new int[2];
        Map<Integer,Integer> mp=new HashMap<>();

        for(int [] row: grid){
            for(int num: row){
                mp.put(num,mp.getOrDefault(num,0)+1);
            }

        }

        for(var m: mp.entrySet()){
            if(m.getValue()>1){
                ans[0]=m.getKey();
            }
        }
        for(int i=0;i<=n*n;++i){
            if(!mp.containsKey(i)){
                ans[1]=i;
            }
        }
        return ans;


    }
}