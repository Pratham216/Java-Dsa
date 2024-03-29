public class RatInMaze {
    public static boolean isSafe(int maze[][], int i, int j , int n){
        if (i<n && i<n && maze[i][j]==1) {
            return true;
        }
        return false;
        
    }
    public static boolean  reachDestination(int maze[][], int i,int j, int n, int sol[][]){
        // base case
        if (i==n-1 && j==n-1) {
            sol[i][j] =1;
            return true;
        }

        //recursion
        if (isSafe(maze, i, j, n)) {
            sol[i][j] = 1;
            if(reachDestination(maze, i+1, j, n, sol)){      // Move down
                return true;
            }  
            if (reachDestination(maze, i, j + 1, n, sol)) {   // Move right
                return true;
            }    
             
            sol[i][j] =0;      // backtracking
        }
        return false;
    }
    public static void printMaze(int sol[][]){
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };

        int n = maze.length;    // row length
        int sol[][] = new int[n][n];
                         
        if (reachDestination(maze, 0, 0, n, sol)) {
            System.out.println("The Solutions of the maze is ");
            printMaze(sol);
        }else{
            System.out.println("The Solution of the maze doesn't exists");
        }

    }
}
