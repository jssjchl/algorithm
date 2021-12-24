import java.util.Scanner;

public class oxQuiz_8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //배열의 크기를 입력
        String[] ox = new String[n];

        for (int i = 0; i < ox.length; i++) {
            ox[i] = sc.next(); //테스트케이스 입력 ex)OOXXOOXOOX 등 next() == 문자열
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < ox[i].length(); j++) { //입력받은 배열의 0, 1 ,,등 길이를 구해 그 길이만큼 돌림
                if (ox[i].charAt(j) == 'O') { //charAt을 이용하여 문자열에 O문자를 찾음
                    cnt++; //찾을 때마다 하나씩늘림, 연속되면 값이 더 늘어남
                } else {
                    cnt = 0; //X가 나오면 cnt 값 초기화
                }
                sum += cnt; //cnt 값을 다 더해줌
            }
            System.out.println(sum);
        }
    }
}
//처음에는 배열에 문자열을 입력받을 생각을 안하고, 여러개의 배열을 선언할 방법을 궁리하였다.
//하지만 charAt을 통해 입력받은 문자열을 하나씩 대조해보는 방식으로 구현
