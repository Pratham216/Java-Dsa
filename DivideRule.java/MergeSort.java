public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei){
        if (si>=ei) {
            return;
        }

        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
        
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i=si; 
        int j=mid+1;
        int k = 0;

        while (i<=mid &&j<=ei) {
            if(arr[i]< arr[j]){
                temp[k]= arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<=mid) {
            temp[k++] = arr[i++];

        }
        while (j<=ei) {
            temp[k++] =  arr[j++];
        }

        for ( k = 0, i= si; k < temp.length; k++, i++) {
            arr[i]=temp[k];
        }
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {10,3,6,8,2,1,5};
        int si=0;
        int ei= arr.length-1;
        System.out.println("The array before the sorting is : ");
        printArray(arr);
        mergeSort(arr, si, ei);
        System.out.println("");
        System.out.println("The array after the sorting is : ");
        printArray(arr);

    }
}