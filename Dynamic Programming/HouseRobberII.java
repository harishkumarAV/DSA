class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1] , dp[0]);
        for(int i=2;i<n-1;i++){
            int temp = nums[i] + dp[i-2];
            int temp2 = dp[i-1];
            dp[i] = Math.max(temp,temp2);
        }
        int dp2[] = new int[n];
        dp2[1] = nums[1];
        for(int i=2;i<n;i++){
            int temp = nums[i]+dp2[i-2];
            int temp2 = dp2[i-1];
            dp2[i] = Math.max(temp,temp2);
        }

        return Math.max(dp[n-2] , dp2[n-1]);
    }
}
