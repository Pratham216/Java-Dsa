public class DiagonalSumOfMatrix {
    public static void main(String[] args) {
        int arr[][]= {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        System.out.println("Your matrix is : ");
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<= arr[0].length-1;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println("\n************************************************************ ");
        System.out.println("The diagonal sum with brute force method is : "+ brute_method(arr));
        System.out.println("\n************************************************************");
        System.out.println("The diagonal sum with optimised method is : "+ optimum_method(arr));


    }
    public static int brute_method(int arr[][]){
        int sum=0;
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<= arr[0].length-1; j++){
                if(i==j){
                    sum = sum + arr[i][j];
                }
                else if(i+j==arr.length-1){
                    sum = sum + arr[i][j];
                }
            }
        }
        return sum;
        
    }
    public static int optimum_method(int arr[][]){
        int sum=0;              // it is good for m X n matrix too...
        for(int i=0;i<= arr.length-1; i++){
            // for primary diagonal ...
            sum = sum + arr[i][i];

            // for secondary diagonal....
            if(i!= arr.length-1-i){
                sum = sum + arr[i][arr.length-1-i];
            }
            
        }
        return sum;
    }
}

