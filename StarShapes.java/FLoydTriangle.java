import java.util.Scanner;

public class FLoydTriangle {
    public static void floyd_triangle(int n){
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++; 
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows for the inverted rotated half pyarmid : ");
            int rows = sc.nextInt();
            floyd_triangle(rows);
        }
        
    }
}
