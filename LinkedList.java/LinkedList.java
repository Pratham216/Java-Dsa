public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node tail;
    static int size;

    public static void addFirst(int data) {
        // Step 1: Create new node
        Node newNode = new Node(data);
        size++;

        // Corner case when the linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step2 : Make the link
        newNode.next = head;

        // Step3: Create the new Head
        head = newNode;
    }

    public static void addLast(int data) {
        // Step1: Create a newNode
        Node newNode = new Node(data);
        size++;

        // Corner case
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step2: Link
        tail.next = newNode;

        // Step3: Create new tail
        tail = newNode;
    }

    public static void addMid(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int removeFirst(){
        if(head==null){
            System.out.println("The linked list is empty ");
            return Integer.MIN_VALUE;
        }
        else if (head== tail){
            int val = head.data;
            head= tail=null;
            size=0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int removeLast(){
        if (size==0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if (size==1) {
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next =null;
        tail =prev;
        size--;
        return val;
    }

    public static int iterativeSearch(int key){
        Node temp= head;
        int i=0;

        while (temp!=null) {
            if (key == temp.data) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static int recursiveSearch(Node head,int key){
       if (head==null) {
        return -1;
       }
       if (head.data == key) {
        return 0;
       }
       int idx = recursiveSearch(head.next, key);
       if (idx == -1) {
        return -1;
       }
       return idx+1;

    }

    public static void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public static void deleteFromEnd(int n){
        if (n ==  size) {
            head= head.next;
            return;
        }
        int i =1;
        int iToFind = size-n;
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
        
    }

    public static void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();

        addFirst(2);
        addFirst(1);

        addLast(4);
        addLast(5);

        addMid(2, 3);

        print();
        // System.out.println("The size of linked list is : "+ll.size);
        
        // ll.removeFirst();
        // ll.print();
        // System.out.println("The size of linked list is : "+ll.size);
        
        
        // ll.removeLast();
        // ll.print();
        // System.out.println("The size of linked list is : "+ll.size);

        // System.out.println(ll.iterativeSearch(4));
        // System.out.println(ll.iterativeSearch(10));

        // System.out.println(ll.recursiveSearch(head, 4));
        // System.out.println(ll.recursiveSearch(head, 10));

        // reverse();

        deleteFromEnd(2);
        print();

        

    }
}
