import java.util.*;
public class Solution {
    public static int ninjaTraining(int n, int points[][]) {
        int dp[][] = new int[n][4];
        for(int[] row : dp){
            Arrays.fill(row , -1);
        }
        return f(n-1,3,points,dp);
    }
    public static int f(int day,int last,int points[][],int dp[][]){
        if(dp[day][last] != -1){
            return dp[day][last];
        }
        
        if(day == 0){
            int max=0;
            for(int i=0;i<3;i++){
                if(i!=last){
                    max = Math.max(max , points[day][i]);
                }
            }
            return dp[day][last]=max;
        }
        int max = 0;
        for(int i=0;i<3;i++){
            if(i != last){
                int activity = points[day][i] + f(day-1,i,points,dp);
                max = Math.max(activity,max);
            }
        }
        return dp[day][last]=max;
    }

}

// This is a 2D Dp approach. and this is a Memorization concept.. the code is further optimised to Tabulation as well as Space Optimised.

public class Solution {
    public static int ninjaTraining(int n, int points[][]) {
        int dp[][] = new int[n][4];
        dp[0][0] = Math.max(points[0][1] , points[0][2]);
        dp[0][1] = Math.max(points[0][0] , points[0][2]);
        dp[0][2] = Math.max(points[0][0] , points[0][1]);
        dp[0][3] = Math.max(points[0][0] , Math.max(points[0][1] , points[0][2]));
        for(int day = 1 ;day < n;day++){
            for(int last = 0; last < 4; last++){
                dp[day][last] = 0;
                for(int task = 0;task <=2 ;task++){
                    if(task!=last){
                        int activity = points[day][task] + dp[day-1][task];
                        dp[day][last] = Math.max(dp[day][last] , activity);
                    }
                }
            }
        }
        return dp[n-1][3];
    }

} 
// This is the Tabulation approach.
// This problem is in Coding ninja's portal and rated as "Moderate".
