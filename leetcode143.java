public class leetcode143 {
    public static void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode mid = mid_of_ll(head);
        ListNode reverse_head = reverse_ll(mid.next);
        mid.next = null;

        while (reverse_head != null) {
            ListNode headnext = head.next;
            ListNode revNext = reverse_head.next;
            head.next = reverse_head;
            reverse_head.next = headnext;
            head = headnext;
            reverse_head = revNext;
        }
    }

    private static ListNode mid_of_ll(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private static ListNode reverse_ll(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        ListNode head = AAhelper.arrayToLinkedList(arr);
        reorderList(head);
        AAhelper.printLinkedList(head);

    }
}
