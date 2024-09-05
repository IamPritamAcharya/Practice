class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class leetcode19 {
    static ListNode arrayToLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null; // Return null if the array is empty
        }

        // Create the head of the linked list
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        // Iterate through the array and create linked list nodes
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head; // Return the head of the linked list
    }

    // Helper function to print the linked list
    static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (n == length) {
            return head.next;
        }

        temp = head;
        
        for (int i = 0; i < length - n - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }

    public static void main(String[] args) {
        int[] lst1 = {1,2};

        

        printLinkedList(removeNthFromEnd(arrayToLinkedList(lst1), 2));
        
    }
}
