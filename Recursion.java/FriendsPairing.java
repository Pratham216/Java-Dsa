public class FriendsPairing {
    public static int GetPairs(int n){
        if(n==1|| n==2){
            return n;
        }
        // for single 
        int single = GetPairs(n-1);

        // for pairs 
        int p = GetPairs(n-2);
        int pairs = (n-1)*p;

        int TotalWays = single*pairs;
        return TotalWays;
    }
    public static void main(String[] args) {
        System.out.println(GetPairs(3));
    }
}
