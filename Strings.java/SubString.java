public class SubString {
    public static void main(String[] args) {
        String str = "Pratham bisht";
        System.out.println(subString(str, 0, 5));
        System.out.println("******************");
    // another method of using substring is using its built in method ...
        System.out.println(str.substring(0, 5)); 
        System.out.println("\nThere is no difference in the output");
    }
    public static String subString(String str, int start_index, int end_index){
       String sub_string ="";
       for(int i =start_index; i<=end_index-1; i++){
        sub_string += str.charAt(i);
       }
       
        return sub_string;
    }
    
}
