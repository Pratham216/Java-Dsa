public class ClearBitsInRange {
    public static void main(String[] args) {
        int n =10;
        int i=2;
        int j=5;
        
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;

        int Bitmask = a|b;
        int result = n & Bitmask;

        System.out.println(result);
        /* Logic ...
        10 = 00001010
               ^  ^  
               |  |       
            (j=5)(i=2) 

         a = 11111111 << 6
         a = 11000000 
        

         b = 00000001 << 2 -1
           = 00000100 
           - 00000001
            ----------
          b= 00000111
            
        Bitmask = 11000000
                | 00000111
                -----------
        Bitmask = 11000111

        result = 00001010
               & 11000111
               -----------
                 00000010 =2
        ___________
       |result  = 2| 
  

        */
    }

}
