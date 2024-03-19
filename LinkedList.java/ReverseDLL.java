
public class ReverseDLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

       public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
       } 
    }
    static Node head;
    static Node tail;

    public static void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr!=null) {
            next= curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr =next;
        }
        head= prev;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head= tail= newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev= tail;
        tail = newNode;
    }

    public static void print(){
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseDLL dll = new ReverseDLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);

        System.out.println("The Doubly Linked list before reversal is :");
        dll.print();

        System.out.println("The Doubly Linked list after reversal is :");
        dll.reverse();
        dll.print();
    }
}
