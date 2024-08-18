
public class linkedlistDelete {

    static Node removeHead(Node head) {
        if (head == null) {
            return head;
        }

        head = head.next;

        return head;
    }

    static Node removeTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    //remove kth element
    static Node removeKth(Node head, int k) {
        if (head == null) {
            return null;  // empty linkedlist
        }

        if (k == 1) {
            head = head.next;
            return head;
        }

        int count = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;


    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        Node head = linkedlist.convert_Array_to_Linkedlist(arr);
        System.out.println("LinkedList");
        linkedlist.print_Linkedlist(head);
        System.out.println();

        head = removeHead(head);
        System.out.println("Head removed:");
        linkedlist.print_Linkedlist(head);
        System.out.println("Head of LinkedList: " + head.data);
        System.out.println();

        System.out.println("Tail removed:");
        head = removeTail(head);
        linkedlist.print_Linkedlist(head);
        System.out.println("Head of LinkedList: " + head.data);
        System.out.println();

        System.out.println("Kth element removed");
        head = removeKth(head, 3);
        linkedlist.print_Linkedlist(head);
        System.out.println("Head of LinkedList: " + head.data);
        System.out.println();


    }
    
}
