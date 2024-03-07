public class OptimisedPower {
    public static int powerfunction(int x , int n){
        if(n==0){
            return 1;
        }
        int p = powerfunction(x, n/2)*powerfunction(x, n/2);
        
        if(n%2 != 0){
            return x*p;
        }
        else{
            return p;
        }
    }
    public static void main(String[] args) {
        System.out.println(powerfunction(2, 10));
    }
}
