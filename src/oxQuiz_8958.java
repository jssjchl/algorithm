import java.util.Scanner;

public class oxQuiz_8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] ox = new String[n];

        for (int i = 0; i < ox.length; i++) {
            ox[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < ox[i].length(); j++) {
                if (ox[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}