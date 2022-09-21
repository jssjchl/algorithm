import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int s = input;

        for (int i = 0; i < input; i++) {
            for (int z = 1; z < s - i; z--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}
