import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        int v = a *b*c;
        String s = String.valueOf(v);

    }
}
