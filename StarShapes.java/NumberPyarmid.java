public class NumberPyarmid {
    public static void number_pyramid_star_pattern(int n){
        
        for(int i=1; i<=n; i++){

            // for spaces in the pattern..
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
           
            //for printing the numbers
            for(int j=1; j<=i; j++ ){  
                System.out.print(i +" ");  
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        number_pyramid_star_pattern(5);
    }
}
