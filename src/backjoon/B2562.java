package backjoon;

import java.io.*;

public class B2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        int c= 0;
        int maxvalue =0;
        int [] arr = new int[9];
        for(index =0; index<9; index++){
            arr[index] = Integer.parseInt(r.readLine());
            if(arr[index]>maxvalue){
                maxvalue =arr[index];
                c = index+1;
            }
        }
        System.out.println(maxvalue);
        System.out.println(c);
    }
}
