import jdk.swing.interop.SwingInterOpUtils;

public class Jabis1 {
    public int[] solution(String[] students) {
        int[] answer = new int[students.length];

        while (true) {
            for (int i = 0; i < students.length; i++) {
                String[] s = students[i].split("");
                answer[i] = 10;
                int cnt = 0;
                int cnt2 = 0;
                for (int j = 0; j < s.length; j++) {
                    if (s[j].equals("A")) {
                        answer[i] += 1;
                    } else if (s[j].equals("L")) {
                        cnt++;
                        if(cnt % 3 == 0){
                            answer[i] -=1;
                        }
                    } else {
                        answer[i] -= 1;
                        cnt2++;
                        if(cnt2 == 3) {
                            answer[i] = 0;
                            break;
                        }
                    }
                }
            }
            break;
        }
        int[] rankArr = new int[answer.length];

        for(int i = 0; i<answer.length; i++) {
            rankArr[i] = 1;
            for(int j = 0; j<answer.length; j++) {
                if(answer[i] > answer[j]) {
                    rankArr[i] = rankArr[i] + 1;
                }
            }
        }

        for(int i = 0; i<answer.length; i++) {
            System.out.println(rankArr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Jabis1 jabis1 = new Jabis1();
        String arr[] = {"AAALLLPAA", "AAAAAAAPPP", "ALAAAAPAAA"};
        int a[] = jabis1.solution(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
