
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

public class codechef_removedup_sortedList {
    Node removeDuplicates(Node head) {
        if (head == null) {
            return head;
        }
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next; 
            }
        }
        return head;
    }
};