class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class leetcode1669 {
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

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1;
        ListNode end = list1;

        for (int i = 0; i < b; i++) {
            if (i < a-1) {
                start = start.next;
            }
            end = end.next;
        }

        ListNode temp =list2;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = end.next;
        start.next = list2;


        return list1;

    }



    public static void main(String[] args) {
        int[] lst1 = {0,1,2,3,4,5,6};
        int[] lst2 = {1000000,1000001,1000002,1000003,1000004};


        ListNode head = mergeInBetween(arrayToLinkedList(lst1), 2, 5, arrayToLinkedList(lst2));
        printLinkedList(head);
    }
}
