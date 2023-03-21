public class prb_05 {

    // Question : N-Queen count ways....

    // print fun of 2D array
    public static void printBoard(char board[][]) {
        System.out.println("--------ChessBoard---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up...
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left..
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag right..

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // n-Queen function...
    public static void nQueens(char board[][], int row) {

        // base case
        if (row == board.length) {
            //printBoard(board);
            count++;
            return;
        }

        for (int j = 0; j < board.length; j++) { // this is for the coloum only
            if (isSafe(board, row, j)) {

                board[row][j] = 'Q'; // place queen in the row...
                nQueens(board, row + 1); // function call or recursion.
                board[row][j] = 'x';// backtracking

            }
        }
    }


    static int  count =0;  // initilized count with zero...
    public static void main(String[] args) {

        int n = 4; // this is chess board size..
        char board[][] = new char[n][n];

        // initilize...
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
        System.out.println("Total ways of solve :"+ count);

    }
}
