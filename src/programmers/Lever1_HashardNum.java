package programmers;

public class Lever1_HashardNum {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        int sum = 0;
        boolean answer = true;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            sum += Character.getNumericValue(arr[i]);
        }
        System.out.println(sum);
        if(x % sum != 0){
            answer = false;
        }
        return answer;
    } // 내가 푼 방식

    public boolean solution2(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        return x % sum == 0;
    } // 남이 푼 방식

    public static void main(String[] args) {
        Lever1_HashardNum a = new Lever1_HashardNum();
        System.out.println(a.solution2(12));
    }
    // 07.05
}
