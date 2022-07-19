package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Level1IntegerDesc {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Integer arr2[] = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr2, Collections.reverseOrder());
        String answer = "";
        for (int i = 0; i < arr2.length; i++) {
            answer += String.valueOf(arr2[i]);
        }
        return Long.parseLong(answer); //long이 아니라 integer로 변환하면 런타임 에러뜸..
    }

    public static void main(String[] args) {
        Level1IntegerDesc a = new Level1IntegerDesc();

        System.out.println(a.solution(118372));
    }
}
