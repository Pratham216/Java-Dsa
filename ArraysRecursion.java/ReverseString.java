public class ReverseString {
    public static void reverse_string(String str, String Newstr, int i){

        // for (int i= str.length()-1; i>=0;i--) {
        //     Newstr = Newstr + str.charAt(i);
        // }
        // for (int i = 0; i < Newstr.length(); i++) {
        //     System.out.print(Newstr.charAt(i));
        // }
        
        if(i==-1){
            for (int j = 0; j < Newstr.length(); j++) {
                System.out.print(Newstr.charAt(j));
            }
            return;
            
        }
        
        Newstr+= str.charAt(i);
        reverse_string(str, Newstr,i-1);




    }
    public static void main(String[] args) {
        String str = "pratham";
        String Newstr ="";
        int i = str.length()-1;
        reverse_string(str, Newstr,i);
    }
}
