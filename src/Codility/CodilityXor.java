package Codility;


class CodilityXor {
    public int solution(int[] A) {
        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            answer ^= A[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        CodilityXor c = new CodilityXor();
        int[] N = {9, 3, 9, 3, 9, 7, 9, 7, 6};
        System.out.println(c.solution(N));
    }
}


