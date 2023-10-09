import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Decimal number to convert into equivalent binary number : ");
            int DecNum = sc.nextInt();
            DecToBin(DecNum);
        }
    }
    static void DecToBin(int DecNum){
        int Number = DecNum;
        int power =0;
        int Binary =0;

        while(DecNum>0){
            int remainder = DecNum%2;

            Binary= Binary + remainder * (int)Math.pow(10, power);
            power++;
            DecNum= DecNum/2;
        }
        System.out.println("Binary equivalent of "+Number+" = "+Binary);
    }
}
