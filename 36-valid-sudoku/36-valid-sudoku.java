class Solution {
        public boolean isValidSudoku(char[][] board) {
     if (board == null || board.length != 9 || board[0].length != 9)
            return false;

        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char value = board[i][j];
                if (value != '.') {
                    if (!seen.add(board[i][j] + "found in row " + i) ||
                            !seen.add(board[i][j] + "found in column " + j) ||
                            !seen.add(board[i][j] + "found in cube " + i/3+ "-"+j/3)) {
                        return false;
                    }
                }

            }
        }
        return true;
        }
}