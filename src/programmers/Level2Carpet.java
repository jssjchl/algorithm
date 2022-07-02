package programmers;

public class Level2Carpet {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow; //내가 생각해낸 것 
        int[] answer = new int[2];

        for (int i = 1; i <= sum; i++) { //생각하지 못한 것
            int w = i;
            int h = sum / i;

            if (w > h) {
                continue;
            }

            if ((w - 2) * (h - 2) == yellow){
                answer[0] = h;
                answer[1] = w;
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }
    //다른 방식으로 다시 풀어보자
    public static void main(String[] args) {
        Level2Carpet a = new Level2Carpet();
        System.out.println(a.solution(10, 2));
    }
}
