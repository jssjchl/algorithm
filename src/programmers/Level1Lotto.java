package programmers;

public class Level1Lotto {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int rank = 6;
        int cnt = 0;
        int zeroC = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroC++;
            } else {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        cnt++;
                    }
                }
            }
        }
        if (cnt == 0 && zeroC == 0) {
            answer[0] = answer[1] = 6;
        } else {
            answer[0] = (rank - cnt - zeroC) + 1;

            if (cnt == 0) {
                answer[1] = 6;
            } else {
                answer[1] = (rank - cnt) + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Level1Lotto l = new Level1Lotto();
        int[] arr = {44, 1, 0, 0, 31, 25};
        int[] arr2 = {31, 10, 45, 1, 6, 19};
        System.out.println(l.solution(arr, arr2));

    }
}
