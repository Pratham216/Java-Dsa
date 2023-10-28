import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        
        int result = n & (n-1);
        if(result ==0){
            System.out.println("The number is the power of 2.");
        }else{
            System.out.println("The number is not the power of 2.");
        }
        
    }

}
    