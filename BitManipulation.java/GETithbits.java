public class GETithbits {
    public static void main(String[] args) {
        int n =10;
        int i=3;
        int Bitmask = 1<<i;

        if((n & Bitmask) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}
