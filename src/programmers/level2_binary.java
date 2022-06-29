package programmers;

public class level2_binary {
    public int solution(int n) {
        int nBi = Integer.bitCount(n); // biCount == 2진수를 구할 때 1의 갯수를 구해준다.
        for (int i = 1 + n; ; i++) {
            if(Integer.bitCount(i) == nBi){
                return i;
            }
        }
    }

    public static void main(String[] args) {
        level2_binary a = new level2_binary();
        System.out.println(a.solution(12));
    }
}
