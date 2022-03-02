package backjoon;

import java.util.Scanner;

public class B2675 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //문자열 갯수

        for (int i = 0; i < t; i++) {

            int r = sc.nextInt(); // 반복횟수
            String s = sc.next(); //반복문자열

            for (int j = 0; j < s.length(); j++) {
                for (int c = 0; c < r; c++) { //r만큼 반복
                    System.out.print(s.charAt(j)); // j번째 글자를
                }
            }
            System.out.println();
        }
    }
}
