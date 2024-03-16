public class LoopInLL {

        public  static class Node {
            int data;
            Node next;
    
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        static Node head;
        static Node tail;
    
        public  static boolean  IsCycle() {
            // Floyd cycle loop detection algorithm
            // it uses slow fast pointer approach
    
            Node slow = head;
            Node fast = head;
    
            while (fast != null && fast.next != null) {
                slow = slow.next; // +1
                fast = fast.next.next; // +2
    
                // Checking the loop in the linked list
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
         
        public static void RemoveLoop(){
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
    
            while (fast != null && fast.next != null) {
                slow = slow.next; // +1
                fast = fast.next.next; // +2
    
                // Checking the loop in the linked list
                if (slow == fast) {
                    cycle = true;
                    break;
                }
            }

            if (cycle == false) {
                return;
            }

            slow = head;
            // Node prev = null;
            while (slow.next != fast.next) {
                // prev= fast;
                slow= slow.next;
                fast= fast.next;
            }

            // remove the cycle 
            fast.next = null;

        }

        public static void print(){
            Node temp = head;
            while (temp!= null) {
                System.out.print(temp.data +"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    
        public static void main(String[] args) {
            LoopInLL list = new LoopInLL();
    
            head = new Node(1);

            Node temp = new Node(2);
            head.next = temp;

            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = temp;
            
    
            if (IsCycle()) {
                System.out.println("The linked list has a loop");
                System.out.println("Linked list after removing the loop :");
            } else {
                System.out.println("The linked list does not have a loop");
            }


            RemoveLoop();

            print();
        }
    }
    

