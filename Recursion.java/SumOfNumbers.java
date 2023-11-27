import java.util.Scanner;

public class SumOfNumbers {

    public static int Sum_of_natural_numbers(int n){
        if(n==1){
            
            return 1;
        }

        int Prev_Num = Sum_of_natural_numbers(n-1) ;

        int func= n+ Prev_Num;

        return func;

    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        sc.close();
        
        System.out.print("The sum of "+n+" Natural numbers is : "+ Sum_of_natural_numbers(n));
    }
}
