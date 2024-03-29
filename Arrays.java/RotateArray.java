public class RotateArray {
    public static void Rotate_One(int arr[]){
            int temp =  arr[0];
            int n= arr.length;
            for (int i = 1; i < n; i++) {
                arr[i-1] = arr[i];

            }
            arr[n-1] = temp;

            
        }
        
    public static void Rotate_array(int arr[], int k){
        int n = arr.length;
        k = k%n;
        if(k<0){
            k =k+n;         //important 
        }

        for (int i = 0; i < k; i++) {
            Rotate_One(arr);
        }

    }
    public static void Print_array(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        // Rotate_One(arr);
        Rotate_array(arr, -1);
        Print_array(arr);
    }
}
