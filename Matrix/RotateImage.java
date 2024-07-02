class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int a[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = matrix[j][i];
            }
        }
        for(int i=0;i<r;i++){
            int id = 0;
            for(int j=c-1;j>=0;j--){
                matrix[i][id] = a[i][j];
                id++;
            }
        }

    }
}
