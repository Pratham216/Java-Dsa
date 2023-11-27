import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n){
       if(n==0|| n==1){
        return n;
       }
        
        int prev = fibonacci(n-1);
        int prev2 = fibonacci(n-2);
        int result = prev+prev2;

        return result;
        
    }

    

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to calculate the Fibonacci number of  :");
        int n = sc.nextInt();
        sc.close();

        System.out.println("The fibonacci number for "+n+" number is : "+ fibonacci(n));
    }
}
