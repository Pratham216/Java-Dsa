public class CountingSort {
    public static void counting_sort(int arr[]){
       
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<=arr.length-1;i++){
            largest = Math.max(largest, arr[i]);
        }
        // making an array which will count the number of times an element is repeated in the main array ...

        int count[] = new int[largest+1];
        for(int i=0;i<=arr.length-1;i++){
            count[arr[i]]++;
        }
        // sorting the elements..
        int j=0;
        for(int i=0; i<=count.length-1; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        for(int i=0; i<= arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        counting_sort(arr);
    }
}
