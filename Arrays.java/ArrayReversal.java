public class ArrayReversal {
    public static void reveresed_array(int numbers[]){
        int first =0;
        int last = numbers.length-1;

        while(first<last){

            int temp= numbers[last];
            numbers[last]=  numbers[first];
            numbers[first] = temp;

            first++;
            last--;

        }
        for(int i=0; i<=numbers.length-1; i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        reveresed_array(numbers);

         
    }
}
