package Codility;

public class CodilityArray {
    static class Solution {
        public int[] solution(int[] A, int K) {

            for (int j = 0; j < K; j++) { //K번만큼 시프트
                int max = A[A.length - 1]; //맨뒤의 값을 맨 앞으로 보내기 위해서 저장
                for (int i = A.length - 2; i >= 0; i--) {
                    // 맨뒷값은 앞으로 보내기 위해 저장(비었다고 생각해도 됨, 고로 맨뒤의 바로 앞배열부터 채우면됨
                    A[i + 1] = A[i];
                    //맨처음 A[i+1] = 맨뒷자리 = A[3]
                    //A[3] = A[2] ...
                }
                A[0] = max; //맨 앞자리에 반복문 초반에 저장해둔 맨뒷값을 넣어줌
            }
            return A;
        }
    }
}
