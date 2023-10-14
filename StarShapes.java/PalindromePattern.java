public class PalindromePattern {
    public static void palindromic_pattern_with_number(int n){

        //For outer loop 
        for(int i =1; i<=n; i++){

            //For spaces in the pattern...
            for(int j =1; j<=n-i; j++){
                System.err.print(" ");
            }
            // For numbers to be printed in descending order...
            for(int j =i; j>=1; j--){
                System.out.print(j);
            }
            //For number to be printed in ascending order..
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palindromic_pattern_with_number(5);
    }
}
