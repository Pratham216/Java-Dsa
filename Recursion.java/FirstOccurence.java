public class FirstOccurence {
    public static void ElementFOund(int arr[], int key, int i){
        if(i== arr.length){
            System.out.println("The value is not found at any index .");
        }
        else if(arr[i]== key){
            System.out.println("The value is found at index "+ i);
            return ;
        }
        else;
        ElementFOund(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,11,13};
        ElementFOund(arr, 13,0);
    }  
}