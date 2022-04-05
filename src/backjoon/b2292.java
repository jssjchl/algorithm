package backjoon;

import java.util.Scanner;

public class b2292 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 2;
        int c = 1;
        if (n == 1) {
            System.out.println(1);
        } else {
            while (r <= n) {
                r = r + (6 * c);
                c++;
            }
            System.out.println(c);
        }
    }

}
//왜 이해가 안되지,,
//다시 풀어보자 내일