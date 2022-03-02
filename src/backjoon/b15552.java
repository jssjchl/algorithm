package backjoon;

import java.io.*;

public class b15552 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        int T =Integer.parseInt(br.readLine());

        for(int i=0; i<T;i++) {
            String s = br.readLine(); //문자열 s를 입력받음
            int A =Integer.parseInt(s.split(" ")[0]); // 문자열을 개행을 기준으로 spilt를 통해 나누어준다. 이 떼 첫 번째 자리[0]
            int B =Integer.parseInt(s.split(" ")[1]); //두 번째 자리 [2]
            bf.write(A+B+ "\n");// bf에 저장되어있는 문자를 한 줄씩 띄어서 저장한다.
        }
        bf.flush(); //저장되어 있는 문자 출력한다.
    }
}
