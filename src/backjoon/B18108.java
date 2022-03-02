package backjoon;

import java.util.Scanner;

public class B18108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            if (n >= 1000 && n <= 3000) {
                System.out.println(n - 543);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
