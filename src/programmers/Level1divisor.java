package programmers;

public class Level1divisor {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Level1divisor a = new Level1divisor();

        System.out.println(a.solution(12));
    }
}
