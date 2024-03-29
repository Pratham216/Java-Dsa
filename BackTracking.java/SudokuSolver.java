public class SudokuSolver {
    public static boolean isSafe(int sudoku[][], int row , int col , int digit){
        // For same column 
        for (int i=0; i<9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        //For same row
        for (int i=0; i<9; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }

        //For same grid

        int sr = (row/3)*3;         //starting row
        int sc = (col/3)*3;         // starting column

        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j < sc+3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        // base case 
        if (row==9) {
            return true;    // it means all the cell of the sudoku are filled and it came to last row plus one
        }
        int Nextrow = row, Nextcol = col+1;  // for going onto the next row and column
        if (Nextcol == 9) {
            Nextrow = row+1;
            Nextcol = 0;
        }

        if (sudoku[row][col]!=0) {
            return sudokuSolver(sudoku, Nextrow, Nextcol);
        }

        for(int digit =1; digit<=9; digit++){
            if (isSafe(sudoku, row , col , digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, Nextrow, Nextcol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]){
        System.out.println("-----------------------");
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
                          {4,9,0,1,5,7,0,0,2},
                          {0,0,3,0,0,4,1,9,0},
                          {1,8,5,0,6,0,0,2,0},
                          {0,0,0,0,2,0,0,6,0},
                          {9,6,0,4,0,5,3,0,0},
                          {0,3,0,0,7,2,0,0,4},
                          {0,4,9,0,3,0,0,5,7},
                          {8,2,7,0,0,9,0,1,3} };

       if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution Exists ");
            printSudoku(sudoku);
       }else{
        System.out.println("Solution doesn't exists ");
       }
    
    }
}
