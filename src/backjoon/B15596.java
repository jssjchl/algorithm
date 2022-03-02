package backjoon;

import java.util.Scanner;

public class B15596 {
    static int B15596(int n){

        int a[] = new int[n];
        int sum= 0;
        for(int i =0; i <a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(B15596(n));
    }
}
