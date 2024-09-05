class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class leetcode1721 {

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

    public static ListNode swapNodes(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode first = head;
        ListNode second = head;
        ListNode temp = head;

        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        temp = first;

        while (temp.next != null) {
            temp = temp.next;
            second = second.next;
        }

        int tempVal = first.val;
        first.val = second.val;
        second.val = tempVal;
        printLinkedList(head);
        
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        swapNodes(arrayToLinkedList(arr), 2);

    }
}