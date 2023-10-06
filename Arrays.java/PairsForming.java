public class PairsForming {
    public static void get_pairs(int numbers[]){

        for(int i=0; i<=numbers.length-1; i++){
            int current_num =numbers[i];
            for(int j=i+1; j<=numbers.length-1; j++){
                System.out.print("( "+current_num+","+numbers[j]+" )");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10,12,14,16,18,20};
        get_pairs(numbers);

    }
}
