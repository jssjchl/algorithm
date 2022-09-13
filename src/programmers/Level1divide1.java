package programmers;

public class Level1divide1 {
    public int solution(int n) {
        int answer = 0;
        while(true){
            answer++;
            if(n % answer == 1){
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Level1divide1 l = new Level1divide1();

        System.out.println(l.solution(10));
    }
}
