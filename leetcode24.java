public class leetcode24 {
    public static ListNode swapPairs(ListNode head) {
        helper(head);
        return head;
    }

    public static void helper(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        int temp = head.val;
        head.val = head.next.val;
        head.next.val = temp;
        
        swapPairs(head.next.next);
    }

    public static void main(String[] args) {
        int[] head = { 1, 2, 3, 4 };
        ListNode root = AAhelper.arrayToLinkedList(head);
        AAhelper.printLinkedList(swapPairs(root));
    }
}
