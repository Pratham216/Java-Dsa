public class palindrome2 {
    public static boolean Is_Palindrome(String str){
        int n = str.length();
        
        for (int i = 0; i < n/2; i++) {
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str ="madam";

        if (Is_Palindrome(str)) {
            System.out.println("Palindrome");
        }else
        System.out.println("Not a palindrome");
    }
}
