import java.util.Scanner;

public class ArraysCreation {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n=3,m=3;
        try (Scanner sc = new Scanner(System.in)) {
            for(int i =0; i<=n-1; i++){
                for(int j=0; j<=m-1; j++){
                    System.out.print("Enter the element for ["+ i + "," +j+ "] : ");
                    matrix[i][j] = sc.nextInt();

                }
            }
        }
        //Printing the array..
        System.out.println("\nThe 2-D array is : ");
        for(int i=0; i<=n-1;i++){
            for(int j=0; j<=m-1;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}


