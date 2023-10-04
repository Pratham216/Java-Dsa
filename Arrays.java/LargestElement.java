
public class LargestElement {
    public static int get_largest(int number[]){
       int largest =Integer.MIN_VALUE;
       

       for(int i =0; i<=number.length-1; i++){
        if(number[i]>largest){
            largest= number[i];
        }
       }
        return largest;
    }
    public static int get_smallest(int number[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<= number.length-1; i++){
            if(number[i] < smallest){
                smallest = number[i];
            }
            
        }
        return smallest;
    }
    public static void main(String[] args) {
        int number[]={23,4,2,45,65,643,676,234,56};
        System.out.println("The largest value in the given array is : "+get_largest(number));
        System.out.println("The smallest value in the given array is : "+get_smallest(number));

    }
}
