
public class b4673_selfNum {

    static int d(int number) {
        int sum = number;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean self[] = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int selfNumber = d(i);
            if (selfNumber < 10001) {
                self[selfNumber] = true;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if (!self[i]) {
                System.out.printf("%d\n", i);
            }
        }
    }

}
// 처음에 단순하게 규칙을 찾으려고 노력함. 2씩 늘어남 혹은 11씩 늘어남
// 하지만 의미없는 규칙도 있다. 단순하게 생각할 필요가 있을 때도 있음
// 처음 작성시 d 메소드 if문으로 다 작성했음 ,, ex) 1000이상일 때, 100이상일 때 ==너무 단순하게만 생각치도 말자
// boolean을 통해서 해결할 생각을 못했음,, 막연하게 나오는 값 제외하고 어떻게 출력하지 고민함
