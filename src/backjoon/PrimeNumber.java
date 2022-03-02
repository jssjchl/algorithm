package backjoon;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =0;

        for(int i =0; i <n; i++){
            boolean prime = true;
            int p = sc.nextInt();

            if(p <2){
                continue;
            }
            for (int j =2; j < p-1; j++){
                if(p %j ==0){
                    prime =false;
                    break;
                }
            }
            if(prime){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
