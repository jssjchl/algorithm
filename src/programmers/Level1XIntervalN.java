package programmers;

public class Level1XIntervalN {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <=n; i++) {
            answer[i-1] = x * i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Level1XIntervalN a = new Level1XIntervalN();
        System.out.println(a.solution(2, 5));
    }
    //07.04
}
