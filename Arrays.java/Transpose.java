public class Transpose {
    public static void Print_array(int arr[][]){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
    }
    
    public static void Transpose_Matrix(int arr[][], int res[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
              res[i][j]=  arr[j][i];
            }
            
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                        {4,5,6},   
                        {7,8,9}};
        
        int res[][] = new int[arr.length][arr.length];
        System.out.println("The original array is :");
        Print_array(arr);
        Transpose_Matrix(arr, res);
        System.out.println("The Transposed array is :");
        Print_array(res);
    }
}
