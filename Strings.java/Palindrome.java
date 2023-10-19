import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string..");
        String str = sc.nextLine();
        sc.close();
        if(isPalindrome(str)!= true){
            System.out.println("Not A Palindrome..");
        }else{
            System.out.println("A Palindrome..");
        }
    }
    public static boolean isPalindrome(String str){
        int n  = str.length();
        for(int i=0; i<=(n-1)/2; i++){
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
