package programmers;

public class Level2Collatz {
    public int solution(int num) {
        //입력값을 long으로 해야하는게 맞음
        //3번째 케이스에서 626331일 때  int에 저장할 수 있는 값의 범위를 넘어서게 되어서 488을 리턴하는 것임
        int answer = 0;
        if (num == 1) {
            return 0;
        }
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;

            }
            answer++;
            if (answer == 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
//    public int solution(int num) { //
//        int answer = 0;
//        if (num == 1) {
//            return 0;
//        }
//        while (num != 1) {
//            if (num % 2 == 0) {
//                num = num / 2;
//            } else if(num  % 2 ==1){ //else로 하면 488 , else if로 하면 답나옴..
//                num = (num * 3) + 1;
//            }
//            answer++;
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        Level2Collatz a = new Level2Collatz();
        System.out.println(a.solution(626331));
    }
}
