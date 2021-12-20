import java.util.Scanner;

public class overAverage_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr; //배열 선언

        int tc = sc.nextInt(); //테스트 케이스 갯수선언

        for (int i = 0; i < tc; i++) {
            int student = sc.nextInt(); //학생 수 선언
            arr = new int[student]; //학생수만큼의 배열 크기 선언
                                    //학생 수만큼 점수를 입력하기 위함
            double sum = 0;

            for (int j = 0; j < student; j++) {
                int score = sc.nextInt(); // 학생 점수 입력받음
                arr[j] = score; //배열 인덱스에 맞춰 점수 입력
                sum += score; // 학생 점수 총합 저장
            }

            double average = (sum / student); // 학생 점수 평균
            double cnt = 0;

            for (int j = 0; j < student; j++) {
                if (average < arr[j]) { //학생 배열에서 평균값보다 큰 인덱스 찾기
                    cnt++; // 찾으면 카운트
                }
            }
            System.out.printf("%.3f%%\n", (cnt / student) * 100); // 평균값보다 큰 인덱스 갯수 찾아서 학생 수로 나눠줌 *100해서 백분율구함
        }
    }
}
//아니 이거 왜 테스트케이스가 다 입력이 안되고 중간에 띄어넘어가냐 해도 해도 안나와서
//답 찾아보고 그대로 써도 똑같은데 뭐가 문제지 도대체 답은 맞는데