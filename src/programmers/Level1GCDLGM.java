package programmers;

public class Level1GCDLGM {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[1] = n * m;

        while (m != 0) { //유클리드 호제법, 시간복잡도는 O(n) = > 최대공약수를 구하는 알고리즘
            int r = n % m;  //r을 선언해서 두 자연수를 나눈 나머지값을 구한다
            n =m; // 나눈 값을
            m =r; //나눈 나머지값으로 다시 나눠줌을 반복
        }
        // ex 3 12
        // 3 % 12 ==3
        // n =12 m = 3
        // 12 % 3 == 0
        // n =3 m =0
        // = > n = 최대공약수

        System.out.println(n);
        answer[0] = n;
        answer[1] /= n;
        //두자연수의 최대공약수가 G, 최소공배수가 L일 때
        //최소공배수는 자연수 * 자연수 / 최대공약수
        //최대공약수는 자연수 * 자연수 / 최소공배수
        return answer;
    }

    public static void main(String[] args) {
        Level1GCDLGM a = new Level1GCDLGM();
        System.out.println(a.solution(3, 12));
    }

}
