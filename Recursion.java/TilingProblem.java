public class TilingProblem {
    public static int tiles(int n){

        if( n==0 || n==1){
            return 1;
        }
        //for vertical choice 
        int verticalTiles = tiles(n-1);

        // for horizontal choice
        int horizontalTiles = tiles(n-2);

        //total ways
        int TotalWays = verticalTiles+ horizontalTiles;
        return TotalWays;
    }
    public static void main(String[] args) {
        System.out.println(tiles(3));
    }
}
