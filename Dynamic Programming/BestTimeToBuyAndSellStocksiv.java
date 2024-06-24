class Solution {
    public int maxProfit(int k, int[] prices) {
        if(k <=0 || prices.length<=1){
            return 0;
        }
        int n = prices.length;
        int profit = 0;
        if(k >= n/2){
            for(int i=0;i<n-1;i++){
                if(prices[i] < prices[i+1]){
                    profit += prices[i+1] - prices[i];
                }
            }
            return profit;
        }

        int buy[] = new int[k];
        int sell[] = new int[k];
        Arrays.fill(buy , Integer.MIN_VALUE);;

        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                buy[j] = Math.max(buy[j] , j==0?-prices[i]:sell[j-1] - prices[i]);
                sell[j] = Math.max(sell[j] , buy[j] + prices[i]);
            }
        }
        return sell[k-1];
    }
}
