public class KadanesAlgorithm_3 {
    public static void Kadane_method(int number[]){
        int max_sum_of_subArray = Integer.MIN_VALUE;
        int Current_sum =0;

        for(int i =0; i<= number.length-1; i++){
            Current_sum = Current_sum+ number[i];
            if(Current_sum<0){
                Current_sum=0;
            }
            max_sum_of_subArray = Math.max(max_sum_of_subArray, Current_sum);
        }
        System.out.println("The maximum sum is : "+ max_sum_of_subArray);
    }
    public static void main(String[] args) {
        int numbers[] ={1,-2,6,-1,3};
        Kadane_method(numbers);
        
        }
}
