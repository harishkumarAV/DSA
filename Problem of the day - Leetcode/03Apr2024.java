class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && find(board, visited, 0, word, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean find(char[][] board, boolean[][] visited, int index, String word, int row, int col) {
        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || visited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }

        visited[row][col] = true;

        if (find(board, visited, index + 1, word, row + 1, col)
                || find(board, visited, index + 1, word, row - 1, col)
                || find(board, visited, index + 1, word, row, col + 1)
                || find(board, visited, index + 1, word, row, col - 1)) {
            return true;
        }

        visited[row][col] = false;
        return false;
    }
}
