class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class leetcode86 {
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

    public static ListNode partition(ListNode head, int x) {
        ListNode small_head = new ListNode();
        ListNode small = small_head;

        ListNode large_head = new ListNode();
        ListNode large = large_head;

        ListNode temp = head;

        while (temp != null) {
            if (temp.val < x) {
                small.next = new ListNode(temp.val);
                small = small.next;
            }
            if (temp.val >= x) {
                large.next = new ListNode(temp.val);
                large = large.next;                
            }
            temp = temp.next;
        }

        small.next = large_head.next;
        small_head = small_head.next;

        return small_head;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5,2};

        partition(arrayToLinkedList(arr), 3);
    }
}
