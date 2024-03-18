public class DoublyLL {
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

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if (head== null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head= newNode;

    }   

    public static void addLast(int data){
        Node newNode = new Node(data);
        if (head== null) {
            head= tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        
    }

    public static int removeFirst(){
        if (head== null) {
            System.out.println("Doubly Linked list is empty.");
            return Integer.MIN_VALUE;
        }
        else if (head.next == null) {
            int val = head.data;
            head= tail= null;
            return val;

        }
        int val = head.data;
        head= head.next;
        head.prev = null;
        return val;
    }

    public static int removeLast(){
        if (head== null) {
            System.out.println("Doubly linked list is empty.");
            return Integer.MIN_VALUE;
        }
        else if (head.next ==null) {
            int val = head.data;
            head= tail=null;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next =null;
        return val;
    }

    public static void print(){
        Node temp = head;

        while (temp!= null) {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        
        System.out.println("Linked list after Adding element :");
        dll.print();
        
        dll.removeFirst();
        System.out.println("Linked list after Removing First element :");
        dll.print();
        
        dll.removeLast();
        System.out.println("Linked list after Removing last element :");
        dll.print();
        
    }
}
