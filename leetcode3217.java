import java.lang.annotation.ElementType;
import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class leetcode3217 {
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


    public static ListNode modifiedList(int[] nums, ListNode head) {
        if (head == null) {
            return head;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        System.out.println(set);

        while (set.contains(head.val)) {
            head = head.next;
        }

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            if (set.contains(temp.val)) {
                prev.next = prev.next.next;
            } else {
                prev = temp;
            }
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,6,2,4};
        int[] head = {3,7,1,8,1};

        modifiedList(nums, arrayToLinkedList(head));
    }
}
