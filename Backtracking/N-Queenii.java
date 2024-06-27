class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        helper(n,0,board);
        return count;
    }
    public void helper(int n,int col,char[][] board){
        if(col == board.length){
            count++;
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe( row,col,board)){
                board[row][col] = 'Q';
                helper(n,col+1,board);
                board[row][col] = '.';

            }
        }
    }
    public boolean isSafe(int row,int col,char[][] boards){
        //vertical
        for(int i=0;i<col;i++){
            if(boards[row][i] == 'Q'){
                return false;
            }
        }
        //horizontal
        for(int j=0;j<row;j++){
            if(boards[j][col] == 'Q'){
                return false;
            }
        }
        //upper left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(boards[i][j] == 'Q'){
                return false;
            }
        }
        //upper right diagonal
        for(int i=row,j=col;i>=0 && j<boards[0].length;i--,j++){
            if(boards[i][j] == 'Q'){
                return false;
            }
        }
        //lower left diagonal
        for(int i=row,j=col;i<boards.length && j>=0;i++,j--){
            if(boards[i][j] == 'Q'){
                return false;
            }
        }
        //lower right diagonal
        for(int i=row,j=col;i<boards.length && j<boards[0].length;i++,j++){
            if(boards[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
