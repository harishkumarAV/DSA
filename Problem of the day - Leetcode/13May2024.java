class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                toggleRow(grid, i);
            }
        }

        for (int j = 1; j < n; j++) {
            int onesCount = 0;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount < m - onesCount) {
                toggleColumn(grid, j);
            }
        }

        int score = 0;
        for (int i = 0; i < m; i++) {
            score += binaryToDecimal(grid[i]);
        }
        return score;
    }

    private void toggleRow(int[][] grid, int row) {
        for (int j = 0; j < grid[0].length; j++) {
            grid[row][j] ^= 1; 
        }
    }

    private void toggleColumn(int[][] grid, int col) {
        for (int i = 0; i < grid.length; i++) {
            grid[i][col] ^= 1; 
        }
    }

    private int binaryToDecimal(int[] binaryArray) {
        int decimal = 0;
        for (int i = binaryArray.length - 1; i >= 0; i--) {
            decimal += binaryArray[i] * Math.pow(2, binaryArray.length - 1 - i);
        }
        return decimal;
    }
}
