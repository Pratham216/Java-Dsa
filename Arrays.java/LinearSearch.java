
public class LinearSearch {
    public static int linear_Search(int numbers[],int key){
        for(int i=0; i<= numbers.length-1; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
     int numbers[]={1,23,4,536,564,667,35,73,69,78};
     int key=69;
     int index= linear_Search(numbers, key);
     if(index==-1){
        System.out.println("The number you are searching for is not found in the given array...");
     }else{
        System.out.println("The number you are searching for is found at "+ index); 
     }      
   }
   
}
