public class Solution {
    public static int minimizeCost(int n, int k, int []arr){
        // Write your code here.
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<n;i++){
            int mmsteps = Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j >= 0){
                    int jump = dp[i-j] + Math.abs(arr[i] - arr[i - j]);
                    mmsteps = Math.min(mmsteps , jump);
                }
            }
            dp[i] = mmsteps;
        }
        return dp[n-1];
    }
}
