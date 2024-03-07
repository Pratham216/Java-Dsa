public class RemoveDuplicate {
    public static void DuplicateRemover(String str, int index , StringBuilder newstr, boolean map[]){
        
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        //work
        char currentchar = str.charAt(index);
        if(map[currentchar-'a']== true){
            DuplicateRemover(str, index+1, newstr, map);
        }else{
            map[currentchar - 'a'] = true;
            DuplicateRemover(str, index+1 , newstr.append(currentchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "apnacollege";
        StringBuilder newstr = new StringBuilder("");
        boolean map[] = new boolean[26];

        DuplicateRemover(str, 0, newstr, map);
    }
}
