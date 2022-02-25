import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        String number[] = {"0","1","2","3","4","5","6","7","8","9"};
        String word[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i =0; i <number.length; i++){
            n =n.replace(word[i], number[i]);
        }
        System.out.println(n);
    }
}
