package programmers;

public class Level1AddDigit {
    public int solution(int n) {
        String a = String.valueOf(n);
        String b[] = a.split("");
        int answer = 0;
        for (int i = 0; i < b.length; i++) {
            answer += Integer.parseInt(b[i]);
        }
        return answer;
    }

    public static void main(String[] args) {

        Level1AddDigit a = new Level1AddDigit();

        System.out.println(a.solution(987));

    }
}
