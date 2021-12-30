import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int N = sc.nextInt();
        String number = sc.next();
        for(int i =0; i <N ; i++){
            String [] a = number.split("");
            int s = Integer.parseInt(a[i]);
            sum = sum +s;
        }
        System.out.println(sum);
    }
}
