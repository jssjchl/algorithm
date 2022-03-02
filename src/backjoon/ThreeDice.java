package backjoon;

import java.util.Scanner;

public class ThreeDice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n[] = new int[3];

        for (int i = 0; i < 3; i++) {
            n[i] = sc.nextInt();
        }
        int max = n[0];
        for (int j = 0; j < n.length; j++) {
            if (max < n[j]) {
                max = n[j];
            }
        }
        if (n[0] == n[1] && n[1] == n[2]) {
            System.out.println(10000 + n[0] * 1000);
        } else if ((n[0] == n[1] && n[0] != n[2])) {
            System.out.println(1000 + n[0] * 100);
        } else if ((n[0] == n[2] && n[0] != n[1])) {
            System.out.println(1000 + n[0] * 100);
        } else if (n[1] == n[2] && n[0] != n[1]) {
            System.out.println(1000 + n[1] * 100);
        } else
            System.out.println(max * 100);
    }
}
