public class CircularLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static Node head;
    static Node tail;

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        // newNode.prev = tail; // if doubly circular linked list
        tail = newNode;
        tail.next = head;

    }

    public static int removeFirst() {
        if (head == null) {
            System.out.println("The Circular Linked list is empty");
            return Integer.MIN_VALUE;
        }
         else if (head.next == null) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        tail.next = head;
        return val;
    }

    public static void print() {
        if (head==null) {
            System.out.println("THE linked list is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println(head.data+ "null");
    }

    public static void main(String[] args) {
        CircularLL ll = new CircularLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.removeFirst();
        ll.print();
    }
}
