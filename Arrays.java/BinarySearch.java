
public class BinarySearch {
    public static int binary_search(int number[],int key){
        
        int start =0, end = number.length-1;
        

        while(start <= end){
            int mid = (start+end)/2;

            if(number[mid]== key){
                return mid;
            }
            else if(number[mid]< key){
                start= mid+1;
            }else{
                end= mid-1;
            }
        }
        return -1;
        }
        public static void main(String[] args) {
        int number[]= {2,4,6,8,10,12,14,16,18};
        int key=4;
        int flag = binary_search(number, key);

        if(flag==-1){
            System.out.println("This number is not in the given array ...Sorry");

        }else{
            System.out.println(key+" is found at index =  "+flag);
        }
    }
}
