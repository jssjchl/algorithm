package programmers;

public class level1_dotProduct {

    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++){
            answer += (a[i] * b[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        level1_dotProduct a = new level1_dotProduct();
        int z[] = {-1, 0, 1};
        int x[] = {1, 0 ,-1};
        System.out.println(a.solution(z, x));
    }
}
