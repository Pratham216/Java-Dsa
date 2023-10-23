public class BubbleSort {
    public static void bubble_sort(int number[]){

        for(int i =0; i<=number.length-2; i++){
            for(int j=0; j<=number.length-2-i; j++){
                if(number[j] > number[j+1]){
                int temp = number[j];
                number[j] = number[j+1];
                number[j+1] = temp;
                }
            }
        }
        for (int i =0; i<= number.length-1; i++){
            System.out.print(number[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int number[] ={45,69,32,52,4,8,1};
        bubble_sort(number);

    }
}
