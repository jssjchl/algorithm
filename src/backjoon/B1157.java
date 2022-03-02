package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int word[] = new int[26];
        String s = br.readLine();
        if (s.length() > 1000000) {
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (65 <= s.charAt(i) && s.charAt(i) <= 90) { //대문자
                word[s.charAt(i) - 65]++;
            } else
                word[s.charAt(i) - 97]++;
        }
        int max = -1;

        char c = '?';
        for (int i = 0; i < word.length; i++) {
            if (max < word[i]) {
                max = word[i];
                c = (char) (i + 65);
            } else if (word[i] == max) {
                c = '?';
            }
        }
        System.out.println(c);
    }
}
