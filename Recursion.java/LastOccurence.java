public class LastOccurence {

    public static int ElementFOund(int arr[], int key, int i){
    
        if(i== arr.length){
            return -1;
        }

       int IsFound = ElementFOund(arr, key,i+1);

       if(IsFound == -1 && arr[i] == key){
        return i;
       }
       return IsFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,3,3,5,7,3};
        System.out.println(ElementFOund(arr, 3,0));
    } 
}