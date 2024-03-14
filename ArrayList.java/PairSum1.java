import java.util.ArrayList;

public class PairSum1 {
    public static boolean Pair_Sum(ArrayList<Integer> list, int target) {
        // Optimised Method

        int lp=0;
        int rp= list.size()-1;

        while (lp!=rp) { // or we can write while(lp<rp)
            if (list.get(lp)+ list.get(rp) == target) {
                return true;
            }
            if (list.get(lp)+ list.get(rp) < target) {
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Find if any pair in a Sorted Array list has a target Sum

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(Pair_Sum(list, 29));
    }
}
