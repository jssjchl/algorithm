package backjoon;

import java.util.Scanner;

public class B15596_integerCountN {

    static long sum(int[] a){
        long ans= 0;
        for(int i =0; i <a.length; i++){
            ans += a[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        sum(arr);
    }
}
