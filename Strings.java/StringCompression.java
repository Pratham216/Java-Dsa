public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbccccdddddd";
        System.out.println(getDecompressedString(str));
        System.out.println("*********************************");
        System.out.println(GetdecompString(str));
    }
    public static String getDecompressedString(String str){
        String newStr = "";
        for(int i=0; i<=str.length()-1; i++){
            Integer count=1;
            while( i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if(count > 1){
            newStr += count.toString();
        }
    }
        return newStr;
    }
    public static String GetdecompString(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<=str.length()-1; i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));    
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
}
