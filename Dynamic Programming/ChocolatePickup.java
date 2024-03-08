import java.util.* ;
import java.io.*; 
public class Solution {
	public static int maximumChocolates(int r, int c, int[][] grid) {
		int dp[][][] = new int[r][c][c];
		for(int row1[][] : dp){
			for(int row2[] : row1){
				Arrays.fill(row2,-1);
			}
		}
		return f(0,0,c-1,grid,r,c,dp);
	}
	public static int f(int i,int j1,int j2,int grid[][],int row,int col,int dp[][][]){
		if(j1 < 0 || j1 >=col || j2<0 || j2>=col){
			return (int)Math.pow(-10,9);
		} 
		if(i == row-1){
			if(j1 == j2){
				return grid[i][j1];
			}else{
				return grid[i][j1] + grid[i][j2];
			}
		}
		if(dp[i][j1][j2] != -1){
			return dp[i][j1][j2];
		}
		int max = Integer.MIN_VALUE;
		for(int d1 = -1 ;d1 <=1 ; d1++){
			for(int d2 = -1;d2<=1;d2++){
				int ans;
				if(j1 == j2){
					ans = grid[i][j1] + f(i+1,j1+d1,j2+d2,grid,row,col,dp);
				}else{
					ans = grid[i][j1] + grid[i][j2]+ f(i+1,j1+d1,j2+d2,grid,row,col,dp);

				}
				max = Math.max(ans,max);
			}
		}
		return dp[i][j1][j2] = max;
	}
}
