public class KnightsTour {
    // static int pathRow[] = {2,2,1,1,-2,-2,-1,-1};
    // static int pathCol[] = {1,-1,2,-2,1,-1,2,-2};

    static int pathRow[] = {2,1,-1,-2,-2,-1,1,2};
    static int pathCol[] = {1,2,2,1,-1,-2,-2,-1};

    public static boolean IsValidMove(int board[][], int row, int col){
        if (row>=0 && row<8 && col>=0 && col<8 && board[row][col]==0) {
            return true;
        }
        return false;
    }
    public static boolean knightsTour(int board[][], int row , int col, int move ){
        if (move==64) {
            return true;
        }

        for (int i = 0; i < pathRow.length; i++) {
            int newRow = row + pathRow[i];
            int newCol = col + pathCol[i];

            if (IsValidMove(board, newRow, newCol)) {
                move++;
                board[newRow][newCol] = move;
                if (knightsTour(board, newRow, newCol, move)) {
                    return true;
                }
                move--; // backtracking
                board[newRow][newCol] = 0;
            }
        }
        return false;
    }

    public static void printBoard(int board[][]){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=8;
        int board[][] = new int[n][n];
        board[0][0] =1;
        if (knightsTour(board, 0, 0, 1)) {
            printBoard(board);
        }else{
            System.out.println("No solution");
        }
    }
}
