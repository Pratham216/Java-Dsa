public class Arrays {

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

        public static void change(int arr[], int i, int value){

            // base step
            if(i== arr.length){
                printArray(arr);
                return;
            }
            arr[i]= value;
            change(arr, i+1, value+1);  // recursion step  integration is called as the function step
            arr[i] = arr[i]-2;     // backtracking step

        }
    
    public static void main(String[] args) {
        int arr[] = new int[5];
        change(arr, 0, 1);
        printArray(arr);
    }
}
