package programmers;

public class Level1_NaturalNumReverse {

    public int[] solution(long n) {
        String s = String.valueOf(n);

        StringBuffer sb = new StringBuffer(s);
        String reverseS = sb.reverse().toString();
        String arr[] =  reverseS.split("");

        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Level1_NaturalNumReverse a = new Level1_NaturalNumReverse();
        System.out.println(a.solution(12345));
    }

}

