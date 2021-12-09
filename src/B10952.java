import java.util.Scanner;

public class B10952 {
    public static void main(String[] args)  {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = n;
        while(true) {
            n = ((n % 10) * 10 + ((n / 10) +( n % 10))% 10);
            cnt++;
            if(n ==T){
                break;
            }
        }
        System.out.println(cnt);
    }
}
