
public class Jobda {
    public String solution(String[][] ADInfos, String[][] logs) {
        String answer = "";
        int c = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i][0].equals("C")) {
                for (int j = 0; j < ADInfos.length; j++) {
                    if (ADInfos[j][0].equals(logs[i][1])) {
                        if (c < Integer.parseInt(ADInfos[j][2])) {
                            c = Integer.parseInt(ADInfos[j][2]);
                            answer = ADInfos[j][0];
                        }
                        else if(c == Integer.parseInt(ADInfos[j][2])){
                            c = Integer.parseInt(ADInfos[j][2]);
                            answer = "-1";
                        }
                    }
                }
            } else {
                for (int j = 0; j < ADInfos.length; j++) {
                    if (ADInfos[j][0].equals(logs[i][1])) {
                        if (c < Integer.parseInt(ADInfos[j][1])) {
                            c = Integer.parseInt(ADInfos[j][1]);
                            answer = ADInfos[j][0];
                        }
                        else if(c == Integer.parseInt(ADInfos[j][1])){
                            c = Integer.parseInt(ADInfos[j][1]);
                            answer = "-1";
                        }
                    }
                }
            }
        }
        return answer;
    }

    //    [광고 ID, 시청 단가, 클릭 단가]
//
//    1. 시청 : V
//    2. 클릭 : C
    public static void main(String[] args) {
        Jobda j = new Jobda();
        String infoList[][] = {{"A", "5", "20"}, {"B", "3", "5"}};
        String logList[][] = {{"C", "A"}, {"V", "B"}, {"C", "B"}};
        System.out.println(j.solution(infoList, logList));
    }

}
