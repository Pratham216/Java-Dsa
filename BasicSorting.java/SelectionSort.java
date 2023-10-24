public class SelectionSort {
    public static void Selection_sort(int number[]){
        for(int i =0; i<= number.length-2; i++){
            int min_position = i;
            for(int j=i+1; j<=number.length-1; j++){
                if(number[min_position] > number[j]){
                    min_position = j;
                }
            }
            // now doing swaping ...

        int temp = number[min_position];
        number[min_position] = number[i];
        number[i] =  temp;

        }
         for (int i =0; i<= number.length-1; i++){
            System.out.print(number[i]+" ");
        }
    }

    public static void main(String[] args) {
        int number[] = {45,32,24,67,90,55};
        Selection_sort(number);

    }
}
