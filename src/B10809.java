import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[26]; //알파벳 갯수만큼 배열 설정
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1; //모든 알파벳은 일단 -1
        }
        String s = br.readLine();// 입력받음
        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i); //한글자씩 쪼갬
            if (arr[word - 'a'] == -1) {// (쪼갠 글자 -a) == 소문자만 들어갈테니까 첫 숫자 a를 빼서 알파벳 배열과 비교한다
                                        //ex) s의 첫 글자가 a라면 a-a = 0 arr[0] = a다
                arr[word - 'a'] = i;   // 이 때 i는 s의 몇 번째 글자이냐는 것, 3번째 글자면 arr[0] =3이된다.
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] +" ");
        }
    }
}
