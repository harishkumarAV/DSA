class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        int dp[] = new int[n+1];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for(int i=1;i<n;i++){
            int pick =  nums[i];
            if(i > 1){
                pick += dp[i-2];
            }
            int nonpick = dp[i-1];
            dp[i] = Math.max(pick,nonpick); 
        }
        return dp[n-1];
    }
}
