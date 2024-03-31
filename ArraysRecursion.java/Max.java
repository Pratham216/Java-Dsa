public class Max {
    public static int Max_value(int arr[], int i){
         
        if(i== arr.length-1){
            return arr[i];
        }
 
        int ans = Max_value(arr, i+1);
        return Math.max(arr[i], ans);
    }
    public static void main(String[] args) {
        int arr[]={10,20,1,2,3};
        System.out.println(Max_value(arr, 0));
    }
}
