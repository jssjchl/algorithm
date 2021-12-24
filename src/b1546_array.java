import java.util.Scanner;

public class b1546_array {

    public static void main(String[] args) {
        int i;
        double average = 0, max =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] subject = new double[n];
        for (i = 0; i < n; i++) {
            double s = sc.nextDouble();
            subject[i] = s;
            if(max <subject[i]){
                max = subject[i];
            }
        }
        for (i = 0; i < n; i++) {
            subject[i]= (subject[i] /max *100);
            average +=subject[i];
        }
        System.out.println(average/subject.length);
    }

    //문제를 제대로 안읽고 int형으로 했을 때랑 값이 범위 차이가 굉장히 커서
    // 답이 틀린 줄 알았음,,double형으로 풀어보니 바로 답이 나옴
}
