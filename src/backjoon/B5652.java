package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5652 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String arr[] = n.split("");
        int c=0;
        for(int i =0; i <n.length(); i++){
           switch (arr[i]){
               case "A" : case "B": case "C" :
                   c+=3;
                   break;
               case "D" : case "E": case "F" :
                   c+=4;
                   break;
               case "G" : case "H": case "I" :
                   c+=5;
                   break;
               case "K" : case "L": case "J" :
                   c+=6;
                   break;
               case "M" : case "N": case "O" :
                   c+=7;
                   break;
               case "P" : case "Q": case "R":  case "S":
                   c+=8;
                   break;
               case "T" : case "U": case "V" :
                   c+=9;
                   break;
               case "W" : case "X": case "Y" : case "Z":
                   c+=10;
                   break;
           }
        }
        System.out.println(c);
    }
}
