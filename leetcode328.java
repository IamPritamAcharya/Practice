class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class leetcode328 {

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


    public static ListNode oddEvenList(ListNode head) {
        int counter = 0;
        ListNode evenDummy = new ListNode(0);
        ListNode oddDummy = new ListNode(0);

        ListNode even = evenDummy;
        ListNode odd = oddDummy;

        ListNode temp = head;

        while (temp != null) {
            if (counter % 2 == 0) {
                even.next = temp;
                even = even.next;
            } else {
                odd.next = temp;
                odd = odd.next;
            }

            counter++;
            temp = temp.next;
        }

        odd.next = null;

        even.next = oddDummy.next;

        printLinkedList(evenDummy.next);
        return evenDummy.next;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        oddEvenList(arrayToLinkedList(arr));
    }
}
