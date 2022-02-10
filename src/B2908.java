import java.util.Scanner;

public class B2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        if(A.contains("0") || B.contains("0")){
            return;
        }
        StringBuffer a = new StringBuffer(A);
        StringBuffer b = new StringBuffer(B);

        String fn = a.reverse().toString();
        String tn = b.reverse().toString();

        int firstN= Integer.parseInt(fn);
        int twoN= Integer.parseInt(tn);
        if(firstN > twoN){
            System.out.println(firstN);
        }else
            System.out.println(twoN);
    }
}
