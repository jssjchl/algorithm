package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Level1SmallNumDelete {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                list.add(arr[i]);
            }
        }
        if (list.size() < 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Level1SmallNumDelete a = new Level1SmallNumDelete();
        int[] arr = {3, 4, 1, 2};
        System.out.println(a.solution(arr));

    }
}
