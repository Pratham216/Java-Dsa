import java.util.Stack;

public class ReverseString {
    public static String resverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx= 0;

        while (idx< str.length()) {
            char top = str.charAt(idx);
            s.push(top);
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "Pratham";
        String ans = resverseString(str);
        System.out.println(ans);
    }
}
