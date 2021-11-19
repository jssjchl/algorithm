import java.io.*;

public class B11021 {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i <t; i ++){
            String c= "Case #";
            String s = br.readLine();
            int A =Integer.parseInt(s.split(" ")[0]); // 문자열을 개행을 기준으로 spilt를 통해 나누어준다. 이 떼 첫 번째 자리[0]
            int B =Integer.parseInt(s.split(" ")[1]); //두 번째 자리 [2]
            bw.write( c + (i+1)+ ": "+ (A+B) +"\n");

        }
        bw.flush();
    }
}
