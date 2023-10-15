public class RhombusPattern {
    public static void solid_rhombus_pattern(int n){
        for(int i=1; i<=n; i++){

            // For spaces in the pattern...
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //For stars in the pattern..
            for(int j=1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid_rhombus_pattern(5);
    }
}
