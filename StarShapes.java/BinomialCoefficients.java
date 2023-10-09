import java.util.Scanner;

public class BinomialCoefficients {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n in nCr :");
            int n = sc.nextInt();
             System.out.println("Enter the value of r in nCr :");
            int r = sc.nextInt();

          System.out.println(BinCoeff(n, r));

        }
    }
    static int Factorial(int n){
        int fact =1 ;

        for(int i =1;  i<=n;  i++){
            fact= fact*i;
        }
        return fact;
    }
    static int BinCoeff(int n, int r){
        int a =  Factorial(n);
        int b =  Factorial(r);
        int c=  Factorial(n-r);
        int d = a/(b*c);
        return d;
    }
}
