import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the range till u want to know the prime numbers in this range : ");
            int n= sc.nextInt();
            PrimeInRange(n);
        }
        
    }
    static boolean IsPrime(int n){
        for(int i =2; i<=n-1;  i++){
            if(n%i==0){
                return false;
            }
        }
        return true;  
    }
    static void PrimeInRange(int n){
        for(int i =2; i<=n-1;  i++){
        if(IsPrime(i)){
            System.out.print(i+" ");
        }
        
        }

    }

}
