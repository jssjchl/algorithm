package backjoon;

import java.util.Scanner;

public class B1193 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int up = 1;
        int down = 1;
        int x = 0;
        int cnt = 0;

        while (cnt < N) {
            x++;
            cnt = x * (x + 1) / 2; //몇 번째 행인지 찾는 코드
        }
        int num = N - (x - 1) * x / 2; //행에서 몇 번째인지 찾는 코드

        if (x % 2 == 0) {
            up = num;
            down = x - num + 1;
        } else {
            up = x - num + 1;
            down = num;
        }
        System.out.println(up + "/" + down);
    }
}
