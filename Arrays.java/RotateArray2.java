public class RotateArray2 {

    public static void Reverse_array(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void Rotate_array(int arr[], int k){
        int n = arr.length;
        k = k%n;
        if (k<0) {
            k= k+n;
        }
        Reverse_array(arr, 0, k-1);
        Reverse_array(arr, k, n-1);
        Reverse_array(arr, 0, n-1);
    }
    public static void Print_array(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Rotate_array(arr, 3);
        Print_array(arr);
    }
}
