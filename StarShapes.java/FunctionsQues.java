import java.util.Scanner;
//////Remove try statement before running the program......
public class FunctionsQues {
    public static void main(String[] args) {

        //1st program...

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of first number : ");
            double x = sc.nextInt();
            System.out.print("Enter the value of Second number : ");
            double y = sc.nextInt();
            System.out.print("Enter the value of Third number : ");
            double z = sc.nextInt();

            System.out.println(Average(x,y,z));
            System.out.println("\n********************************************");

            // 2nd program...
            
            System.out.print("Enter a number to check if its even or odd : ");
            int a = sc.nextInt();
            if(IsEven(a)){
                System.out.println(a+" Is an even number ....");
            }else{
                System.out.println(a+" IS a odd number ....");
            }
            System.out.println("\n********************************************");

            // 3rd program....

            System.out.print("Enter any number to find the sum of its digit : ");
                int num = sc.nextInt();
                SumOfDigits(num);
                System.out.println("\n********************************************");

            //4th program...

             System.out.print("Enter a number to check if its palindrome or not : ");
            int number = sc.nextInt();

            if(IsPalindrome(number)) {
                System.out.println("Number : "+number+" is a palindrome");
                }else{
                System.out.println("Number : "+number+" is not a palindrome");
                }
        }
    }
    static double Average(double x, double y ,double z){
            return (x+y+z)/3;
        }

        
    static Boolean IsEven(int a){
                if(a%2==0){
                    return true;
                }
                return false;
        }
        
        
    static void SumOfDigits(int num){
            int NewNum = num;
            int sum =0;
            while(num!=0){
                
                int remainder = num%10;
                sum = sum +remainder;
                num= num/10;
            }
            System.out.print("The Sum of "+NewNum+" = "+sum);
        }
        static boolean IsPalindrome(int number){
            int palindrome = number;
            int reverse=0;

            while(palindrome!=0){
                int remainder= palindrome%10;
                reverse= reverse *10+ remainder;
                palindrome= palindrome/10;

            } if(number== reverse){
                return true;
            }else{
                return false;
            }
        }
    }

