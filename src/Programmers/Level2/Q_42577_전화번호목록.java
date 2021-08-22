package Programmers.Level2;

import java.util.HashMap;

public class Q_42577_전화번호목록 {
    public static void main(String[] args) {
        String[] str1={"119","97674223","11955524421"};
        String[] str2={"123","456","789"};
        System.out.print(solution(str1)+" "+solution(str2));
    }
    public static boolean solution(String[] phone_book) {
        boolean answer=true;
        HashMap<String,Integer> map=new HashMap<>();

        //해시문제라고 해서 해시썼는데 안쓰고 푸는게 더 빠른거같다
        //일단 다 해시넣고 비교..
        for (String x : phone_book) {
            map.put(x,1);
        }
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    answer = false;
                    return answer;
                }
            }
        }

        /*////시간초과난 내코드..
        for (String x : phone_book) {
            map.put(x,1);
            for (String key : map.keySet()) {
                if (x.length()<key.length() && map.containsKey(key.substring(0, x.length()))) {
                    answer = false;
                    break;
                } else if (x.length() > key.length() && map.containsKey(x.substring(0, key.length()))) {
                    answer=false;
                    break;
                }
            }
            if(answer==false)
                break;
        }*/
        return answer;
    }
}
