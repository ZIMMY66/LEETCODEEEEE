class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            int profit=prices[i]-min;
            maxprofit=Math.max(maxprofit,profit);
            min=Math.min(min,prices[i]);
        }
        return maxprofit;
    }
}