package programmers;

import java.util.Arrays;

public class Level1Greedy {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length; //전체인원 중 잃어버린 애 빼고

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++; //잃어버린 애랑 여벌을 가진 애가 같으니까 수업을 들을 수 있다
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        // 도난당한 학생에게 체육복 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){// 앞뒤 사람 비교
                    answer++; //빌려줄 수 있으면 수업을 들을 수 있다.
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Level1Greedy a = new Level1Greedy();

        int ar1[] = {1, 2};
        int ar2[] = {2, 3};
        System.out.println(a.solution(3, ar1, ar2));

    }
}
