import java.util.LinkedList;
public class MergeSort {
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

    public static Node GetMid(Node head){
        if (head== null) {
            return null;
        }

        Node slow = head;
        Node fast = head.next;   // so that we can get middle as the last element of the first half 

        while (fast!=null && fast.next!= null) {
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }

    public static Node Merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2!= null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

            }
        }

        if (head1 != null)
        temp.next = head1;
    else if (head2 != null)
        temp.next = head2;
        return mergedLL.next;
    }

    public static Node MergeSort(Node head){
        if (head== null || head.next==null) {
            return head;
        }
        // find mid
        Node mid = GetMid(head);

        // left and right merge sort
        Node righthead = mid.next;
        mid.next=null;
        Node newleft = MergeSort(head);
        Node newright = MergeSort(righthead);

        //merge
        return Merge(newleft, newright);

    }
    public static void print(Node head){
        Node temp = head;

        while (temp!= null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void add(int data){
        Node newNode = new Node(data);

        if (head== null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {
        MergeSort ll = new MergeSort();
        ll.add(5);
        ll.add(3);
        // ll.add(1);
        // ll.add(2);
        // ll.add(4);

        head= MergeSort(head);
        print(head);

    }
}
