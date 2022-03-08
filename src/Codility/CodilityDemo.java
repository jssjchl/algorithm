package Codility;

import java.util.Arrays;

public class CodilityDemo {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int r = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] == r)
                r++;
        }
        if (A[A.length - 1] <= 0)
            return 1;
        return r;
    }
    public static void main(String[] args) {
        CodilityDemo c = new CodilityDemo();
        int[] N = {3, 1, -3, -1};
        System.out.println(c.solution(N));
    }
}
