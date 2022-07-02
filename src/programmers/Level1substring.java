package programmers;

import java.util.Arrays;

public class Level1substring {

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
        Level1substring a = new Level1substring();
        System.out.println(a.solution(123));
    }
}

