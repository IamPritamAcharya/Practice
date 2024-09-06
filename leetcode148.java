import java.lang.reflect.Array;
import java.util.Arrays;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class leetcode148 {

    // Helper function to print the linked list
    static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    static ListNode arrayToLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head; 
    }


    public static ListNode sortList_1(ListNode head) {
        int[] ans = linkedlist_to_arr(head);
        Arrays.sort(ans);
        return arrayToLinkedList(ans);
    }

    public static int[] linkedlist_to_arr(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        temp = head;
        int[] ans = new int[length];
        for (int i = 0; i < length; i++) {
            ans[i] = temp.val;
            temp = temp.next;
        }

        return ans;
        
    }

    // ---------------------------------------------------

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode mid_next = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(mid_next);


        return merge(left, right);
    }

    static ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0); 
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else if (right != null) {
            current.next = right;
        }

        return dummy.next; 
    }

    static ListNode getMid(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; 
    }

    public static void main(String[] args) {

        int[] arrll = {4,2,1,3};

        printLinkedList(sortList(arrayToLinkedList(arrll)));
    }
}
