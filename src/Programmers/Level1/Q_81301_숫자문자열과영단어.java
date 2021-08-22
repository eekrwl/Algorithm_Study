package Programmers.Level1;

import java.util.HashMap;

public class Q_81301_숫자문자열과영단어 {
    public static void main(String[] args) {
        String s="one4seveneight";
        System.out.print(solution(s));
    }

    public static int solution(String s) {
        int answer=0;

        HashMap<String,Character> hash=new HashMap<>();
        hash.put("zero",'0');
        hash.put("one",'1');
        hash.put("two",'2');
        hash.put("three",'3');
        hash.put("four",'4');
        hash.put("five",'5');
        hash.put("six",'6');
        hash.put("seven",'7');
        hash.put("eight",'8');
        hash.put("nine",'9');

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                if (hash.containsKey(s.substring(i, i + 3))) {
                    sb.append(hash.get(s.substring(i, i + 3)));
                    i+=2;
                } else if (hash.containsKey(s.substring(i, i + 4))) {
                    sb.append(hash.get(s.substring(i, i + 4)));
                    i+=3;
                } else if (hash.containsKey(s.substring(i, i + 5))) {
                    sb.append(hash.get(s.substring(i, i + 5)));
                    i+=4;
                } else {

                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        answer=Integer.parseInt(sb.toString());
        return answer;
    }
}

//replaceAll을 쓰자...