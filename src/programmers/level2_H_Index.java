package programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class level2_H_Index {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (h <= citations[i]) {
                answer = h;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        level2_H_Index a = new level2_H_Index();
        int[] arr = {1, 2, 3};
        System.out.println(a.solution(arr));
    }

}
