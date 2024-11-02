public class leetcode2490 {
    public static boolean isCircularSentence(String sentence) {
        boolean isCircular = true;

        String senterncearr[] = sentence.split(" ");

        for (int i = 0; i < senterncearr.length-1; i++) {
            if (senterncearr[i].charAt(senterncearr[i].length()-1) != senterncearr[i+1].charAt(0)) {
                isCircular = false;
                break;
            }
        }

        if (senterncearr[0].charAt(0) != senterncearr[senterncearr.length - 1].charAt(senterncearr[senterncearr.length - 1].length() -1)) {
            isCircular = false;
        }


        return isCircular;
    }

    public static void main(String[] args) {
        String sentence = "Leetcode is cool";
        System.out.println(isCircularSentence(sentence));
    }
}
