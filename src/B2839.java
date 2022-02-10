import java.util.Scanner;

public class B2839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int b = 0;
        if (3 <= cnt && cnt <= 5000) {
            while (true) {
                if (cnt % 5 == 0) {
                    System.out.println(cnt / 5 + b);
                    break;
                } else if (cnt <= 0) {
                    System.out.println(-1);
                    break;
                }
                cnt -= 3;
                b++;
            }
        } else {
            System.out.println(-1);
        }
    }
}
