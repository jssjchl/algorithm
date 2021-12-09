import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class kakao {
    public int cakao(String s) {
        int answer = 0;
        String n[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String a[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i <10; i++){
            s= s.replace(n[i], a[i]);
        }
        return Integer.parseInt(s);
    }
}
