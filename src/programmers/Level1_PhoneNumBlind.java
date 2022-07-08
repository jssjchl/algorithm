package programmers;

public class Level1_PhoneNumBlind {
    public String solution(String phone_number) {
        String answer = "";
        String front = (phone_number.substring(0, phone_number.length() - 4)).replaceAll(".", "*");
        String back = phone_number.substring(phone_number.length() - 4);
        answer = front + back;
        return answer;
    } //내 풀이

    class Solution {
        public String solution(String phone_number) {
            char[] ch = phone_number.toCharArray();
            for(int i = 0; i < ch.length - 4; i ++){
                ch[i] = '*';
            }
            return String.valueOf(ch);
        }
    } //남의 풀이가 너무 좋아서,,,

    public static void main(String[] args) {
        Level1_PhoneNumBlind a = new Level1_PhoneNumBlind();
        System.out.println(a.solution("01033334444"));
    }
    //07.05
}
