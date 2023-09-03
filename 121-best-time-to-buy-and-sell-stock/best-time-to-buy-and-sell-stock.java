class Solution {
    public int maxProfit(int[] prices) {
        int smallest = prices[0];
        int sale = 0;
        for (int price : prices) {
            sale = Math.max(sale, price - smallest);
            smallest = Math.min(price, smallest);
        }
        return sale;
    }
}