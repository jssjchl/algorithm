package backjoon;

import java.util.Scanner;

public class B10250 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        for (int i = 0; i < z; i++) {
            int h = sc.nextInt();//층수
            int w = sc.nextInt();
            int n = sc.nextInt();//몇 번째 사람?

            int f = (n / h) + 1; // 호수
            int r = n % h; // 동수

            int x;
            if (r < 0) {
                x = 100 + f;
            } else if (r == 0) { //층수랑 n번째 방문자의 수가 같을 때
                x = (h * 100) + f -1; // n 번째 방문자는 맨 윗층, 그리고 호수의 몫이 1이 나와서 하나 다시 빼줘야함
            } else {
                x = (r * 100) + f;
            }

            System.out.println(x);
        }
    }
}

