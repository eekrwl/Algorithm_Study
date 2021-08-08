package Programmers.Level1;

import java.util.HashMap;

public class Q_42576_완주하지못한선수 {
    public static void main(String[] args) {
        String[] str1={"leo","kiki","eden"};
        String[] str2={"eden","kiki"};
        System.out.print(solution(str1,str2));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer=" ";
        HashMap<String,Integer> map=new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i],map.getOrDefault(participant[i],0)+1);
        }
        for (int i = 0; i < completion.length; i++) {
            map.put(completion[i], map.getOrDefault(completion[i], 0) - 1);
        }
        for (String s : map.keySet()) {
            if(map.get(s)>0) {
                answer = s;
                break;
            }
        }
        return answer;
    }
}
