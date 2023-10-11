import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows in ur hollow rectangle pattern : ");
            int rows = sc.nextInt();
            System.out.print("Enter the number of columns in ur hollow rectange pattern : ");
            int columns = sc.nextInt();

            Hollow_rect(rows, columns);
        }
    }
    static void Hollow_rect(int rows, int columns){
        for(int i=1;  i<=rows;  i++){
            for(int j=1;  j<= columns;  j++){
                if(i==1 || i==rows || j==1 || j== columns){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    
}
