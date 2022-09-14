import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String arr[] = input.split("]");
        String requiredString = "";

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            requiredString = arr[i].substring(arr[i].indexOf("[ ") + 1);
            String[] s = requiredString.split(",");
            for (int j = 0; j < s.length; j++) {
                list.add(s[j].trim());
            }
        }
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!result.contains(list.get(i))) {
                result.add(list.get(i));
            }
        }
        String regex = "(.*)\\[(.*)\\]";
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
            System.out.println(String.valueOf(i + 1));
            if(input.matches(regex)){
                input = input.replace(  result.get(i), String.valueOf(i + 1));
            }
        }
        System.out.println(input);

        for (int i = 0; i < result.size(); i++) {
            System.out.println();
            System.out.println(String.format("[%d] %s", i + 1, result.get(i)));
        }
    }
}
