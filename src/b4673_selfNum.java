
public class b4673_selfNum {

    static int d(int n) {
        int sum = n; //들어오는 수의 값 저장
        while (n > 0) { //들어온 수가 0이 될 때까지
            sum += n % 10; // 들어온 수에 10으로 나눈 나머지를 더해준다 ex)821 + 821 % 10 = 1  == 821 + 1
            n = n / 10; // 들어온 수를 10으로 나누어 위에서 더해준 나머지를 제거한다. 이것을 들어온 수가 0이 될 때 까지 반복
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean[] self = new boolean[10001]; // 체크용도로 boolean 함수 선언

        for (int i = 1; i < 10001; i++) { // 10000개의 숫자 확인
            int insert = d(i); //1씩 다 넣어볼 것임
            if (insert < 10001) { // 10000보다 작은 수만 필요함
                self[insert] = true; //10000보다 작은 수는 true로 바꿔짐 == false만 출력예정
            }
        }
        for (int i = 1; i < 10001; i++) { // 10000번 반복문돌려주고
            if (!self[i]) // false인 인덱스만 출력
                System.out.printf("%d\n", i);
        }
    }
}
// 처음에 단순하게 규칙을 찾으려고 노력함. 2씩 늘어남 혹은 11씩 늘어남
// 하지만 의미없는 규칙도 있다. 단순하게 생각할 필요가 있을 때도 있음
// 처음 작성시 d 메소드 if문으로 다 작성했음 ,, ex) 1000이상일 때, 100이상일 때 ==너무 단순하게만 생각치도 말자
// boolean을 통해서 해결할 생각을 못했음,, 막연하게 나오는 값 제외하고 어떻게 출력하지 고민함
