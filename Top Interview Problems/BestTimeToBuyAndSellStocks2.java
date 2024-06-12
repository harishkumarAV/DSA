// Approach - 1
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int sum = 0;
        for(int i=1;i<n;i++){
            int temp_sum = prices[i] - prices[i-1];
            if(temp_sum > 0){
                sum+= temp_sum;
            }
        }
        return sum;
    }
}

// Approach -2
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit =0;
        int min  = prices[0];
        for(int i=1;i<n;i++){
            if(prices[i] > min){
                profit += prices[i] - min;
                min = prices[i];
            }else{
                min = prices[i];
            }
        }
        return profit;
    }
}
