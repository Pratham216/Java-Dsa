import java.util.ArrayList;

public class MostWater {

    public static void TotalWater(ArrayList<Integer> tower) {

        // BRUTE FORCE.....

        int MaxWater = 0;

        for (int i = 0; i < tower.size(); i++) {
            for (int j = i + 1; j < tower.size(); j++) {

                int height = Math.min(tower.get(i), tower.get(j));
                int width = j - i;

                int currWater = height * width;

                MaxWater = Math.max(MaxWater, currWater);
            }
        }

        System.out.println(MaxWater);
    }

    public static void main(String[] args) {
        ArrayList<Integer> tower = new ArrayList<>();
        tower.add(1);
        tower.add(8);
        tower.add(6);
        tower.add(2);
        tower.add(5);
        tower.add(4);
        tower.add(8);
        tower.add(3);
        tower.add(7);

        System.out.print("The maximum area in which water can be stored is : ");
        TotalWater(tower);

    }

}