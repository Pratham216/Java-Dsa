public class FastExponential {
    public static void main(String[] args) {
        int n = 2;
        int pow =10;
        int ans =1;
        while(pow >0){
            if((pow & 1)!=0){
             ans = ans*n;
        }
        n =n*n;
        pow = pow >> 1;
        }
        System.out.println(ans);
    }
}
