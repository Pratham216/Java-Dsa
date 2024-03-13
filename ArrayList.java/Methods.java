import java.util.ArrayList;

public class Methods {
    public static void main(String[] args) {
        //Various types of Array list input
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        
        // add method
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println(list);
        
        // remove method
        list.remove(3);
        System.out.println(list);

        //get method
        int result= list.get(0);
        System.out.println(result);

        //set method
        list.set(2, 25);
        System.out.println(list);
        // it will change the index of the already present in the array list given
    
    }
}
