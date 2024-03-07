class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] dp = new int[n][m];

        // Initialize the bottom row of dp with the values from the matrix
        for (int j = 0; j < m; j++) {
            dp[n - 1][j] = matrix[n - 1][j];
        }

        // Iterate from the second-to-last row to the first row
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                // Calculate the minimum falling path sum for the current position
                int up = dp[i + 1][j];
                int leftDiagonal = (j > 0) ? dp[i + 1][j - 1] : Integer.MAX_VALUE;
                int rightDiagonal = (j < m - 1) ? dp[i + 1][j + 1] : Integer.MAX_VALUE;

                // Update dp with the minimum of the three paths
                dp[i][j] = matrix[i][j] + Math.min(up, Math.min(leftDiagonal, rightDiagonal));
            }
        }

        // Find the minimum falling path sum in the first row
        int minFallingPathSum = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            minFallingPathSum = Math.min(minFallingPathSum, dp[0][j]);
        }

        return minFallingPathSum;
    }
}
