public class Exercise1 {
    public static void main(String[] args) {
        int arr[][] = {{5,8,3},
                      {5,1,8},
                      {1,3,5}};
       Question1(arr, 5);
       Question2(arr);
       Transpose(arr);
    }
    public static void Question1(int arr[][], int key){
        int count=0;
        for(int i=0; i<= arr.length-1; i++){
            for(int j=0; j<=arr[0].length-1; j++){
                if(arr[i][j]== key){
                    count++;
                }
            }
        }
        System.out.println("the given number has appeared "+count+" times in the above array..");
    }
    public static void Question2(int arr[][]){
        int count=0;
        for(int i=0; i<=arr[1].length-1;i++){
            count+= arr[1][i];
        }
        System.out.println(count);
    }
    public static void Transpose(int arr[][]){
        int row= arr.length;
        int col= arr[0].length;
        int transpose[][] = new int[row][col];

        for(int i=0; i<= row-1; i++){
            for(int j=0; j<=col-1; j++){
              transpose[j][i] = arr[i][j]; 
            }
        }
         for(int i=0; i<= arr.length-1; i++){
            for(int j=0; j<=arr[0].length-1; j++){
               System.out.print(transpose[i][j]);
            }
            System.out.println();
        }
    }
}
