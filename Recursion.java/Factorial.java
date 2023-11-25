import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return  n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to calculate the factorial of  :");
        int n = sc.nextInt();
        sc.close();

        System.out.println(factorial(n));
    }
}
