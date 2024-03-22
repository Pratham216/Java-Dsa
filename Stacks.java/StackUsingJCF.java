import java.util.Stack;
public class StackUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        // JCF stands for Java Collection Framework
        s.push(1);
        s.push(2);
        s.push(3);

        s.peek();
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
