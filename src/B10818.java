import java.util.Arrays;
import java.util.Scanner;

public class B10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int i, maxvalue= -1000000, minvalue=1000000;

        for(i = 0; i <n; i++) {
            a[i]=sc.nextInt();
//            if(a[i] > maxvalue){
//                maxvalue = a[i];
//            }
//            if(a[i] < minvalue){
//                minvalue = a[i];
//            } ----> 방법 1 최댓값 최솟갑을 배열에서 찾아서
        }
        Arrays.sort(a); // 방법 2 배열을 오름차순으로 정렬
        System.out.println(a[0] + " " + a[n-1]);
    }
}
