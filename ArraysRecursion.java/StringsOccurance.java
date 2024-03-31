public class StringsOccurance {
    public static void Remove_occurance(String str, String Newstr, int i ){
       

        if(i==str.length()){
            for (int j = 0; j <Newstr.length(); j++) {
                System.out.print(Newstr.charAt(j));
            }
            
        }
        if (str.charAt(i)!='a') {
            Remove_occurance(str, Newstr+str.charAt(i), i+1);
        }

        Remove_occurance(str, Newstr, i+1);

    }

     
    public static void main(String[] args) {
        String str = "abcax";
        String Newstr = "";
        Remove_occurance(str, Newstr,0);

    }
}
