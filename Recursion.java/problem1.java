import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        sc.close();

        Dec_Num(n);

        
    }
   public static int Dec_Num(int n){
       if(n==1){ 
        System.out.print(1);
        return 1;
       }
       System.out.print(n);
       return Dec_Num(n-1);
      
    }
}
