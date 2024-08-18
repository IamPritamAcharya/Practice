public class leetcode2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] op = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(op));
    }
}
