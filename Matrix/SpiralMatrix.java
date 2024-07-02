class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        if(matrix.length == 0){
            return l;
        }
        int r = matrix.length;
        int c = matrix[0].length;
        int row_start = 0;
        int col_start = 0;
        int row_end =  r-1;
        int col_end = c-1;
        while(row_start <= row_end && col_start <= col_end){
            for(int i = col_start;i<=col_end;i++){
                l.add(matrix[row_start][i]);
            }
            row_start++;
            for(int i=row_start;i<=row_end;i++){
                l.add(matrix[i][col_end]);
            }
            col_end--;
            if(row_start <= row_end){
                for(int i=col_end;i>=col_start;i--){
                    l.add(matrix[row_end][i]);
                }
                row_end--;
            }
            if(col_start <= col_end){
                for(int j=row_end ; j>=row_start;j--){
                    l.add(matrix[j][col_start]);
                }
                col_start++;
            }
        }
        return l;
    }
}
