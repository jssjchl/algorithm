package programmers;

import java.util.Arrays;

public class level1_substring {

    public int[] solution(long n) {
        String s = String.valueOf(n);
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        String[] a = reverse.split("");
        System.out.println(a);
        int[] answer = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
        return answer;
    }

    public static void main(String[] args) {
        level1_substring a = new level1_substring();
        System.out.println(a.solution(123));
    }
}

