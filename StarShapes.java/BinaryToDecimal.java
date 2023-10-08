
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
  
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the binary number : ");
            int BinNum = sc.nextInt();
            BinDec(BinNum);
        }
    }
    static void BinDec(int BinNum){
       int  Number = BinNum;
        int  power=0;
        int deciNum =0;

        while(BinNum>0){
            int lastDigit = BinNum % 10;
            deciNum = deciNum + (lastDigit * (int)Math.pow(2, power));

            power++;
            BinNum = BinNum/10; 
        }
        System.out.println("Decimal equivalent Number  of "+Number +"= "+deciNum);
    }
}
