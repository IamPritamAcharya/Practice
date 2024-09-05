import java.lang.reflect.Array;
import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class leetcode1290 {

    static int binary2decimal(ArrayList<Integer> num) {
        int ans =0;
        for (int i = 0; i < num.size(); i++) {
            ans += num.get(i) * Math.pow(2, num.size() - i - 1);
        }

        return ans;
    }

    static ArrayList<Integer> ll2arr(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        return arr;
    }

    public static int getDecimalValue(ListNode head) {
        return binary2decimal(ll2arr(head));
    }

    public static void main(String[] args) {
        ArrayList<Integer> binary = new ArrayList<>();
        binary.add(1);
        binary.add(0);
        binary.add(1);

        System.out.println(binary2decimal(binary));

    }
}
