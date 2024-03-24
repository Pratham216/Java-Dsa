import java.util.LinkedList;

public class StackUsingLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next =null;
        }
    }

    static Node head;
    public static class Stack{
        
        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            i
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head= head.next;
            return top;
        }

        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Stack s= new Stack();
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
