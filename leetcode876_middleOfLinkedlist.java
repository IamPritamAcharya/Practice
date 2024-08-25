class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
// leetcode876_middleOfLinkedlist
public class leetcode876_middleOfLinkedlist {
    static ListNode convert_Array_to_Linkedlist(int[] arr) {
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

    // my approach
    public static ListNode middleNode1(ListNode head) {
        ListNode temp = head;

        int count = 0;

        while (temp!=null) {
            count++;
            temp = temp.next;
        }

        temp = head; 
        int traverse = 0;
        while (traverse!= (count/2)) {
            temp = temp.next;
            traverse++;
        }           
        return temp;
    }

    // best appraoch(tortoise)
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = convert_Array_to_Linkedlist(arr);
        print_Linkedlist(head);
        System.out.println(middleNode(head).val);
        
    }

}
