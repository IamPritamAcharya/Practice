class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class leetcode61 {
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

    static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int length = getLength(head);
        k = k % length;

        if (k == 0) {
            return head;
        }

        int diff = length - k;
        ListNode prev = null;
        ListNode temp = head;
        while (diff > 0) {
            prev = temp;
            temp = temp.next;
            diff--;
        }

        prev.next = null;
        ListNode newHead = temp;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;

        return newHead;
    }

    private static int getLength(ListNode head) {
        ListNode temp = head;
        int lenght = 0;

        while (temp != null) {
            temp = temp.next;
            lenght++;
        }

        return lenght;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        int k = 4;
        ListNode ans = rotateRight(arrayToLinkedList(arr), k);
        printLinkedList(ans);
    }
}
