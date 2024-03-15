import java.util.ArrayList;

public class Reverse {
    public static void reverse_list(ArrayList<Integer> list){

        int ans= list.size();
    
        for (int i = 0; i <list.size(); i++) {
            list.set(i, ans);
            ans--;
        }
    
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) +" ");
        }
        System.out.println();
    }

    public static void Reverse_List(ArrayList<Integer> list){
        for (int k = list.size()-1; k>=0 ; k--) {
            System.out.print(list.get(k)+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("the answer from 1st method ");
        reverse_list(list);
        System.out.println("the answer from 2nd method ");
        Reverse_List(list);
        

    }
}
 