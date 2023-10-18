import java.util.Scanner;

public class Exericse { 
    public static void main(String[] args) {
       
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements u want to enter in the array..");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Please Enter ur elements...");
            for(int i =0; i<= arr.length-1;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the value for target : ");
            int target = sc.nextInt();
            twoSum(arr,target);
        }
    }
    public static void twoSum(int arr[],int target){
        for(int i =0; i<= arr.length-1; i++){
            for(int j=1; j<= i; j++){
            if(arr[i]+arr[j]==target){
                System.out.println("["+i+","+j+"]");
                break;
            }
        }
        }
    }
    
}
