import java.util.Scanner;

public class b2577 {
    public static void main(String[] args) {

        int str[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // A
        int b = sc.nextInt(); // B
        int c = sc.nextInt(); // C

        int result = a * b * c;

        String ptr = String.valueOf(result);

        for(int i = 0; i <ptr.length(); i ++){
            str[ptr.charAt(i) -48]++; //48혹은 '0'을 빼야한다 이유는 아스키코드
        }
        // str[] 의 속에 ptr.charAt(i)를 통해 대응하는 값에 인덱스에 ++로 인덱스값을 증가시킨다.
        //
        for(int i = 0; i<str.length; i++){
            System.out.println(str[i]);
        }
    }
}