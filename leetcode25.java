import java.time.temporal.Temporal;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class leetcode25 {
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


    static ListNode reverseLL(ListNode head) {

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
            
        }

        return head;
        
    }

    static ListNode FindKthNode(ListNode temp, int k) {
        k--;
        while (temp!= null && k > 0) {
            k--;
            temp = temp.next;
        }

        return temp;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;

        while (temp != null) {
            ListNode kthNode = FindKthNode(temp, k);
            
            if (kthNode == null) {
                if (prevNode != null) {
                    prevNode.next = temp;
                }
                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverseLL(temp);

            if (head == temp) {
                head = kthNode;
            } else {
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;

        }

        return head;
        
    }


    public static void main(String[] args) {
        int[] head = {1,2,3,4,5};
        int k = 2;

        printLinkedList(reverseKGroup(arrayToLinkedList(head), k));

    }
}
