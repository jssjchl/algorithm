import java.util.Scanner;

public class OvenTimer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt() + sc.nextInt();
        if(m  >=60){
            h+=m/60;
            m %=60;
            if(h >23){
                h -=24;
            }
        }
        System.out.println(h + " " + m);

    }
}
