import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        String str = "i am iron man ";
        Question1(str);

        String str1 ="race";
        String str2 ="care";
        Question4_Anagrams(str1,str2);
    }

    
    public static void Question1(String str){
        int count =0;
        for(int i=0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
                count++;
            }
        }
        System.out.println("THe vowels appeared "+ count+" times in the above string .");
    }



    public static void Question4_Anagrams(String str1, String str2){
        // lower case all the value so we do not have to check for lower case and upper case differently.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // now checking the length of the string if the length of the string is not same then they simply are not same.
        if(str1.length()==str2.length()){

            //making str1 and str2 to character array so that we can access and sort each character.
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // now sorting the array into ascending order so that we can compare them easily.
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);
            if(result){
                // when result is true.
                System.out.println(str1 + " and " + str2 + " are the anagrams of each other");
            }else{
                // when result is false.
                System.out.println(str1 + " and " + str2 + " are not the anagrams of each other");
            }
            
        }
        else{
            // when length's are not equal.
            System.out.println(str1 + " and " + str2 + " are not the anagrams of each other");
        }

    }
}
