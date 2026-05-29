class Solution {
    public int maxProfit(int[] prices) {
       int min_price = prices[0];
       int max_profit = 0;
       for(int i = 1; i < prices.length; i++){
            min_price = Math.min(prices[i], min_price);
            max_profit = Math.max(prices[i] - min_price, max_profit);
       }
       return max_profit;
    }
}
