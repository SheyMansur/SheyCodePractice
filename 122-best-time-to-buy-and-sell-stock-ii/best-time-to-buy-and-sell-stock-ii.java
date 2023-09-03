class Solution {
    public int maxProfit(int[] prices) {
        int profits = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] > min) {
                profits += prices[i] - min;
                min = prices[i];
            }
        }
        return profits;
    }
}