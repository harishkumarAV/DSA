class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int n = prices.length; 
        for(int i=1;i<n;i++){
            profit = Math.max(prices[i] - min , profit);
            min = Math.min(min , prices[i]);
        }
        return profit;
    }
}
