public class leetcode206_reverseLinkedList {
    public static ListNode reverseLL_byIteration(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;

        }

        return prev;
    }
    public static ListNode reverseLL_byRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseLL_byRecursion(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = linkedlistinfo.convert_Array_to_Linkedlist(arr);
        linkedlistinfo.print_Linkedlist(head);
        head = reverseLL_byRecursion(head);
        linkedlistinfo.print_Linkedlist(head);
    }

}
