public class CountSetBits {
    public static void main(String[] args) {
        //counting the number of time 1 appers in the given binary number.
        int n =19;
        int count =0;

        while(n > 0){
            if((n&1)!=0){
                // checking LSB.
                count++;
            }
            n =n>>1;
        }
        System.out.println(count);
    }
}
