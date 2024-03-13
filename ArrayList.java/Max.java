import java.util.ArrayList;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(43);
        list.add(33);
        list.add(19);
        list.add(20);

        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            maxi = Math.max(maxi, list.get(i));
        }
        System.out.println("Maximum element is : "+maxi);
    }
}
