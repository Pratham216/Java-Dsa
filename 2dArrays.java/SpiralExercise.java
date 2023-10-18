import java.util.Scanner;

public class SpiralExercise {

        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the value for n : ");
                int n= sc.nextInt();
                int arr[][] = new int[n][n];

                get_spiralMatrix(arr);
                System.out.println("The spiral matrix formed is : ");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            
        }
        public static void get_spiralMatrix(int arr[][]){
        int count =1;
         int startRow =0;
         int startCol = 0;
         int endRow = arr.length-1;
         int endCol = arr[0].length-1;
    
         while(startRow <= endRow && startCol <= endCol){
    
            // top row..
            for(int i=startCol; i<= endCol; i++){
                arr[startRow][i] = count++;
            }
    
            // right column...
            for(int j = startRow+1; j<=endRow; j++){
                arr[j][endCol]= count++;
            }
    
            //bottom row...
            for(int i=endCol-1; i>=startCol; i--){
                arr[endRow][i]= count++;
            }
    
            //left column...
            for(int j= endRow-1; j>=startRow+1; j--){
                arr[j][startCol] = count++;
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
         }
         System.out.println();
        }
        
    }
    

