public class ClearLastiBits {
    public static void main(String[] args) {
        int n =15;
        int i=2;
        
        int Bitmask = (~0)<<i;
        System.out.println(n& Bitmask);
        
        /* 1111
         removing last 2 bits from 1111 i.e 15, hence making it 1100
         so 
         1100 = 2^3+ 2^2 
              = 8+4
              =12.. ans
                 
         */
        
    }
}
