class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minDay=prices[0];
        // int maxProfit=Integer.MIN_VALUE;
        int maxProfit=0;
        for(int i=1;i<n;++i){
            int profit=prices[i]-minDay;
            maxProfit=Math.max(maxProfit,profit);
            if(prices[i]<minDay){
                minDay=prices[i];
            }
            
        }
        return maxProfit;
    }
}