class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class linkedlist {
    
    static Node convert_Array_to_Linkedlist(int[] arr) {
        Node head =  new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp; 
            mover = temp;
        }

        return head;
    }

    static int length_Linkedlist(Node head) {
        Node temp = head;
        int counter = 0;
        while (temp != null) {
            temp = temp.next;
            counter++;  
        }

        return counter;
    }
    static boolean search_Linkedlist(Node head, int value) {
        // check if present 

        Node temp = head;
        while (temp != null) {
            if (value == temp.data) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    static void print_Linkedlist(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {2,5,6,8};
        Node head = convert_Array_to_Linkedlist(arr);
        System.out.println("head of Linkedlist: " + head.data);

        // traversing through linkedlist

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }

        // length of linked list
        System.out.println("\nLength: " + length_Linkedlist(head));

        System.out.println(search_Linkedlist(head, 5));
        System.out.println(search_Linkedlist(head, 15));

    }
}
