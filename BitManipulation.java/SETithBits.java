public class SETithBits {
    public static void main(String[] args) {
        int n =10;
        int i=2;
        int Bitmask = 1<<i;

        System.out.println(n|Bitmask);
        /*1010= 10 in binary
       1<<2= 0001<<2 =0100
       1010
      |0100
      ------
       1110... ans
       
       therefore on 2nd index we changed 0 to 1 and in binary --> 1010 to 1110 .. 
       1110 = 2^1+2^2+2^3 =2+4+8 =14 in decimal.
         */
    }
}
