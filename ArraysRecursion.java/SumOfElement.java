public class SumOfElement {
    public static int Sum(int arr[], int i){
        if(i==arr.length){
            return 0;
        }
        int add= Sum(arr,i+1);
        add+= arr[i];
        return add;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        System.out.println(Sum(arr, 0));
    }
}
