import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of line u want :  ");
            int n = sc.nextInt();
            for(int i = 1;  i<=n;  i++){
                for(int j =1;  j<=i;  j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }    
}
