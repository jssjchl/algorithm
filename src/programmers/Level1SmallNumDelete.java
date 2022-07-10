package programmers;

import java.util.Arrays;

public class Level1SmallNumDelete {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];

        if (arr.length < 1) {
            answer[0] = -1;
        }
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            if (min > a) {
                min = a;
            }
        }
        int index = 0;
        for (int a : arr) {
            if (min != a) answer[index++] = a;
        }
        return answer;
    }

    public static void main(String[] args) {
        Level1SmallNumDelete a = new Level1SmallNumDelete();
        int[] arr = {4, 3, 2, 1};
        System.out.println(a.solution(arr));
    }
}
