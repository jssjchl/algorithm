import java.util.Scanner;

public class B11047 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int coin = 0;
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            coin += k / arr[i];
            k %= arr[i];
        }
        System.out.println(coin);
        sc.close();
    }
}
