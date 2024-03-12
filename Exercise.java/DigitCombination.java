public class DigitCombination {
    
    public static void Get_Characters(String str, String Newstr, String str2){
        char c ='a';
        for (int i = 2; i <=9; i++) {
            for (int j = 0; j < 3; j++) {
                str = str + c;
                c++;
            }
        }
        for (int i = 0; i <2; i++) {
            
            for (int j = 0; j <=3; j++) {
                str2 = str2+ Newstr.charAt(i) +str.charAt(j);
    
            }
            
        }
        
        for (int i = 0; i < Newstr.length()-1; i++) {
            System.out.print(Newstr.charAt(i));
        }
        System.out.println();
    }
    // public static void Print(String str){
        
    //     for (int i = 0; i < str.length(); i++) {
    //         System.out.print(str.charAt(i));
    //     }
    // }

    
    public static void main(String[] args) {
        String str = "";
        // int n = 23;
        String Newstr = "";
        String str2="";
        // int arr[] =new int[100];
        Get_Characters(str, Newstr, str2);
        // Print(str);
       


    }
}
