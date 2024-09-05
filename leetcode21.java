class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class leetcode21 {
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode head = ans;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                ans.next = temp1;
                temp1 = temp1.next;
            }
            else {
                ans.next = temp2;
                temp2 = temp2.next;
            }

            ans = ans.next;
        }
        if (temp1 != null) {
            ans.next = temp1;
        } else {
            ans.next = temp2;
        }

        return head.next;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,4, 6};
        int[] arr2 = {1,3,4};
       
        mergeTwoLists(arrayToLinkedList(arr), arrayToLinkedList(arr2));
    }
}
