public class DiamondPattern {
    public static void diamond_star_pattern(int n){

        // For 1st half of the pattern..

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.err.print("*");
            }
            System.out.println();
        }
        // For 2nd half of the pattern..

        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.err.print("*");
            }
            System.out.println();
        }
    }
  
    public static void main(String[] args) {
        diamond_star_pattern(8);
 
    }
}
