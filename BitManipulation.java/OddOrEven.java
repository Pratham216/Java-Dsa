import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a binary number to check if its odd or even : ");
       int n = sc.nextInt();
       sc.close();

       Check_Odd_Or_Even(n);
    }
    public static void Check_Odd_Or_Even(int n){
        int Bitmask =1;
        
            if((n & Bitmask)==0){
                //even number
                System.out.println("THe given binary number is even.");
            }else{
                //odd number
                System.out.println("THe given binary number is odd.");
            }
        } 
    }
    

