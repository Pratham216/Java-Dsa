import java.util.ArrayList;

public class MostWater2 {
    public static void TotalWater(ArrayList<Integer> tower){
        
        // 2 Pointer Approach

        int MaxWater=0;
        int lp = 0;
        int rp = tower.size()-1;

        while (lp != rp) { // or we can write while(lp<rp)
            
            int height =  Math.min(tower.get(lp), tower.get(rp));
            int width = rp-lp;

            int currWater = height*width;
            MaxWater = Math.max(MaxWater, currWater);

            //pointer update
            if (tower.get(lp)< tower.get(rp)) {
                lp++;
            }else{
                rp--;
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
        
        System.out.print("The maximum area in which water can be stored with Optimised Method is : ");
        TotalWater(tower);

    }
}