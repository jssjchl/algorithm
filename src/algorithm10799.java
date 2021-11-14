import java.util.Scanner;
import java.util.Stack;

public class algorithm10799 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lager = sc.next();
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for(int i = 0; i <lager.length(); i ++) {
            if(lager.charAt(i) == '(') {
                stack.push(i);
            }else {
                if(stack.pop() == i-1)
                    count += stack.size();
                else
                    count +=1;
            }
        }
        System.out.println(count);
        sc.close();
        return;
    }
}
