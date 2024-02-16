import java.util.*;

public class Solution {
    public static int frogJump(int n, int a[]) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int getone = Math.abs(a[i] - a[i - 1]) + dp[i-1];
            int gettwo = Integer.MAX_VALUE;
            if(i > 1){
                 gettwo = Math.abs(a[i] - a[i - 2]) + dp[i - 2];
            }
            dp[i] = Math.min(getone, gettwo);

        }

        return dp[n-1];
    }
}
