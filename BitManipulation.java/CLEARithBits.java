public class CLEARithBits {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        int Bitmask = ~(1<<i);

        System.out.println(n & Bitmask);
        /* LOGIC...
        n =10 and in binary 10 is 1010 
        Bitmask = ~(1<<i) = ~(0001<<1)
                = ~(0010)
        Bitmask =  1101
         
          1010
        & 1101
         ------
          1000 ... ans

          hence we have cleared the bit of 1st place which is 1.
        now the answer will be 1000 which is 8 in decimal.

         */
    }
}
