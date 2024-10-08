class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class leetcode2181 {
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

    public static ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(head.val);
        ListNode head_ans = ans;
        ListNode temp = head;

        int sum = 0;

        while (temp!=null) {
            if (temp.val == 0) {
                ans.next = new ListNode(sum);
                ans = ans.next;
                sum = 0;
            }
            sum += temp.val;
            temp = temp.next;
        }

        return head_ans.next.next;
    }

    public static void main(String[] args) {
        int head[] = {0,3,1,0,4,5,2,0};
        ListNode ans = mergeNodes(convert_Array_to_Linkedlist(head));

        print_Linkedlist(ans);

    }
    
}