class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int j = prices[0];
        for (int i = 0; i < prices.length; i++) {
            profit = Math.max(profit,prices[i]-j);
            j = Math.min(prices[i],j);
        }
        return profit;
    }
}