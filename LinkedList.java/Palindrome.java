public class Palindrome {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next =null;
        }

    }
    static Node head;
    static Node tail;

    public static void addLast(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }

            tail.next = newNode;
            
            tail = newNode;
        
            
    }
    //with slow fast approach
    public static Node FindMid(Node head){
        Node slow= head;
        Node fast = head;

        while(fast!=null && fast.next!= null) {
            slow = slow.next;
            fast =fast.next.next;
        }
        return slow;
    }

    public static boolean checkPalindrome(){
        if (head== null || head.next== null) {
            return true;
        }
        //step 1: find the mid of the linked list
        Node midNode = FindMid(head);

        //step 2: reverse the right part of the linked list
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        //step 3: compare the left part and the right part of the linked list
        while (right!=null) {
            if (left.data != right.data) {
                return false;
            }
            left= left.next;
            right = right.next;

        }
        return true;
    }
    

    public static void print(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Palindrome ll = new Palindrome();
        addLast(1);
        addLast(2);
        addLast(2);
        addLast(1);

        print();
        System.out.println(checkPalindrome());

    }
}
