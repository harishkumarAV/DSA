class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n =grid.length;
        int max[][] = new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int maxval = Integer.MIN_VALUE;
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        maxval = Math.max(maxval , grid[k][l]);
                    }
                }
                max[i][j] = maxval;
            }
        }
        return max;
    }
}
