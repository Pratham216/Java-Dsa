public class SortedArray {
    public static boolean Is_Sorted(int arr[], int i){
        
        if(i== arr.length-1){
            return true;
        }
        else if(arr[i]> arr[i+1]){
            return false;
        }
        else;
        return Is_Sorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]= {2,3,4,5};
        int n =0;

        System.out.print("The given array [");

        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.print("] is : ");

        if(Is_Sorted(arr, n)== true){
            System.out.print("Sorted");
        }
        else{
            System.out.print("Not Sorted");
        }
    }
}
