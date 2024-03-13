import java.util.ArrayList;

public class DoublyArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i);
            list2.add(i*2);
            list3.add(i*5);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);
        System.out.println(list1);

        for (int j = 0; j< mainList.size(); j++) {
            ArrayList<Integer> currlist = mainList.get(j);
            
            for(int k=0; k<currlist.size(); k++){
                System.out.print(currlist.get(k)+" ");
            }
            System.out.println();
        }
    }   
}
