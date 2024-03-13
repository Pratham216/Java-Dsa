import java.util.ArrayList;

public class Iteration {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=5; i++){
            list.add(i*2);
        }
        for(int j=0; j<list.size();j++){
            System.out.print(list.get(j)+" ");
        }
        System.out.println();
    }
}
