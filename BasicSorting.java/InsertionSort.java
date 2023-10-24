public class InsertionSort {
    public static void insertion_sort(int arr[]){
        for(int i=1; i<= arr.length-1;i++){
            int current= arr[i];
            int previous =i-1;

            // searching for the correct position to insert..
            while(previous>=0 && arr[previous] > current){
                arr[previous+1] = arr[previous];
                previous--;
            }
            // inserting the current element...
            arr[previous+1] = current;
        }
        for(int i=0; i<= arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertion_sort(arr);
    }

}
