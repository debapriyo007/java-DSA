public class prb_06 {

    //Question: N -Queen print 1 -Solution...

     
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


    public static boolean isSafe(char board[][], int row, int col){
        //vertical up...
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diag left..
        for(int i=row-1,  j =col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diag right..

        for(int i =row-1,j =col+1;i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    
    // n-Queen function...
    public static boolean nQueens(char board[][], int row) {

        // base case
        if (row == board.length) {
            //printBoard(board);
            return true;
        }

        for (int j = 0; j < board.length; j++) { // this is for the coloum only
            if (isSafe(board, row, j)) {

                board[row][j] = 'Q'; // place queen in the row...
                if(nQueens(board, row + 1)){
                    return true;
                } // function call or recursion.
                board[row][j] = 'x';// backtracking

            }
        }
        return false;
    }

    public static void main(String[] args) {

        int n = 4; // this is chess board size..
        char board[][] = new char[n][n];

        // initilize...
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("Solution is possible.");
            printBoard(board);
        }else{
            System.out.println("Solution is not  possible.");
        }

    }
    
}
