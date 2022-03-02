package backjoon;

import java.util.Scanner;

public class B1065_hanNumber {

    static int han(int n) {
        int cnt = 0;

        if (n < 100) {
            return n;
        } else {
            cnt = 99;

            if (n == 1000) {
                n = 999;
            }

            for (int i = 100; i <= n; i++) {
                int one = i % 10;
                int ten = (i / 10) % 10;
                int hundred = i / 100;
                if ((hundred - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(han(N));
    }
}

