import java.util.ArrayList;

public class PairSum2 {
    public static boolean Pair_Sum2(ArrayList<Integer> list , int target){
        // Optimized method
        int bp= -1;
        int n = list.size();
        for(int i=1; i<list.size(); i++){
            if (list.get(i-1)> list.get(i)) {
                bp=i-1;;
            }
        }
        int rp = bp;
        int lp = bp+1;

        while (lp!=rp) {
            if (list.get(lp)+list.get(rp)==target) {
                return true;
            }
            if (list.get(lp)+list.get(rp)<target) {
                lp = (lp+1)%n;
            }else{
                rp= (n+rp-1)%n;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Find if any pair in a Sorted & Rotated Array list has a target Sum

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(Pair_Sum2(list, 16));
    }
}
