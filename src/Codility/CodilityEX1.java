package Codility;

import java.util.Stack;

public class CodilityEX1 {

    static class Solution {
        public int solution(int N) {
            String B = Integer.toBinaryString(N); //입력받은 N을 2진수로 바꿔서 문자열로 저장
            char arr[] = B.toCharArray(); // 저장된 문자열을 char형으로 뜯어서 배열에 하나씩 저장
            int max = 0; //1과 1 사이의 거리를 저장할 곳
            int total = 0; //큰 max값을 찾기 위해서 만든 변수
            for (int i = 0; i < arr.length; i++) { //문자열의 길이만큼 반복
                if (arr[i] == '1') { // 해당 문자에 1이 나왔을 때
                    if (max > total) // 1과 1사이의 거리가 더 클 때 ex 100101 -> 1001 =2->max=total= 2 101 =1 max=1
                        total = max; // 그 값을 total에 저장
                    max = 0;
                } else { //배열의 문자가 1이 아니면  ==0일 때
                    max++; //거리 하나씩 증가
                }
            }
            return total;
        }
    }

}
