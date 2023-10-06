public class PrefixSumArrays_2 {
    public static void Sum_of_subArray(int numbers[]){
        int max_sum_of_subArray = Integer.MIN_VALUE;
        int Current_sum =0;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for(int i =1; i<=prefix.length-1; i++){
            prefix[i]= prefix[i-1]+ numbers[i]; 
        }

        for(int i =0; i<= numbers.length-1; i++){
            int start = i;

            for(int j =i; j<=numbers.length-1; j++){
                int last = j;
                Current_sum = (start == 0) ? prefix[last]: prefix[last]- prefix[start-1];
                
                if(max_sum_of_subArray< Current_sum){
                max_sum_of_subArray= Current_sum;
               }   
            } 
        }
       System.out.println("The maximum sum among these subarrays sum is : "+ max_sum_of_subArray);
    }
    public static void main(String[] args) {
    int numbers[] ={1,-2,6,-1,3};
    Sum_of_subArray(numbers);
    
    }
}


