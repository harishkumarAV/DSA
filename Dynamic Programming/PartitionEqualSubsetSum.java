class Solution {
    public boolean canPartition(int[] nums) {
        int n =nums.length;
        int totsum = 0;
        for(int i=0;i<n;i++){
            totsum += nums[i];
        }
        int find =  totsum/2;
        int dp[][] = new int[n][find+1];
        for(int val[] : dp){
            Arrays.fill(val , -1);
        }
        if(totsum%2==1){
            return false;
        }
        return f(n-1,find , dp , nums);
    }
    public static boolean f(int index,int target  , int dp[][],int nums[]){
        if(target == 0){
            return true;
        }
        if(index == 0){
            return nums[0]==target;
        }
        if(dp[index][target] != -1){
            return dp[index][target]==0?false:true;
        }

        boolean taken = f(index -1,target,dp,nums);
        boolean nottaken = false;
        if(nums[index] <= target){
            nottaken = f(index-1,target-nums[index],dp,nums);
        }
        dp[index][target] = taken||nottaken==true?1:0;

        return taken|| nottaken;
    }
}
