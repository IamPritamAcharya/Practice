class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class leetcode2807 {
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


    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;

        while (temp.next != null) {
            ListNode temp2 = new ListNode(gcd(temp.val, temp.next.val));
            temp2.next = temp.next;
            temp.next = temp2;
            temp = temp.next.next;
        }


        return head;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static void main(String[] args) {
        int[] arr = {7};
        ListNode head = insertGreatestCommonDivisors(arrayToLinkedList(arr));
        printLinkedList(head);
    }
}
