import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class leetcode2130 {
    public static ListNode convert_Array_to_Linkedlist(int[] arr) {
        ListNode head =  new ListNode(arr[0]);
        ListNode mover = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp; 
            mover = temp;
        }

        return head;
    }
    static void print_Linkedlist(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
        
    }

    static ListNode reverse_Linkedlist(ListNode head) {
        ListNode curr = head, prev = null, next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        int ans = Integer.MIN_VALUE;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = reverse_Linkedlist(slow);
        ListNode head1 = head;

        while (head2 != null) {
            ans = Math.max(ans, head1.val+head2.val);
            head1 = head1.next;
            head2 = head2.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] head = {5,4,2,1};
        int ans = pairSum(convert_Array_to_Linkedlist(head));
        System.out.println(ans);
    }
}
