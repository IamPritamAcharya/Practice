public class leetcode1614 {
    public static int maxDepth(String s) {
        int count_left = 0;
        int count_right = 0;
        int depth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count_left++;
            } else if (c == ')') {
                count_right++;
            }
            depth = Math.max(depth, count_left-count_right);

        }
        
        return depth;
    }

    public static void main(String[] args) {
        String str = "(1+(2*3)+((8)/4))+1";
        
        System.out.println(maxDepth(str));
    }

}
