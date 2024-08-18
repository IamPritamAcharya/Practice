public class linkedlistInsert {

    static Node insertHead(Node head, int val) {
        return new Node(val, head); // Node temp = new Node(val, head); return temp;
    }

    static Node insertTail(Node head, int val) {
        if (head == null) {
            return new Node(val); // linkedlist had nothing then head is val with null pointing
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node newNode = new Node(val);
        temp.next = newNode;

        return head;
    }


    // k postion
    static Node insertAtk(Node head, int val, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(val);
            } else return head;  // not possible ,change according to problem
        }

        if (k == 1) {
            Node temp = new Node(val, head);
            return temp;
        }

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            if (count == k-1) {
                Node x = new Node(val, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }

        return head;
    }


    // insert before value(val) and the element that is inserted is el
    static Node insertBeforeValue(Node head, int el, int val) {
        if (head == null) {
            return null;
        }

        if (head.data == val) {
            return new Node(el, head);
        }

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data == val) {
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }

        return head;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Node head = linkedlist.convert_Array_to_Linkedlist(arr);
        System.out.println("LinkedList");
        linkedlist.print_Linkedlist(head);
        System.out.println();

        System.out.println("Head Insertion:");
        head = insertHead(head, 69);
        linkedlist.print_Linkedlist(head);
        System.out.println();

        System.out.println("Tail Insertion:");
        head = insertTail(head, 70);
        linkedlist.print_Linkedlist(head);
        System.out.println();

        System.out.println("Kth Insertion(position):");
        head = insertAtk(head, 71, 3);
        linkedlist.print_Linkedlist(head);
        System.out.println();    
        
        System.out.println("insert before value:");
        head = insertBeforeValue(head, 100, 3);
        linkedlist.print_Linkedlist(head);
        System.out.println();  
    }
}
