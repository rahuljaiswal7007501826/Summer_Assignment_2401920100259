class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i = 0; i < n; i++){
            
            // maintaing the minimum price
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }

            // calculating the profit for each day
            int profit = prices[i] - minPrice;

            // maintaing the maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
