import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String arr[] = input.split(" ");
        int answer = 0;
        int[] nums = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
        if(nums[0] + nums[2] < nums[1]){
            answer = (nums[0] + nums[2]) * 2;
        }
        else if(nums[1] + nums[2] < nums[0]){
            answer = (nums[1] + nums[2]) *2 ;
        }
        else{
            for (int i = 0; i < nums.length; i++) {
                answer += nums[i];
            }
            if(answer % 2 == 1){
                answer -=1;
            }
        }
        System.out.println(answer);
    }
}
