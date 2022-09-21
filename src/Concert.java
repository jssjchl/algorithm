import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Concert {
    private String S[] = {"___","___","___","___","___","___","___","___","___","___", };
    private String A[] = {"___","___","___","___","___","___","___","___","___","___", };
    private String B[] = {"___","___","___","___","___","___","___","___","___","___", };
    private static Scanner sc = new Scanner(System.in);

    void reservation(int i){
        switch (i){
            case 1:
                for (int j = 0; j <S.length; j++){
                    System.out.print(S[j] + "");
                }
            case 2:
                for (int j = 0; j <S.length; j++){
                    System.out.print(A[j] + "");
                }
            case 3:
                for (int j = 0; j <S.length; j++){
                    System.out.print(B[j] + "");
                }

        }
    }
    void cancel(){

    }

    public static void main(String[] args) {
        Concert concert = new Concert();
        while(true){
            System.out.println("명품 콘서트 예약시스템입니다.");
            System.out.println("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4  ");
            int num = sc.nextInt();

            switch (num){
                case 1:
                    System.out.println("좌석구분 S(1),A(2),B(3)");
                    int n = sc.nextInt();
                    concert.reservation(n);
                case 2:
                    System.out.println("좌석구분 S(1),A(2),B(3)");
                    n = sc.nextInt();
                    concert.reservation(n);
                case 3:
                    System.out.println("좌석구분 S(1),A(2),B(3)");
                    n = sc.nextInt();
                    concert.reservation(n);
            }

        }
    }
}
