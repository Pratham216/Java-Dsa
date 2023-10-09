
public class Butterflypattern {
    public static void butterfly_star_pattern(int n){

        //For 1st half of the pattern ...

        for(int i=1; i<=n;i++){
            
            //For stars ..(= i)
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //For blank space ...( =  2*(n-i))
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //For stars ..( =  i)
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();   

        }
        
        // For 2nd half of the pattern...
        for(int i =n; i>=1; i--){

            //For stars ..(= i)
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //For blank space ...( =  2*(n-i))
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //For stars ..( =  i)
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();   

        }
    }
    public static void main(String[] args) {
        butterfly_star_pattern(8);   
    }
}
