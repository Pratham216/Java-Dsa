public class StairCaseInSortedArray {
    public static void main(String[] args){
        int arr[][] = {{10,20,30,40},
                      {15,25,35,45},
                      {27,29,37,48},
                      {32,33,39,50}};

       System.out.println("search using brute force method.."); 
       brute_method(arr,37);
       System.out.println("\n***********************************\n");
       System.out.println("search using binary search method ...");
       binary_method(arr, 45);
       System.out.println("\n***********************************\n");
       System.out.println("search using staircase search method ...");
       Staircase_method(arr, 33);

   
  

    }
    public static void brute_method(int arr[][], int key){
        for(int i=0; i<= arr.length-1; i++){
            for(int j=0; j<= arr.length-1; j++){
                if(arr[i][j]==key){
                    System.out.println("The given element is found at the index : "+ "["+i+","+j+"]");
                }
            }
        }
    }
    public static void binary_method(int arr[][],int key){
        int rows = arr.length;
        int cols = arr[0].length;
        
        
        int left = 0;
        int right = rows * cols - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = arr[mid / cols][mid % cols];
          
            
            if (midValue == key) {
                System.out.println("The given element is found at the index: [" + (mid / cols) + ", " + (mid % cols) + "]");
                break;
            } else if (midValue < key) {
                left = mid + 1;
               
            } else {
                right = mid - 1;

            }
        }
        System.out.println("The element is not found."); 
        
        }
    
    public static void Staircase_method(int arr[][], int key){
        int row=0, col =arr[0].length-1;
        
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("The given element is found at the index : "+ "["+row+","+col+"]");
                return;
            } else if (arr[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        
        System.out.println("The element is not found.");
    }
}

