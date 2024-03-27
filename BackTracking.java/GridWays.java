public class GridWays {
    public static int gridWays(int i, int j, int n, int m){
        if (i==n-1 && j == m-1) {       // condition for last cell
            return 1;
        }
        else if (i==n || j==m) {
            return 0;
        }

        int W1 = gridWays(i+1, j, n, m);
        int W2 = gridWays(i, j+1, n, m);

        return W1+W2;
        //Time complexity of this code is 2^(n+m) exponential which is very high 
        // so we can reduce it by using a mathematical formula which is
        // (n-1+m-1)!
        //-------------    (divided by)
        //(n-1)! (m-1)!
    }
    public static void main(String[] args) {
        int n=3, m=4;
        System.out.println(gridWays(0, 0, n, m));
    }
}
