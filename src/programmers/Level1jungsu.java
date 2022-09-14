package programmers;

public class Level1jungsu {
    public long solution(long n) {
        long answer = 0;
        while (true) {
            answer ++;
            if (answer * answer > n) {
                answer = -1;
                break;
            } else if (answer * answer == n) {
                answer = (answer+1) * (answer + 1);
                break;
            }
        }
        return answer;

//        if (Math.pow((int)Math.sqrt(n), 2) == n) { //제곱근으로 풀 수 있다..
//            return (long) Math.pow(Math.sqrt(n) + 1, 2);
//        }
//
//        return -1;
    }

    public static void main(String[] args) {
        Level1jungsu l = new Level1jungsu();

        System.out.println(l.solution(121));
    }
}
