import java.util.Scanner;

public class Class3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수 10개를 입력하시오");

        int s[] = new int[10];
        for (int i = 0; i < 10; i++) {
            s[i] = sc.nextInt();
        }
        System.out.print("3의 배수는");
        for (int i = 0; i < s.length; i++) {
            if (s[i] % 3 == 0) {
                System.out.print(s[i] + " ");
            }
        }

    }
}
