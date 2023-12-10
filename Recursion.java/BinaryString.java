public class BinaryString {
    public static void GetBinString(int n, int lastplace , String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        // if(lastplace == 0){
        //     GetBinString(n-1, lastplace, str+"0");
        //     GetBinString(n-1, lastplace, str+"1");
        // }else{
        //     GetBinString(n-1, lastplace, str+"0");
        // }
        
        GetBinString(n-1, 0, str+"0");
        if(lastplace==0){
            GetBinString(n-1, 1, str+"1");
        }
        
    }
    public static void main(String[] args) {
        GetBinString(3, 0, "");
        
    }
}
