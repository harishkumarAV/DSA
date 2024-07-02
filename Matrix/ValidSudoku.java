class Solution {
    public boolean isValidSudoku(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                if(board[i][j] != '.'){
                    if(!hs.add(board[i][j] + "row" + i) || !hs.add(board[i][j] + "column" + j) || 
                    !hs.add(board[i][j] + "sub box" + i/3 + " " + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
