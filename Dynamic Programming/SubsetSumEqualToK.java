import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        int dp[][] = new int[n][k+1];
        for(int[] val : dp){
            Arrays.fill(val , -1);
        }
        return find(n-1,k,arr,dp);
    }
    public static boolean find(int n,int k,int arr[],int dp[][]){
        if(k == 0){
            return true;
        }
        if(n ==0 ){
            return arr[0] == k;
        }
        if(dp[n][k] != -1){
            return dp[n][k]==0?false:true;
        }

        boolean nottaken = find(n-1, k, arr,dp);
        boolean taken = false;

        if(arr[n] <= k){
            taken = find(n-1, k-arr[n], arr,dp);
        }
        dp[n][k] = taken || nottaken ? 1 : 0;

        return taken||nottaken;

    }
}
