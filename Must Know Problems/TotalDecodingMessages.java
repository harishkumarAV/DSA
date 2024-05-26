
class Solution
{
    public int CountWays(String str)
    {
        // code here
        int n = str.length();
        int mod = 1000000007;
        int dp[] = new int[n+1];
        if(str.charAt(0) == '0'){
            return 0;
        }
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int one_digit = Integer.parseInt(str.substring(i-1,i));
            int two_digit = Integer.parseInt(str.substring(i-2,i));
            
            if(one_digit > 0 && one_digit<10){
                dp[i] = (dp[i] + dp[i-1])%mod;
            }
            if(two_digit >9 && two_digit < 27){
                dp[i] = (dp[i] + dp[i-2])%mod;
                
            }
        }      
        return dp[n];
    }
}
