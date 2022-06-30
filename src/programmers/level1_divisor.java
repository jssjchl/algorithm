package programmers;

public class level1_divisor {
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
        level1_divisor a = new level1_divisor();

        System.out.println(a.solution(12));
    }
}
