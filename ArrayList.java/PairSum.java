import java.util.ArrayList;

public class PairSum {

    public static boolean Pair_Sum(ArrayList<Integer> list, int target) {
        // Brute force

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int res = list.get(i) + list.get(j);
                if (res == target) {
                    return true;
                }
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

        System.out.println(Pair_Sum(list, 9));
    }
}
