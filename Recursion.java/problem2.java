import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        sc.close();

        Inc_Num(n);

        
    }
   public static void Inc_Num(int n){
       if(n==1){ 
            System.out.print(1+" ");
           return ;
       }
       Inc_Num(n-1);
       System.out.print(n+" ");
    }
}
