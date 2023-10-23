public class Exercise {
    public static void main(String[] args) {
        int arr[] = {3,6,2,18,7,4,5,3,1};
        
       

        System.out.println("The sorted list in decreasing order using COUNTING SORT method ...");
        counting_sort(arr);
        print_array(arr);
        System.out.println("\n*********************\n");

        
    }
    public static void bubble_sort(int arr[]){
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr.length-2-i; j++){
                if(arr[j]< arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
    }

    public static void selection_sort(int arr[]){
        for(int i=0; i<=arr.length-2;i++){
            int max_position =i;
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[max_position]< arr[j]){
                    max_position=j;
                }
            }
            int temp = arr[max_position];
            arr[max_position] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion_sort(int arr[]){
        for(int i =0; i<= arr.length-1; i++){
            int curr= arr[i];
            int prev=i-1;
            while(prev >=0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void counting_sort(int arr[]){
       int largest = Integer.MIN_VALUE;
        for(int i =0; i<=arr.length-1; i++){
            largest = Math.max(largest, arr[i]);
        
        }
        int count[] = new int[largest+1];
        for(int i =0; i<= arr.length-1; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1; i>=0; i--){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print_array(int arr[]){
        for(int i=0; i<= arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
