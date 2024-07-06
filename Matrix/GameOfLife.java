class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int sample[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int sum = 0;
                if(i-1 > -1 && j-1>-1){
                    sum += board[i-1][j-1]; 
                }
                if(i-1 > -1){
                    sum += board[i-1][j];
                }
                if(i-1>-1&&j+1<m){
                    sum+=board[i-1][j+1];
                } 
                if(j-1>-1){
                    sum+=board[i][j-1];
                }
                if(j+1 < m ){
                    sum+=board[i][j+1];
                }
                if(i+1<n){
                    sum+=board[i+1][j];
                }
                if(i+1<n && j-1>-1){
                    sum+=board[i+1][j-1];
                }
                if(i+1<n && j+1<m){
                    sum+=board[i+1][j+1];
                }
                if(board[i][j] == 0){
                    if(sum == 3){
                        sample[i][j] = 1;
                    }
                }else{
                    if(sum < 2 || sum > 3){
                        sample[i][j] = 0;
                    }else{
                        sample[i][j] = 1;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j] = sample[i][j];
            }
        }
    }
}
