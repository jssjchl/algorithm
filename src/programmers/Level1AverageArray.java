package programmers;

public class Level1AverageArray {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
            System.out.println(arr[i]);
        }
        answer = answer / arr.length;
        return answer;
    }

    public static void main(String[] args) {
        Level1AverageArray a = new Level1AverageArray();
        int [] arr = {1, 2 ,3, 4};
        System.out.println(a.solution(arr));
    }
}
