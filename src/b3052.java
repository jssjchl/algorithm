import java.util.Scanner;

public class b3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int s[] = new int[10];
        for (int i = 0; i < 10; i++) {
            s[i] = sc.nextInt() % 42;
        }
        for (int i = 0; i < s.length; i++){
            int temp= 0;
            for(int k = i+1; k <s.length; k++){
                if(s[i] == s[k]){
                    temp++;
                }
            }
            if(temp ==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
