public class UPDATEithBits {
    public static void main(String[] args) {
        System.out.println(update_ith_bits(10, 2 , 1));

    }
    public static int set_ith_bits(int n, int i){
        int Bitmask1 = 1<<i;
        return (n | Bitmask1);
    }
    public static int clear_ith_bits(int n , int i){
        int Bitmask2 = ~(1<<i);
        return (n & Bitmask2);
    }
    public static int update_ith_bits(int n , int i, int newbit){
         /*   BAsic method.

        if(newbit == 0){
            //Clearing the ith bit.
           return clear_ith_bits(n,i);
        }else{
            //setting the ith bith.
            return set_ith_bits(n,i);
        }  */

       
        // good approach.
        n = clear_ith_bits(n, i);
        int Bitmask3 = newbit<<i;
        return n | Bitmask3;
        

    }
}
