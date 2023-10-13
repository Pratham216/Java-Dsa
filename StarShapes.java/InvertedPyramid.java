import java.util.Scanner;

public class InvertedPyramid {

    public static void inverted_rotated_half_pyramid(int n){
        // for rows..
        for(int i=1;  i<=n;  i++){

            //for spaces ...
            for(int j=1;  j<=n-i;  j++){
                System.out.print(" ");
            }

            //for stars...
            for(int k=1;  k<=i;  k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows for the inverted rotated half pyarmid : ");
            int rows = sc.nextInt();
            inverted_rotated_half_pyramid(rows);
        }
    
    }
}
/*                logic for the above code...

         |  no.of rows | no.of spaces   | no.of stars  (stars are equal to the number of rows ) 
         |    (i)      |      (j)       |      (k)                                                                            
      *  |   r=1       |   4= n-i(5-1)  |    k=i =1                                                  
     **  |   r=2       |   3=n-i(5-2)   |    k=i =2                                     
    ***  |   r=3       |   2=n-i(5-3)   |    k=i =3                                                              
   ****  |   r=4       |   1=n-i(5-4)   |    k=i =4                                                                             
  *****  |   r=5       |   0=n-i(5-5)   |    k=i =5                                                                      


*/