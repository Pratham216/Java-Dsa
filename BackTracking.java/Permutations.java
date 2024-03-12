public class Permutations {
    public static void  getCombinations(String str, String ans){
        // base case
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        // recursive case
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1);
            getCombinations(Newstr, ans+curr);
            /*

                                          'abc'
               _____________________________|______________________________
               |                            |                             |
            'bc'a                       'ac' b                          'ab'c 
               |                            |                              |
             ------                     -------                         --------
            |      |                    |      |                        |       |
        'c'ab  'b'ac                 'c'ba     'a'bc                 'a'cb       'b'ca
            --------------------------------------------------------------------------------
            abc     acb             bac        bca                  cba            cab
            --------------------------------------------------------------------------------
            

             */
        }  
        
    }
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        getCombinations(str, ans);

    }   
}
 