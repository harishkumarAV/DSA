class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        
        // Copy the last row of the grid to dp
        System.arraycopy(grid[n - 1], 0, dp[n - 1], 0, n);
        
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        min = Math.min(min, dp[i + 1][k]);
                    }
                }
                dp[i][j] = grid[i][j] + min;
            }
        }
        
        int minPathSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minPathSum = Math.min(minPathSum, dp[0][i]);
        }
        
        return minPathSum;
    }
}
