package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int cnt[] = new int[26]; //알파벳의 갯수, 입력되는 문자열의 대소문자를 구분하지 않고 카운트할 용도

        char[] arr = s.toCharArray(); //문자열 쪼개기

        for (int i = 0; i < arr.length; i++) { //입력받은 문자열 길이만큼
            if (arr[i] >= 97 && arr[i] <= 122) { //소문자가 입력되면 97~122
                cnt[arr[i] - 97]++;
            } else{ //대문자가 입력되면 65~90
                cnt[arr[i] - 65]++;
            }
        }
        int max = -1; //중복입력된 문자의 최대값 초기화
        char ch = '?'; // 중복된 문자의 횟수가 동일할 경우

        for (int i = 0; i < 26; i++) {

            if (cnt[i] > max) {
                max = cnt[i];
                ch = (char) (i + 65);
            }
            else if(cnt[i] ==max){
                ch ='?';
            }
        }
        System.out.println(ch);
    }
}
