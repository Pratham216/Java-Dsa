public class SubArrays_1 {
    public static void print_SubArray(int numbers[]){
        
        int total_subArray = 0;
        int sum =0;
        
        for(int i =0; i<= numbers.length-1; i++){
            int start = i;
        
            for(int j =i; j<=numbers.length-1; j++){
                int last = j;
        
                for(int k =start; k<= last; k++){
                    System.out.print(numbers[k]+" ");            
                    sum= sum +numbers[k];
                }   
                total_subArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total number of sub array in the given array is : "+total_subArray);
        System.out.println("the sum of all the elements in the sub array is : "+ sum);
    }
    public static void Sum_of_subArray(int numbers[]){
        
        int max_sum_of_subArray = Integer.MIN_VALUE;
        int Current_sum =0;
        
        for(int i =0; i<= numbers.length-1; i++){
            int start = i;
        
            for(int j =i; j<=numbers.length-1; j++){
                int last = j;
                Current_sum=0;
        
                for(int k =start; k<= last; k++){                    
                    Current_sum= Current_sum +numbers[k];
                }
                System.out.println(Current_sum);
                        
                if(max_sum_of_subArray< Current_sum){
                max_sum_of_subArray= Current_sum;
               }   
            } 
        }
       System.out.println("The maximum sum among these subarrays sum is : "+ max_sum_of_subArray);
    }
    public static void main(String[] args) {
    int numbers[] ={2,4,6,8,10};
    int number2[]= {1,-2,6,-1,3};
    print_SubArray(numbers);
    System.out.println("\n*******************************************************\n");
    Sum_of_subArray(number2);
    }
}
