import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class leetcode234 {
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

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; 
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode rev = reverseLinkedList(slow);

        ListNode temp = head;
        while (rev != null) {
            if (rev.val != temp.val) {
                return false;
            }
            rev = rev.next;
            temp = temp.next;
        }
    
        return true;
    }
    
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
    
        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
    
        return prev;
    }
    

    public static void main(String[] args) {
        int[] arr = {1,2};
        
        System.out.println(isPalindrome(arrayToLinkedList(arr)));
    }
}
