package programmers;

public class Level1dotProduct {

    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++){
            answer += (a[i] * b[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Level1dotProduct a = new Level1dotProduct();
        int z[] = {-1, 0, 1};
        int x[] = {1, 0 ,-1};
        System.out.println(a.solution(z, x));
    }
}
