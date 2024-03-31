public class PalindromeString{
    public static void Is_Palindrome(String str , String Newstr, String Newstr1, int mid){
        for (int i = 0; i <mid; i++) {
            Newstr+=str.charAt(i);
        }
        for (int i = str.length()-1; i >= mid; i--) {
            Newstr1+=str.charAt(i);
        }
        int count=0;
        for (int i = 0; i <mid; i++) {
            if(Newstr.charAt(i)== Newstr1.charAt(i)){
               count++;
            }
        }
        if(count==mid){
            System.out.println("The given string is a palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }
    }
    public static void main(String[] args) {
        String str ="racecar";
        String Newstr ="";
        String Newstr1 ="";
        int mid = str.length()/2;
        Is_Palindrome(str, Newstr, Newstr1, mid);

    }
}
