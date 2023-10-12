import java.util.Scanner;

public class InvertedNumberPyarmid {
    public static void inverted_half_number_pyramid(int n){
        
        for(int i =1; i<=n; i++){
            // int num=1;
            // for(int j=1; j<=n-i+1; j++){
            //     System.out.print(num);
            //     num++;                                     MY method...
            // }

            // for(int k=1; k<=i; k++){
            //     System.out.print(" ");
            // }




            for(int j=1; j<=n-i+1; j++){                       // normal easy method...
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows for the inverted rotated half pyarmid : ");
            int rows = sc.nextInt();
            inverted_half_number_pyramid(rows);
        }
    }

}
