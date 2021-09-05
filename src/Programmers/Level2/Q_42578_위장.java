package Programmers.Level2;

import java.util.HashMap;

public class Q_42578_위장 {
    public static void main(String[] args) {
        String[][] c = {{"yellowhat", "headgear"}, {"bluesungalsses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(c));
    }
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1], 0) + 1);
        }
        for (String x : hash.keySet()) {
            answer*=hash.get(x)+1;
        }
        return answer;
    }
}